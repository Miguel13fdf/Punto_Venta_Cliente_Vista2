
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registrarFacturaConItems complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrarFacturaConItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFactura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPersona" type="{http://ws/}persona" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTipoPago" type="{http://ws/}tipoPago" minOccurs="0"/&gt;
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="itemsFactura" type="{http://ws/}itemFactura" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarFacturaConItems", propOrder = {
    "idFactura",
    "ruc",
    "idPersona",
    "fecha",
    "idTipoPago",
    "descuento",
    "total",
    "itemsFactura"
})
public class RegistrarFacturaConItems {

    protected Integer idFactura;
    protected String ruc;
    protected Persona idPersona;
    protected String fecha;
    protected TipoPago idTipoPago;
    protected Double descuento;
    protected Double total;
    protected List<ItemFactura> itemsFactura;

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
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
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

    /**
     * Gets the value of the itemsFactura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemsFactura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemsFactura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemFactura }
     * 
     * 
     */
    public List<ItemFactura> getItemsFactura() {
        if (itemsFactura == null) {
            itemsFactura = new ArrayList<ItemFactura>();
        }
        return this.itemsFactura;
    }

}
