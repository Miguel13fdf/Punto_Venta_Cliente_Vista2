
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoPago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descrip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_tipo_pago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPago", propOrder = {
    "descrip",
    "idTipoPago",
    "tipo"
})
public class TipoPago {

    protected String descrip;
    @XmlElement(name = "id_tipo_pago")
    protected Integer idTipoPago;
    protected String tipo;

    /**
     * Obtiene el valor de la propiedad descrip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrip() {
        return descrip;
    }

    /**
     * Define el valor de la propiedad descrip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrip(String value) {
        this.descrip = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoPago() {
        return idTipoPago;
    }

    /**
     * Define el valor de la propiedad idTipoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoPago(Integer value) {
        this.idTipoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
