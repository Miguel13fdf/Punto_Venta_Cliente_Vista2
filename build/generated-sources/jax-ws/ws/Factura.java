
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id_factura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="id_persona" type="{http://ws/}persona" minOccurs="0"/&gt;
 *         &lt;element name="id_tipo_pago" type="{http://ws/}tipoPago" minOccurs="0"/&gt;
 *         &lt;element name="ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factura", propOrder = {
    "descuento",
    "fecha",
    "idFactura",
    "idPersona",
    "idTipoPago",
    "ruc",
    "total"
})
public class Factura {

    protected Double descuento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "id_factura")
    protected Integer idFactura;
    @XmlElement(name = "id_persona")
    protected Persona idPersona;
    @XmlElement(name = "id_tipo_pago")
    protected TipoPago idTipoPago;
    protected String ruc;
    protected Double total;

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDescuento(Double value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFactura(Integer value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersona.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getIdPersona() {
        return idPersona;
    }

    /**
     * Define el valor de la propiedad idPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setIdPersona(Persona value) {
        this.idPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoPago.
     * 
     * @return
     *     possible object is
     *     {@link TipoPago }
     *     
     */
    public TipoPago getIdTipoPago() {
        return idTipoPago;
    }

    /**
     * Define el valor de la propiedad idTipoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPago }
     *     
     */
    public void setIdTipoPago(TipoPago value) {
        this.idTipoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad ruc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Define el valor de la propiedad ruc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal(Double value) {
        this.total = value;
    }

}
