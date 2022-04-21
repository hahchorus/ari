//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.21 a las 12:57:26 AM CDT 
//


package https.t4is_uv_mx.agenda;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="agenda" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FLimite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "agenda"
})
@XmlRootElement(name = "EliminarEventoResponse")
public class EliminarEventoResponse {

    @XmlElement(required = true)
    protected List<EliminarEventoResponse.Agenda> agenda;

    /**
     * Gets the value of the agenda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agenda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgenda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EliminarEventoResponse.Agenda }
     * 
     * 
     */
    public List<EliminarEventoResponse.Agenda> getAgenda() {
        if (agenda == null) {
            agenda = new ArrayList<EliminarEventoResponse.Agenda>();
        }
        return this.agenda;
    }


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
     *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FInicio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FLimite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "nombre",
        "fInicio",
        "fLimite"
    })
    public static class Agenda {

        protected int id;
        @XmlElement(name = "Nombre", required = true)
        protected String nombre;
        @XmlElement(name = "FInicio", required = true)
        protected String fInicio;
        @XmlElement(name = "FLimite", required = true)
        protected String fLimite;

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
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad fInicio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFInicio() {
            return fInicio;
        }

        /**
         * Define el valor de la propiedad fInicio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFInicio(String value) {
            this.fInicio = value;
        }

        /**
         * Obtiene el valor de la propiedad fLimite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFLimite() {
            return fLimite;
        }

        /**
         * Define el valor de la propiedad fLimite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFLimite(String value) {
            this.fLimite = value;
        }

    }

}
