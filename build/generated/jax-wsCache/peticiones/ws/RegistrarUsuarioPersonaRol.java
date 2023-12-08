
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registrarUsuarioPersonaRol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrarUsuarioPersonaRol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idPersona" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passwordUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dniPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="celularPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idRol" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoRol" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarUsuarioPersonaRol", propOrder = {
    "idUsuario",
    "idPersona",
    "nombreUsuario",
    "passwordUsuario",
    "nombrePersona",
    "apellidoPersona",
    "dniPersona",
    "celularPersona",
    "correoPersona",
    "idRol",
    "nombreRol",
    "estadoRol"
})
public class RegistrarUsuarioPersonaRol {

    protected int idUsuario;
    protected int idPersona;
    protected String nombreUsuario;
    protected String passwordUsuario;
    protected String nombrePersona;
    protected String apellidoPersona;
    protected String dniPersona;
    protected String celularPersona;
    protected String correoPersona;
    protected int idRol;
    protected String nombreRol;
    protected boolean estadoRol;

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersona.
     * 
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * Define el valor de la propiedad idPersona.
     * 
     */
    public void setIdPersona(int value) {
        this.idPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Define el valor de la propiedad nombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad passwordUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    /**
     * Define el valor de la propiedad passwordUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordUsuario(String value) {
        this.passwordUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Define el valor de la propiedad nombrePersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePersona(String value) {
        this.nombrePersona = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPersona() {
        return apellidoPersona;
    }

    /**
     * Define el valor de la propiedad apellidoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPersona(String value) {
        this.apellidoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad dniPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDniPersona() {
        return dniPersona;
    }

    /**
     * Define el valor de la propiedad dniPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDniPersona(String value) {
        this.dniPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad celularPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelularPersona() {
        return celularPersona;
    }

    /**
     * Define el valor de la propiedad celularPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelularPersona(String value) {
        this.celularPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad correoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoPersona() {
        return correoPersona;
    }

    /**
     * Define el valor de la propiedad correoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoPersona(String value) {
        this.correoPersona = value;
    }

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

}
