
package br.com.ibk.v1.ebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContaBancariaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContaBancariaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numero-agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digito-verificador-agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero-conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digito-verificador-conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="banco" type="{http://ibk.com.br/v1/ebo}BancoType" minOccurs="0"/&gt;
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "ContaBancariaType", propOrder = {
    "codigo",
    "numeroAgencia",
    "digitoVerificadorAgencia",
    "numeroConta",
    "digitoVerificadorConta",
    "banco",
    "saldo",
    "cliente"
})
public class ContaBancariaType {

    protected Integer codigo;
    @XmlElement(name = "numero-agencia")
    protected String numeroAgencia;
    @XmlElement(name = "digito-verificador-agencia")
    protected String digitoVerificadorAgencia;
    @XmlElement(name = "numero-conta")
    protected String numeroConta;
    @XmlElement(name = "digito-verificador-conta")
    protected String digitoVerificadorConta;
    protected BancoType banco;
    protected double saldo;
    protected ClienteType cliente;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigo(Integer value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the numeroAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    /**
     * Sets the value of the numeroAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAgencia(String value) {
        this.numeroAgencia = value;
    }

    /**
     * Gets the value of the digitoVerificadorAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitoVerificadorAgencia() {
        return digitoVerificadorAgencia;
    }

    /**
     * Sets the value of the digitoVerificadorAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitoVerificadorAgencia(String value) {
        this.digitoVerificadorAgencia = value;
    }

    /**
     * Gets the value of the numeroConta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * Sets the value of the numeroConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConta(String value) {
        this.numeroConta = value;
    }

    /**
     * Gets the value of the digitoVerificadorConta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitoVerificadorConta() {
        return digitoVerificadorConta;
    }

    /**
     * Sets the value of the digitoVerificadorConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitoVerificadorConta(String value) {
        this.digitoVerificadorConta = value;
    }

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

    /**
     * Gets the value of the saldo property.
     * 
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Sets the value of the saldo property.
     * 
     */
    public void setSaldo(double value) {
        this.saldo = value;
    }

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
