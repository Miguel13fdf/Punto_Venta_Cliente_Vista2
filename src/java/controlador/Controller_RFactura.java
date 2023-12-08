/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import vistas.RFacturas_view;
import vistas.RevisionProductos_Voew;
import ws.Clasificacion;
import ws.Factura;
import ws.ItemFactura;
import ws.Persona;
import ws.Peticiones;
import ws.Peticiones_Service;
import ws.Producto;
import ws.Proveedores;

/**
 *
 * @author joelu
 */
public class Controller_RFactura {
    int fac=0;
    int producto = 0;
    int item = 0;
    RFacturas_view Rfactura_view;
    RevisionProductos_Voew vision = new RevisionProductos_Voew();

    Peticiones_Service service = new Peticiones_Service();
    Peticiones peti = service.getPeticionesPort();

    public Controller_RFactura(RFacturas_view Rfactura_view) {
        this.Rfactura_view = Rfactura_view;
    }

    public void iniciarcontrol() {
        Rfactura_view.setTitle("Registro Factura");
        Rfactura_view.setVisible(true);
        Rfactura_view.setLocationRelativeTo(null);

        Rfactura_view.getBtnbuscarproducto().addActionListener(l -> buscarprod());
        Rfactura_view.getBtnbuscarpersona().addActionListener(l -> buscarruc());
        Rfactura_view.getBtnRegistrar().addActionListener(l -> registrar());
        Rfactura_view.getTxtdescuento().setText("0.00");

    }

     public void registrar() {
    try {
        String ruc = Rfactura_view.getTxtruc().getText();
        int idpersona = Integer.valueOf(Rfactura_view.getJlabelidpersona().getText());
          int idtipopago = Integer.valueOf(Rfactura_view.getJlabelidpersona().getText());
        Date selecteddate = Rfactura_view.getjDateChooser1().getDate();
        String dateString = "";

        if (selecteddate != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            dateString = sdf.format(selecteddate);
        } else {
            JOptionPane.showMessageDialog(Rfactura_view, "Elige una fecha correcta");
            return;
        }

        XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateString);
        double descuento = Double.parseDouble(Rfactura_view.getTxtdescuento().getText());
        double total = Double.parseDouble(Rfactura_view.getJlabeltotal().getText());

        Factura factura = new Factura();
        fac = fac + 1;
        factura.setIdFactura(fac);
        factura.setFecha(xmlGregorianCalendar);
        factura.setDescuento(descuento);

        DefaultTableModel tableModel = (DefaultTableModel) Rfactura_view.getTblPROD().getModel();
        ArrayList<ItemFactura> itemsFactura = new ArrayList<>();
       
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            int idProducto = Integer.parseInt(tableModel.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(tableModel.getValueAt(i, 1).toString());
            double precioU = Double.parseDouble(tableModel.getValueAt(i, 2).toString());
            double subtotal = Double.parseDouble(tableModel.getValueAt(i, 3).toString());

            ItemFactura itemFactura = new ItemFactura();
            item = item + 1;
            itemFactura.setIdItemFactura(item);
            itemFactura.setIdFcatura(factura);
            itemFactura.setIdProducto(peti.buscarProductoPorId(idProducto));
            itemFactura.setCantidad(cantidad);
            itemFactura.setSubtotal(subtotal);

            itemsFactura.add(itemFactura);
        }

        peti.registrarFacturaConItems(fac, ruc, peti.buscarP(ruc), dateString,  peti.obtenerTipoPagoPorId(idtipopago), descuento, total, itemsFactura);
        JOptionPane.showMessageDialog(Rfactura_view, "Factura registrada con éxito.");
        Rfactura_view.dispose();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(Rfactura_view, "Error al registrar la factura: " + e.getMessage());
    }
}


     public void buscarruc() {
        String ruc = Rfactura_view.getTxtruc().getText();
        Persona idpersona = peti.buscarP(ruc);
        Rfactura_view.getJlabelidpersona().setText(String.valueOf(idpersona));
    }

    public void buscarprod() {
        String id = Rfactura_view.getTxtidproducto().getText();
        try {

            Producto producto = peti.buscarProductoPorId(Integer.parseInt(id));
            Clasificacion clasificacion = producto.getIdClasificacion();
            Proveedores proveedor = producto.getIdProveedor();
            iniciarcontrolrevision(id, producto, clasificacion, proveedor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Rfactura_view, "Coloque correctamente los datos");
        }
    }

    public void iniciarcontrolrevision(String id, Producto producto, Clasificacion clasificacion, Proveedores proveedor) {
        vision.setTitle("Revision");
        vision.setVisible(true);
        vision.setLocationRelativeTo(null);

        noeditable();
        vision.getJlabelidproducto().setText(id);
        vision.getJSpinnerStock().setValue(producto.getStock());
        vision.getTxtprecioU().setText(String.valueOf(producto.getPrecioUnitario()));
        vision.getTxtNombre().setText(producto.getUnidad());
        vision.getjComboCateg().addItem(clasificacion.getGrupo());
        vision.getjComboProveedor().addItem(proveedor.getRuc());
        vision.getjComboiva().addItem(String.valueOf(producto.isIva()));
        vision.getJSpinnercantidad().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("value".equals(evt.getPropertyName())) {
                    double sub = calcularsubtotal();
                    vision.getjLabelsubtotal().setText(String.valueOf(sub));
                }
            }
        });

        vision.getBtnRegistrar().addActionListener(l -> mostrarproductostabla());
        vision.getBtnVolver().addActionListener(l -> vision.dispose());
    }

    public void mostrarproductostabla() {
        try {
            // Obtén los datos de los componentes del JFrame
            String idProducto = vision.getJlabelidproducto().getText();
            int cantidad = (Integer) vision.getJSpinnercantidad().getValue();
            double precioU = Double.parseDouble(vision.getTxtprecioU().getText());

            // Calcula el subtotal
            double subtotal = calcularsubtotal();

            // Crea un nuevo objeto de fila con los datos
            Object[] data = new Object[]{idProducto, cantidad, precioU, subtotal};

            // Obtiene el modelo de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) Rfactura_view.getTblPROD().getModel();

            // Agrega la nueva fila al modelo de la tabla
            modeloTabla.addRow(data);

            // Actualiza el total
            double total = calcularTotal(modeloTabla);
            Rfactura_view.getJlabeltotal().setText(String.valueOf(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vision, "Error al mostrar los productos en la tabla: " + e.getMessage());
        }
    }

    public double calcularTotal(DefaultTableModel modeloTabla) {
        double total = 0.0;
        int rowCount = modeloTabla.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            double subtotal = Double.parseDouble(modeloTabla.getValueAt(i, 5).toString());
            total += subtotal;
        }

        return total;
    }

    public double calcularsubtotal() {
        int cantidad = vision.getJSpinnercantidad().getValue();
        double preciou = Double.parseDouble(vision.getTxtprecioU().getText());

        double sub = cantidad * preciou;
        return sub;
    }

    public void noeditable() {
        vision.getJlabelidproducto().setEnabled(false);
        vision.getJSpinnerStock().setEnabled(false);
        vision.getTxtprecioU().setEditable(false);
        vision.getTxtNombre().setEditable(false);
        vision.getjComboCateg().setEditable(false);
        vision.getjComboProveedor().setEditable(false);
        vision.getjComboiva().setEditable(false);
    }

}
