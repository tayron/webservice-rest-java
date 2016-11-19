
package br.com.ibk.v1.endereco;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibk.v1.endereco package. 
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

    private final static QName _ListarEnderecoOutput_QNAME = new QName("http://ibk.com.br/v1/endereco", "listarEnderecoOutput");
    private final static QName _ListarEnderecoPorIdInput_QNAME = new QName("http://ibk.com.br/v1/endereco", "listarEnderecoPorIdInput");
    private final static QName _ListarEnderecoPorIdOutput_QNAME = new QName("http://ibk.com.br/v1/endereco", "listarEnderecoPorIdOutput");
    private final static QName _InserirEnderecoInput_QNAME = new QName("http://ibk.com.br/v1/endereco", "inserirEnderecoInput");
    private final static QName _InserirEnderecoOutput_QNAME = new QName("http://ibk.com.br/v1/endereco", "inserirEnderecoOutput");
    private final static QName _AlterarEnderecoInput_QNAME = new QName("http://ibk.com.br/v1/endereco", "alterarEnderecoInput");
    private final static QName _AlterarEnderecoOutput_QNAME = new QName("http://ibk.com.br/v1/endereco", "alterarEnderecoOutput");
    private final static QName _RemoverEnderecoInput_QNAME = new QName("http://ibk.com.br/v1/endereco", "removerEnderecoInput");
    private final static QName _RemoverEnderecoOutput_QNAME = new QName("http://ibk.com.br/v1/endereco", "removerEnderecoOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibk.v1.endereco
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarEnderecoOutputType }
     * 
     */
    public ListarEnderecoOutputType createListarEnderecoOutputType() {
        return new ListarEnderecoOutputType();
    }

    /**
     * Create an instance of {@link ListarEnderecoPorIdInputType }
     * 
     */
    public ListarEnderecoPorIdInputType createListarEnderecoPorIdInputType() {
        return new ListarEnderecoPorIdInputType();
    }

    /**
     * Create an instance of {@link ListarEnderecoPorIdOutputType }
     * 
     */
    public ListarEnderecoPorIdOutputType createListarEnderecoPorIdOutputType() {
        return new ListarEnderecoPorIdOutputType();
    }

    /**
     * Create an instance of {@link InserirEnderecoInputType }
     * 
     */
    public InserirEnderecoInputType createInserirEnderecoInputType() {
        return new InserirEnderecoInputType();
    }

    /**
     * Create an instance of {@link InserirEnderecoOutputType }
     * 
     */
    public InserirEnderecoOutputType createInserirEnderecoOutputType() {
        return new InserirEnderecoOutputType();
    }

    /**
     * Create an instance of {@link AlterarEnderecoInputType }
     * 
     */
    public AlterarEnderecoInputType createAlterarEnderecoInputType() {
        return new AlterarEnderecoInputType();
    }

    /**
     * Create an instance of {@link AlterarEnderecoOutputType }
     * 
     */
    public AlterarEnderecoOutputType createAlterarEnderecoOutputType() {
        return new AlterarEnderecoOutputType();
    }

    /**
     * Create an instance of {@link RemoverEnderecoInputType }
     * 
     */
    public RemoverEnderecoInputType createRemoverEnderecoInputType() {
        return new RemoverEnderecoInputType();
    }

    /**
     * Create an instance of {@link RemoverEnderecoOutputType }
     * 
     */
    public RemoverEnderecoOutputType createRemoverEnderecoOutputType() {
        return new RemoverEnderecoOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEnderecoOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/endereco", name = "listarEnderecoOutput")
    public JAXBElement<ListarEnderecoOutputType> createListarEnderecoOutput(ListarEnderecoOutputType value) {
        return new JAXBElement<ListarEnderecoOutputType>(_ListarEnderecoOutput_QNAME, ListarEnderecoOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEnderecoPorIdInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/endereco", name = "listarEnderecoPorIdInput")
    public JAXBElement<ListarEnderecoPorIdInputType> createListarEnderecoPorIdInput(ListarEnderecoPorIdInputType value) {
        return new JAXBElement<ListarEnderecoPorIdInputType>(_ListarEnderecoPorIdInput_QNAME, ListarEnderecoPorIdInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEnderecoPorIdOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/endereco", name = "listarEnderecoPorIdOutput")
    public JAXBElement<ListarEnderecoPorIdOutputType> createListarEnderecoPorIdOutput(ListarEnderecoPorIdOutputType value) {
        return new JAXBElement<ListarEnderecoPorIdOutputType>(_ListarEnderecoPorIdOutput_QNAME, ListarEnderecoPorIdOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirEnderecoInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/endereco", name = "inserirEnderecoInput")
    public JAXBElement<InserirEnderecoInputType> createInserirEnderecoInput(InserirEnderecoInputType value) {
        return new JAXBElement<InserirEnderecoInputType>(_InserirEnderecoInput_QNAME, InserirEnderecoInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirEnderecoOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/endereco", name = "inserirEnderecoOutput")
    public JAXBElement<InserirEnderecoOutputType> createInserirEnderecoOutput(InserirEnderecoOutputType value) {
        return new JAXBElement<InserirEnderecoOutputType>(_InserirEnderecoOutput_QNAME, InserirEnderecoOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarEnderecoInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/endereco", name = "alterarEnderecoInput")
    public JAXBElement<AlterarEnderecoInputType> createAlterarEnderecoInput(AlterarEnderecoInputType value) {
        return new JAXBElement<AlterarEnderecoInputType>(_AlterarEnderecoInput_QNAME, AlterarEnderecoInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarEnderecoOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/endereco", name = "alterarEnderecoOutput")
    public JAXBElement<AlterarEnderecoOutputType> createAlterarEnderecoOutput(AlterarEnderecoOutputType value) {
        return new JAXBElement<AlterarEnderecoOutputType>(_AlterarEnderecoOutput_QNAME, AlterarEnderecoOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverEnderecoInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/endereco", name = "removerEnderecoInput")
    public JAXBElement<RemoverEnderecoInputType> createRemoverEnderecoInput(RemoverEnderecoInputType value) {
        return new JAXBElement<RemoverEnderecoInputType>(_RemoverEnderecoInput_QNAME, RemoverEnderecoInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverEnderecoOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/endereco", name = "removerEnderecoOutput")
    public JAXBElement<RemoverEnderecoOutputType> createRemoverEnderecoOutput(RemoverEnderecoOutputType value) {
        return new JAXBElement<RemoverEnderecoOutputType>(_RemoverEnderecoOutput_QNAME, RemoverEnderecoOutputType.class, null, value);
    }

}
