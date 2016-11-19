
package br.com.ibk.v1.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.ClienteType;


/**
 * <p>Java class for listarClientePorIdOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarClientePorIdOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" type="{http://ibk.com.br/v1/ebo}ClienteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarClientePorIdOutputType", propOrder = {
    "cliente"
})
public class ListarClientePorIdOutputType {

    protected ClienteType cliente;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link ClienteType }
     *     
     */
    public ClienteType getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteType }
     *     
     */
    public void setCliente(ClienteType value) {
        this.cliente = value;
    }

}
