
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registrarCompetenciaRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrarCompetenciaRol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idRol" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoRol" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="idCompetencia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreCompetencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoCompetencia" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="idClasificacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="grupoClasificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarCompetenciaRol", propOrder = {
    "idRol",
    "nombreRol",
    "estadoRol",
    "idCompetencia",
    "nombreCompetencia",
    "estadoCompetencia",
    "idClasificacion",
    "grupoClasificacion"
})
public class RegistrarCompetenciaRol {

    protected int idRol;
    protected String nombreRol;
    protected boolean estadoRol;
    protected int idCompetencia;
    protected String nombreCompetencia;
    protected boolean estadoCompetencia;
    protected int idClasificacion;
    protected String grupoClasificacion;

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     */
    public void setIdRol(int value) {
        this.idRol = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRol() {
        return nombreRol;
    }

    /**
     * Define el valor de la propiedad nombreRol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRol(String value) {
        this.nombreRol = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoRol.
     * 
     */
    public boolean isEstadoRol() {
        return estadoRol;
    }

    /**
     * Define el valor de la propiedad estadoRol.
     * 
     */
    public void setEstadoRol(boolean value) {
        this.estadoRol = value;
    }

    /**
     * Obtiene el valor de la propiedad idCompetencia.
     * 
     */
    public int getIdCompetencia() {
        return idCompetencia;
    }

    /**
     * Define el valor de la propiedad idCompetencia.
     * 
     */
    public void setIdCompetencia(int value) {
        this.idCompetencia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCompetencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompetencia() {
        return nombreCompetencia;
    }

    /**
     * Define el valor de la propiedad nombreCompetencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompetencia(String value) {
        this.nombreCompetencia = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCompetencia.
     * 
     */
    public boolean isEstadoCompetencia() {
        return estadoCompetencia;
    }

    /**
     * Define el valor de la propiedad estadoCompetencia.
     * 
     */
    public void setEstadoCompetencia(boolean value) {
        this.estadoCompetencia = value;
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

    /**
     * Obtiene el valor de la propiedad grupoClasificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoClasificacion() {
        return grupoClasificacion;
    }

    /**
     * Define el valor de la propiedad grupoClasificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoClasificacion(String value) {
        this.grupoClasificacion = value;
    }

}
