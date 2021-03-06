
package br.com.ibk.v1.contabancaria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.ContaBancariaType;


/**
 * <p>Java class for inserirContaBancariaInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inserirContaBancariaInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contabancaria" type="{http://ibk.com.br/v1/ebo}ContaBancariaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirContaBancariaInputType", propOrder = {
    "contabancaria"
})
public class InserirContaBancariaInputType {

    @XmlElement(required = true)
    protected ContaBancariaType contabancaria;

    /**
     * Gets the value of the contabancaria property.
     * 
     * @return
     *     possible object is
     *     {@link ContaBancariaType }
     *     
     */
    public ContaBancariaType getContabancaria() {
        return contabancaria;
    }

    /**
     * Sets the value of the contabancaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaBancariaType }
     *     
     */
    public void setContabancaria(ContaBancariaType value) {
        this.contabancaria = value;
    }

}
