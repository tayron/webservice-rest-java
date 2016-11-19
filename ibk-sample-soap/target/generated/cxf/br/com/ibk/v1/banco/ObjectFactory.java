
package br.com.ibk.v1.banco;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibk.v1.banco package. 
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

    private final static QName _ListarBancoOutput_QNAME = new QName("http://ibk.com.br/v1/banco", "listarBancoOutput");
    private final static QName _ListarBancoPorIdInput_QNAME = new QName("http://ibk.com.br/v1/banco", "listarBancoPorIdInput");
    private final static QName _ListarBancoPorIdOutput_QNAME = new QName("http://ibk.com.br/v1/banco", "listarBancoPorIdOutput");
    private final static QName _InserirBancoInput_QNAME = new QName("http://ibk.com.br/v1/banco", "inserirBancoInput");
    private final static QName _InserirBancoOutput_QNAME = new QName("http://ibk.com.br/v1/banco", "inserirBancoOutput");
    private final static QName _AlterarBancoInput_QNAME = new QName("http://ibk.com.br/v1/banco", "alterarBancoInput");
    private final static QName _AlterarBancoOutput_QNAME = new QName("http://ibk.com.br/v1/banco", "alterarBancoOutput");
    private final static QName _RemoverBancoInput_QNAME = new QName("http://ibk.com.br/v1/banco", "removerBancoInput");
    private final static QName _RemoverBancoOutput_QNAME = new QName("http://ibk.com.br/v1/banco", "removerBancoOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibk.v1.banco
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarBancoOutputType }
     * 
     */
    public ListarBancoOutputType createListarBancoOutputType() {
        return new ListarBancoOutputType();
    }

    /**
     * Create an instance of {@link ListarBancoPorIdInputType }
     * 
     */
    public ListarBancoPorIdInputType createListarBancoPorIdInputType() {
        return new ListarBancoPorIdInputType();
    }

    /**
     * Create an instance of {@link ListarBancoPorIdOutputType }
     * 
     */
    public ListarBancoPorIdOutputType createListarBancoPorIdOutputType() {
        return new ListarBancoPorIdOutputType();
    }

    /**
     * Create an instance of {@link InserirBancoInputType }
     * 
     */
    public InserirBancoInputType createInserirBancoInputType() {
        return new InserirBancoInputType();
    }

    /**
     * Create an instance of {@link InserirBancoOutputType }
     * 
     */
    public InserirBancoOutputType createInserirBancoOutputType() {
        return new InserirBancoOutputType();
    }

    /**
     * Create an instance of {@link AlterarBancoInputType }
     * 
     */
    public AlterarBancoInputType createAlterarBancoInputType() {
        return new AlterarBancoInputType();
    }

    /**
     * Create an instance of {@link AlterarBancoOutputType }
     * 
     */
    public AlterarBancoOutputType createAlterarBancoOutputType() {
        return new AlterarBancoOutputType();
    }

    /**
     * Create an instance of {@link RemoverBancoInputType }
     * 
     */
    public RemoverBancoInputType createRemoverBancoInputType() {
        return new RemoverBancoInputType();
    }

    /**
     * Create an instance of {@link RemoverBancoOutputType }
     * 
     */
    public RemoverBancoOutputType createRemoverBancoOutputType() {
        return new RemoverBancoOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarBancoOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/banco", name = "listarBancoOutput")
    public JAXBElement<ListarBancoOutputType> createListarBancoOutput(ListarBancoOutputType value) {
        return new JAXBElement<ListarBancoOutputType>(_ListarBancoOutput_QNAME, ListarBancoOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarBancoPorIdInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/banco", name = "listarBancoPorIdInput")
    public JAXBElement<ListarBancoPorIdInputType> createListarBancoPorIdInput(ListarBancoPorIdInputType value) {
        return new JAXBElement<ListarBancoPorIdInputType>(_ListarBancoPorIdInput_QNAME, ListarBancoPorIdInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarBancoPorIdOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/banco", name = "listarBancoPorIdOutput")
    public JAXBElement<ListarBancoPorIdOutputType> createListarBancoPorIdOutput(ListarBancoPorIdOutputType value) {
        return new JAXBElement<ListarBancoPorIdOutputType>(_ListarBancoPorIdOutput_QNAME, ListarBancoPorIdOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirBancoInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/banco", name = "inserirBancoInput")
    public JAXBElement<InserirBancoInputType> createInserirBancoInput(InserirBancoInputType value) {
        return new JAXBElement<InserirBancoInputType>(_InserirBancoInput_QNAME, InserirBancoInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirBancoOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/banco", name = "inserirBancoOutput")
    public JAXBElement<InserirBancoOutputType> createInserirBancoOutput(InserirBancoOutputType value) {
        return new JAXBElement<InserirBancoOutputType>(_InserirBancoOutput_QNAME, InserirBancoOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarBancoInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/banco", name = "alterarBancoInput")
    public JAXBElement<AlterarBancoInputType> createAlterarBancoInput(AlterarBancoInputType value) {
        return new JAXBElement<AlterarBancoInputType>(_AlterarBancoInput_QNAME, AlterarBancoInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarBancoOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/banco", name = "alterarBancoOutput")
    public JAXBElement<AlterarBancoOutputType> createAlterarBancoOutput(AlterarBancoOutputType value) {
        return new JAXBElement<AlterarBancoOutputType>(_AlterarBancoOutput_QNAME, AlterarBancoOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverBancoInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/banco", name = "removerBancoInput")
    public JAXBElement<RemoverBancoInputType> createRemoverBancoInput(RemoverBancoInputType value) {
        return new JAXBElement<RemoverBancoInputType>(_RemoverBancoInput_QNAME, RemoverBancoInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverBancoOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/banco", name = "removerBancoOutput")
    public JAXBElement<RemoverBancoOutputType> createRemoverBancoOutput(RemoverBancoOutputType value) {
        return new JAXBElement<RemoverBancoOutputType>(_RemoverBancoOutput_QNAME, RemoverBancoOutputType.class, null, value);
    }

}
