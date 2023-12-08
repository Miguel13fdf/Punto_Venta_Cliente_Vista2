
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarGrupoClasificacionPorID complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarGrupoClasificacionPorID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idClasificacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarGrupoClasificacionPorID", propOrder = {
    "idClasificacion"
})
public class BuscarGrupoClasificacionPorID {

    protected int idClasificacion;

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
