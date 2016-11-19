
package br.com.ibk.v1.contabancaria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.ContaBancariaTypeArrayOf;


/**
 * <p>Java class for listarContaBancariaOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarContaBancariaOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lista-contabancaria" type="{http://ibk.com.br/v1/ebo}ContaBancariaTypeArrayOf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarContaBancariaOutputType", propOrder = {
    "listaContabancaria"
})
public class ListarContaBancariaOutputType {

    @XmlElement(name = "lista-contabancaria")
    protected ContaBancariaTypeArrayOf listaContabancaria;

    /**
     * Gets the value of the listaContabancaria property.
     * 
     * @return
     *     possible object is
     *     {@link ContaBancariaTypeArrayOf }
     *     
     */
    public ContaBancariaTypeArrayOf getListaContabancaria() {
        return listaContabancaria;
    }

    /**
     * Sets the value of the listaContabancaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaBancariaTypeArrayOf }
     *     
     */
    public void setListaContabancaria(ContaBancariaTypeArrayOf value) {
        this.listaContabancaria = value;
    }

}
