
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AgregarHistorial2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AgregarHistorial2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="palabra1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="palabra2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contenido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgregarHistorial2", propOrder = {
    "palabra1",
    "nombre",
    "palabra2",
    "contenido"
})
public class AgregarHistorial2 {

    protected String palabra1;
    protected String nombre;
    protected String palabra2;
    protected String contenido;

    /**
     * Obtiene el valor de la propiedad palabra1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalabra1() {
        return palabra1;
    }

    /**
     * Define el valor de la propiedad palabra1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalabra1(String value) {
        this.palabra1 = value;
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
     * Obtiene el valor de la propiedad palabra2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalabra2() {
        return palabra2;
    }

    /**
     * Define el valor de la propiedad palabra2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalabra2(String value) {
        this.palabra2 = value;
    }

    /**
     * Obtiene el valor de la propiedad contenido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Define el valor de la propiedad contenido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenido(String value) {
        this.contenido = value;
    }

}
