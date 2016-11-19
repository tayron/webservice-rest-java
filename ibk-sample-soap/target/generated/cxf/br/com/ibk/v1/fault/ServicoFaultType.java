
package br.com.ibk.v1.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicoFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicoFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servico-erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servico-erro-descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="negocio-erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="negocio-erro-descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicoFaultType", propOrder = {
    "servicoErro",
    "servicoErroDescricao",
    "negocioErro",
    "negocioErroDescricao"
})
public class ServicoFaultType {

    @XmlElement(name = "servico-erro")
    protected String servicoErro;
    @XmlElement(name = "servico-erro-descricao")
    protected String servicoErroDescricao;
    @XmlElement(name = "negocio-erro")
    protected String negocioErro;
    @XmlElement(name = "negocio-erro-descricao")
    protected String negocioErroDescricao;

    /**
     * Gets the value of the servicoErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicoErro() {
        return servicoErro;
    }

    /**
     * Sets the value of the servicoErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicoErro(String value) {
        this.servicoErro = value;
    }

    /**
     * Gets the value of the servicoErroDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicoErroDescricao() {
        return servicoErroDescricao;
    }

    /**
     * Sets the value of the servicoErroDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicoErroDescricao(String value) {
        this.servicoErroDescricao = value;
    }

    /**
     * Gets the value of the negocioErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegocioErro() {
        return negocioErro;
    }

    /**
     * Sets the value of the negocioErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegocioErro(String value) {
        this.negocioErro = value;
    }

    /**
     * Gets the value of the negocioErroDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegocioErroDescricao() {
        return negocioErroDescricao;
    }

    /**
     * Sets the value of the negocioErroDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegocioErroDescricao(String value) {
        this.negocioErroDescricao = value;
    }

}
