
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="precioUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idClasificacion" type="{http://ws/}clasificacion" minOccurs="0"/&gt;
 *         &lt;element name="idProveedor" type="{http://ws/}proveedores" minOccurs="0"/&gt;
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearProducto", propOrder = {
    "idProducto",
    "stock",
    "precioUnitario",
    "unidad",
    "idClasificacion",
    "idProveedor",
    "iva",
    "foto"
})
public class CrearProducto {

    protected int idProducto;
    protected int stock;
    protected double precioUnitario;
    protected String unidad;
    protected Clasificacion idClasificacion;
    protected Proveedores idProveedor;
    protected boolean iva;
    protected String foto;

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     */
    public void setIdProducto(int value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad stock.
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Define el valor de la propiedad stock.
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitario.
     * 
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Define el valor de la propiedad precioUnitario.
     * 
     */
    public void setPrecioUnitario(double value) {
        this.precioUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idClasificacion.
     * 
     * @return
     *     possible object is
     *     {@link Clasificacion }
     *     
     */
    public Clasificacion getIdClasificacion() {
        return idClasificacion;
    }

    /**
     * Define el valor de la propiedad idClasificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Clasificacion }
     *     
     */
    public void setIdClasificacion(Clasificacion value) {
        this.idClasificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idProveedor.
     * 
     * @return
     *     possible object is
     *     {@link Proveedores }
     *     
     */
    public Proveedores getIdProveedor() {
        return idProveedor;
    }

    /**
     * Define el valor de la propiedad idProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Proveedores }
     *     
     */
    public void setIdProveedor(Proveedores value) {
        this.idProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     */
    public boolean isIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     */
    public void setIva(boolean value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoto(String value) {
        this.foto = value;
    }

}
