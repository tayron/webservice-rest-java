
package br.com.ibk.v1.endereco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.EnderecoTypeArrayOf;


/**
 * <p>Java class for listarEnderecoOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarEnderecoOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lista-endereco" type="{http://ibk.com.br/v1/ebo}EnderecoTypeArrayOf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarEnderecoOutputType", propOrder = {
    "listaEndereco"
})
public class ListarEnderecoOutputType {

    @XmlElement(name = "lista-endereco")
    protected EnderecoTypeArrayOf listaEndereco;

    /**
     * Gets the value of the listaEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoTypeArrayOf }
     *     
     */
    public EnderecoTypeArrayOf getListaEndereco() {
        return listaEndereco;
    }

    /**
     * Sets the value of the listaEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoTypeArrayOf }
     *     
     */
    public void setListaEndereco(EnderecoTypeArrayOf value) {
        this.listaEndereco = value;
    }

}
