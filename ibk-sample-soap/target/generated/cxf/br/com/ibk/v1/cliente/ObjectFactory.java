
package br.com.ibk.v1.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibk.v1.cliente package. 
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

    private final static QName _ListarClienteOutput_QNAME = new QName("http://ibk.com.br/v1/cliente", "listarClienteOutput");
    private final static QName _ListarClientePorIdInput_QNAME = new QName("http://ibk.com.br/v1/cliente", "listarClientePorIdInput");
    private final static QName _ListarClientePorIdOutput_QNAME = new QName("http://ibk.com.br/v1/cliente", "listarClientePorIdOutput");
    private final static QName _InserirClienteInput_QNAME = new QName("http://ibk.com.br/v1/cliente", "inserirClienteInput");
    private final static QName _InserirClienteOutput_QNAME = new QName("http://ibk.com.br/v1/cliente", "inserirClienteOutput");
    private final static QName _AlterarClienteInput_QNAME = new QName("http://ibk.com.br/v1/cliente", "alterarClienteInput");
    private final static QName _AlterarClienteOutput_QNAME = new QName("http://ibk.com.br/v1/cliente", "alterarClienteOutput");
    private final static QName _RemoverClienteInput_QNAME = new QName("http://ibk.com.br/v1/cliente", "removerClienteInput");
    private final static QName _RemoverClienteOutput_QNAME = new QName("http://ibk.com.br/v1/cliente", "removerClienteOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibk.v1.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarClienteOutputType }
     * 
     */
    public ListarClienteOutputType createListarClienteOutputType() {
        return new ListarClienteOutputType();
    }

    /**
     * Create an instance of {@link ListarClientePorIdInputType }
     * 
     */
    public ListarClientePorIdInputType createListarClientePorIdInputType() {
        return new ListarClientePorIdInputType();
    }

    /**
     * Create an instance of {@link ListarClientePorIdOutputType }
     * 
     */
    public ListarClientePorIdOutputType createListarClientePorIdOutputType() {
        return new ListarClientePorIdOutputType();
    }

    /**
     * Create an instance of {@link InserirClienteInputType }
     * 
     */
    public InserirClienteInputType createInserirClienteInputType() {
        return new InserirClienteInputType();
    }

    /**
     * Create an instance of {@link InserirClienteOutputType }
     * 
     */
    public InserirClienteOutputType createInserirClienteOutputType() {
        return new InserirClienteOutputType();
    }

    /**
     * Create an instance of {@link AlterarClienteInputType }
     * 
     */
    public AlterarClienteInputType createAlterarClienteInputType() {
        return new AlterarClienteInputType();
    }

    /**
     * Create an instance of {@link AlterarClienteOutputType }
     * 
     */
    public AlterarClienteOutputType createAlterarClienteOutputType() {
        return new AlterarClienteOutputType();
    }

    /**
     * Create an instance of {@link RemoverClienteInputType }
     * 
     */
    public RemoverClienteInputType createRemoverClienteInputType() {
        return new RemoverClienteInputType();
    }

    /**
     * Create an instance of {@link RemoverClienteOutputType }
     * 
     */
    public RemoverClienteOutputType createRemoverClienteOutputType() {
        return new RemoverClienteOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClienteOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/cliente", name = "listarClienteOutput")
    public JAXBElement<ListarClienteOutputType> createListarClienteOutput(ListarClienteOutputType value) {
        return new JAXBElement<ListarClienteOutputType>(_ListarClienteOutput_QNAME, ListarClienteOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientePorIdInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/cliente", name = "listarClientePorIdInput")
    public JAXBElement<ListarClientePorIdInputType> createListarClientePorIdInput(ListarClientePorIdInputType value) {
        return new JAXBElement<ListarClientePorIdInputType>(_ListarClientePorIdInput_QNAME, ListarClientePorIdInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientePorIdOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/cliente", name = "listarClientePorIdOutput")
    public JAXBElement<ListarClientePorIdOutputType> createListarClientePorIdOutput(ListarClientePorIdOutputType value) {
        return new JAXBElement<ListarClientePorIdOutputType>(_ListarClientePorIdOutput_QNAME, ListarClientePorIdOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirClienteInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/cliente", name = "inserirClienteInput")
    public JAXBElement<InserirClienteInputType> createInserirClienteInput(InserirClienteInputType value) {
        return new JAXBElement<InserirClienteInputType>(_InserirClienteInput_QNAME, InserirClienteInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirClienteOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/cliente", name = "inserirClienteOutput")
    public JAXBElement<InserirClienteOutputType> createInserirClienteOutput(InserirClienteOutputType value) {
        return new JAXBElement<InserirClienteOutputType>(_InserirClienteOutput_QNAME, InserirClienteOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarClienteInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/cliente", name = "alterarClienteInput")
    public JAXBElement<AlterarClienteInputType> createAlterarClienteInput(AlterarClienteInputType value) {
        return new JAXBElement<AlterarClienteInputType>(_AlterarClienteInput_QNAME, AlterarClienteInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarClienteOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/cliente", name = "alterarClienteOutput")
    public JAXBElement<AlterarClienteOutputType> createAlterarClienteOutput(AlterarClienteOutputType value) {
        return new JAXBElement<AlterarClienteOutputType>(_AlterarClienteOutput_QNAME, AlterarClienteOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverClienteInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/cliente", name = "removerClienteInput")
    public JAXBElement<RemoverClienteInputType> createRemoverClienteInput(RemoverClienteInputType value) {
        return new JAXBElement<RemoverClienteInputType>(_RemoverClienteInput_QNAME, RemoverClienteInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverClienteOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/cliente", name = "removerClienteOutput")
    public JAXBElement<RemoverClienteOutputType> createRemoverClienteOutput(RemoverClienteOutputType value) {
        return new JAXBElement<RemoverClienteOutputType>(_RemoverClienteOutput_QNAME, RemoverClienteOutputType.class, null, value);
    }

}
