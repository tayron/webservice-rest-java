
package br.com.ibk.v1.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibk.v1.fault package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServicoFault_QNAME = new QName("http://ibk.com.br/v1/fault", "servicoFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibk.v1.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicoFaultType }
     * 
     */
    public ServicoFaultType createServicoFaultType() {
        return new ServicoFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicoFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/fault", name = "servicoFault")
    public JAXBElement<ServicoFaultType> createServicoFault(ServicoFaultType value) {
        return new JAXBElement<ServicoFaultType>(_ServicoFault_QNAME, ServicoFaultType.class, null, value);
    }

}
