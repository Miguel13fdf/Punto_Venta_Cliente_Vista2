
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clasificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clasificacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_clasificacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clasificacion", propOrder = {
    "grupo",
    "idClasificacion"
})
public class Clasificacion {

    protected String grupo;
    @XmlElement(name = "id_clasificacion")
    protected int idClasificacion;

    /**
     * Obtiene el valor de la propiedad grupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Define el valor de la propiedad grupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupo(String value) {
        this.grupo = value;
    }

    /**
     * Obtiene el valor de la propiedad idClasificacion.
     * 
     */
    public int getIdClasificacion() {
        return idClasificacion;
    }

    /**
     * Define el valor de la propiedad idClasificacion.
     * 
     */
    public void setIdClasificacion(int value) {
        this.idClasificacion = value;
    }

}
