//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.21 a las 12:57:26 AM CDT 
//


package https.t4is_uv_mx.agenda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nuevoNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevaFInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevaFLimite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "nuevoNombre",
    "nuevaFInicio",
    "nuevaFLimite"
})
@XmlRootElement(name = "ModificarEventoRequest")
public class ModificarEventoRequest {

    protected int id;
    @XmlElement(required = true)
    protected String nuevoNombre;
    @XmlElement(required = true)
    protected String nuevaFInicio;
    @XmlElement(required = true)
    protected String nuevaFLimite;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoNombre() {
        return nuevoNombre;
    }

    /**
     * Define el valor de la propiedad nuevoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoNombre(String value) {
        this.nuevoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaFInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaFInicio() {
        return nuevaFInicio;
    }

    /**
     * Define el valor de la propiedad nuevaFInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaFInicio(String value) {
        this.nuevaFInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaFLimite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaFLimite() {
        return nuevaFLimite;
    }

    /**
     * Define el valor de la propiedad nuevaFLimite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaFLimite(String value) {
        this.nuevaFLimite = value;
    }

}
