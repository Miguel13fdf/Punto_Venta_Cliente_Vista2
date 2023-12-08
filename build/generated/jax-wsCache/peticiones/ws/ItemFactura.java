
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_fcatura" type="{http://ws/}factura" minOccurs="0"/&gt;
 *         &lt;element name="id_item_factura" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_producto" type="{http://ws/}producto" minOccurs="0"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemFactura", propOrder = {
    "cantidad",
    "idFcatura",
    "idItemFactura",
    "idProducto",
    "precio",
    "subtotal"
})
public class ItemFactura {

    protected int cantidad;
    @XmlElement(name = "id_fcatura")
    protected Factura idFcatura;
    @XmlElement(name = "id_item_factura")
    protected int idItemFactura;
    @XmlElement(name = "id_producto")
    protected Producto idProducto;
    protected double precio;
    protected double subtotal;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idFcatura.
     * 
     * @return
     *     possible object is
     *     {@link Factura }
     *     
     */
    public Factura getIdFcatura() {
        return idFcatura;
    }

    /**
     * Define el valor de la propiedad idFcatura.
     * 
     * @param value
     *     allowed object is
     *     {@link Factura }
     *     
     */
    public void setIdFcatura(Factura value) {
        this.idFcatura = value;
    }

    /**
     * Obtiene el valor de la propiedad idItemFactura.
     * 
     */
    public int getIdItemFactura() {
        return idItemFactura;
    }

    /**
     * Define el valor de la propiedad idItemFactura.
     * 
     */
    public void setIdItemFactura(int value) {
        this.idItemFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setIdProducto(Producto value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotal.
     * 
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     */
    public void setSubtotal(double value) {
        this.subtotal = value;
    }

}
