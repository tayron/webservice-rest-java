
package br.com.ibk.v1.banco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.BancoTypeArrayOf;


/**
 * <p>Java class for listarBancoOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarBancoOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lista-banco" type="{http://ibk.com.br/v1/ebo}BancoTypeArrayOf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarBancoOutputType", propOrder = {
    "listaBanco"
})
public class ListarBancoOutputType {

    @XmlElement(name = "lista-banco")
    protected BancoTypeArrayOf listaBanco;

    /**
     * Gets the value of the listaBanco property.
     * 
     * @return
     *     possible object is
     *     {@link BancoTypeArrayOf }
     *     
     */
    public BancoTypeArrayOf getListaBanco() {
        return listaBanco;
    }

    /**
     * Sets the value of the listaBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link BancoTypeArrayOf }
     *     
     */
    public void setListaBanco(BancoTypeArrayOf value) {
        this.listaBanco = value;
    }

}
