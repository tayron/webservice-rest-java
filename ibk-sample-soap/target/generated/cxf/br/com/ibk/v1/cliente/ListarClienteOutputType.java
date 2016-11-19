
package br.com.ibk.v1.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.ClienteTypeArrayOf;


/**
 * <p>Java class for listarClienteOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarClienteOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lista-cliente" type="{http://ibk.com.br/v1/ebo}ClienteTypeArrayOf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarClienteOutputType", propOrder = {
    "listaCliente"
})
public class ListarClienteOutputType {

    @XmlElement(name = "lista-cliente")
    protected ClienteTypeArrayOf listaCliente;

    /**
     * Gets the value of the listaCliente property.
     * 
     * @return
     *     possible object is
     *     {@link ClienteTypeArrayOf }
     *     
     */
    public ClienteTypeArrayOf getListaCliente() {
        return listaCliente;
    }

    /**
     * Sets the value of the listaCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteTypeArrayOf }
     *     
     */
    public void setListaCliente(ClienteTypeArrayOf value) {
        this.listaCliente = value;
    }

}
