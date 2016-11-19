
package br.com.ibk.v1.ebo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContaBancariaTypeArrayOf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContaBancariaTypeArrayOf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conta-bancaria" type="{http://ibk.com.br/v1/ebo}ContaBancariaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContaBancariaTypeArrayOf", propOrder = {
    "contaBancaria"
})
public class ContaBancariaTypeArrayOf {

    @XmlElement(name = "conta-bancaria")
    protected List<ContaBancariaType> contaBancaria;

    /**
     * Gets the value of the contaBancaria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contaBancaria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContaBancaria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContaBancariaType }
     * 
     * 
     */
    public List<ContaBancariaType> getContaBancaria() {
        if (contaBancaria == null) {
            contaBancaria = new ArrayList<ContaBancariaType>();
        }
        return this.contaBancaria;
    }

}
