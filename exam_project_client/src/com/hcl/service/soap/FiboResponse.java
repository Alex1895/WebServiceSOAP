
package com.hcl.service.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fiboResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fiboResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fibo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fiboResponse", propOrder = {
    "fibo"
})
public class FiboResponse {

    protected int fibo;

    /**
     * Obtiene el valor de la propiedad fibo.
     * 
     */
    public int getFibo() {
        return fibo;
    }

    /**
     * Define el valor de la propiedad fibo.
     * 
     */
    public void setFibo(int value) {
        this.fibo = value;
    }

}
