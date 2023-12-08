package controlador;

import vistas.Factura_Viewer;
import vistas.Login_View;
import vistas.RFacturas_view;

/**
 *
 * @author joelu
 */
public class Controller_Factura {
    Factura_Viewer facturaview;

    public Controller_Factura(Factura_Viewer facturaview) {
        this.facturaview = facturaview;
    }
    
    public void iniciarcontrol(){
        facturaview.setVisible(true);
        facturaview.getBtnCrear().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RFacturas_view rl = new RFacturas_view();
                Controller_RFactura cr1 = new Controller_RFactura(rl);
                cr1.iniciarcontrol();
            }
        });
    }
}
