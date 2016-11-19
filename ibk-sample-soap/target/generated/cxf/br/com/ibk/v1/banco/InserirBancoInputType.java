
package br.com.ibk.v1.banco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.BancoType;


/**
 * <p>Java class for inserirBancoInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inserirBancoInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="banco" type="{http://ibk.com.br/v1/ebo}BancoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirBancoInputType", propOrder = {
    "banco"
})
public class InserirBancoInputType {

    @XmlElement(required = true)
    protected BancoType banco;

    /**
     * Gets the value of the banco property.
     * 
     * @return
     *     possible object is
     *     {@link BancoType }
     *     
     */
    public BancoType getBanco() {
        return banco;
    }

    /**
     * Sets the value of the banco property.
     * 
     * @param value
     *     allowed object is
     *     {@link BancoType }
     *     
     */
    public void setBanco(BancoType value) {
        this.banco = value;
    }

}
