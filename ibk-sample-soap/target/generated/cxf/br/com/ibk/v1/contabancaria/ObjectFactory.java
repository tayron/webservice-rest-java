
package br.com.ibk.v1.contabancaria;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibk.v1.contabancaria package. 
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

    private final static QName _ListarContaBancariaOutput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "listarContaBancariaOutput");
    private final static QName _ListarContaBancariaPorIdInput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "listarContaBancariaPorIdInput");
    private final static QName _ListarContaBancariaPorIdOutput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "listarContaBancariaPorIdOutput");
    private final static QName _InserirContaBancariaInput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "inserirContaBancariaInput");
    private final static QName _InserirContaBancariaOutput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "inserirContaBancariaOutput");
    private final static QName _AlterarContaBancariaInput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "alterarContaBancariaInput");
    private final static QName _AlterarContaBancariaOutput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "alterarContaBancariaOutput");
    private final static QName _RemoverContaBancariaInput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "removerContaBancariaInput");
    private final static QName _RemoverContaBancariaOutput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "removerContaBancariaOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibk.v1.contabancaria
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarContaBancariaOutputType }
     * 
     */
    public ListarContaBancariaOutputType createListarContaBancariaOutputType() {
        return new ListarContaBancariaOutputType();
    }

    /**
     * Create an instance of {@link ListarContaBancariaPorIdInputType }
     * 
     */
    public ListarContaBancariaPorIdInputType createListarContaBancariaPorIdInputType() {
        return new ListarContaBancariaPorIdInputType();
    }

    /**
     * Create an instance of {@link ListarContaBancariaPorIdOutputType }
     * 
     */
    public ListarContaBancariaPorIdOutputType createListarContaBancariaPorIdOutputType() {
        return new ListarContaBancariaPorIdOutputType();
    }

    /**
     * Create an instance of {@link InserirContaBancariaInputType }
     * 
     */
    public InserirContaBancariaInputType createInserirContaBancariaInputType() {
        return new InserirContaBancariaInputType();
    }

    /**
     * Create an instance of {@link InserirContaBancariaOutputType }
     * 
     */
    public InserirContaBancariaOutputType createInserirContaBancariaOutputType() {
        return new InserirContaBancariaOutputType();
    }

    /**
     * Create an instance of {@link AlterarContaBancariaInputType }
     * 
     */
    public AlterarContaBancariaInputType createAlterarContaBancariaInputType() {
        return new AlterarContaBancariaInputType();
    }

    /**
     * Create an instance of {@link AlterarContaBancariaOutputType }
     * 
     */
    public AlterarContaBancariaOutputType createAlterarContaBancariaOutputType() {
        return new AlterarContaBancariaOutputType();
    }

    /**
     * Create an instance of {@link RemoverContaBancariaInputType }
     * 
     */
    public RemoverContaBancariaInputType createRemoverContaBancariaInputType() {
        return new RemoverContaBancariaInputType();
    }

    /**
     * Create an instance of {@link RemoverContaBancariaOutputType }
     * 
     */
    public RemoverContaBancariaOutputType createRemoverContaBancariaOutputType() {
        return new RemoverContaBancariaOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarContaBancariaOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "listarContaBancariaOutput")
    public JAXBElement<ListarContaBancariaOutputType> createListarContaBancariaOutput(ListarContaBancariaOutputType value) {
        return new JAXBElement<ListarContaBancariaOutputType>(_ListarContaBancariaOutput_QNAME, ListarContaBancariaOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarContaBancariaPorIdInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "listarContaBancariaPorIdInput")
    public JAXBElement<ListarContaBancariaPorIdInputType> createListarContaBancariaPorIdInput(ListarContaBancariaPorIdInputType value) {
        return new JAXBElement<ListarContaBancariaPorIdInputType>(_ListarContaBancariaPorIdInput_QNAME, ListarContaBancariaPorIdInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarContaBancariaPorIdOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "listarContaBancariaPorIdOutput")
    public JAXBElement<ListarContaBancariaPorIdOutputType> createListarContaBancariaPorIdOutput(ListarContaBancariaPorIdOutputType value) {
        return new JAXBElement<ListarContaBancariaPorIdOutputType>(_ListarContaBancariaPorIdOutput_QNAME, ListarContaBancariaPorIdOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirContaBancariaInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "inserirContaBancariaInput")
    public JAXBElement<InserirContaBancariaInputType> createInserirContaBancariaInput(InserirContaBancariaInputType value) {
        return new JAXBElement<InserirContaBancariaInputType>(_InserirContaBancariaInput_QNAME, InserirContaBancariaInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirContaBancariaOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "inserirContaBancariaOutput")
    public JAXBElement<InserirContaBancariaOutputType> createInserirContaBancariaOutput(InserirContaBancariaOutputType value) {
        return new JAXBElement<InserirContaBancariaOutputType>(_InserirContaBancariaOutput_QNAME, InserirContaBancariaOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarContaBancariaInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "alterarContaBancariaInput")
    public JAXBElement<AlterarContaBancariaInputType> createAlterarContaBancariaInput(AlterarContaBancariaInputType value) {
        return new JAXBElement<AlterarContaBancariaInputType>(_AlterarContaBancariaInput_QNAME, AlterarContaBancariaInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarContaBancariaOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "alterarContaBancariaOutput")
    public JAXBElement<AlterarContaBancariaOutputType> createAlterarContaBancariaOutput(AlterarContaBancariaOutputType value) {
        return new JAXBElement<AlterarContaBancariaOutputType>(_AlterarContaBancariaOutput_QNAME, AlterarContaBancariaOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverContaBancariaInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "removerContaBancariaInput")
    public JAXBElement<RemoverContaBancariaInputType> createRemoverContaBancariaInput(RemoverContaBancariaInputType value) {
        return new JAXBElement<RemoverContaBancariaInputType>(_RemoverContaBancariaInput_QNAME, RemoverContaBancariaInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverContaBancariaOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "removerContaBancariaOutput")
    public JAXBElement<RemoverContaBancariaOutputType> createRemoverContaBancariaOutput(RemoverContaBancariaOutputType value) {
        return new JAXBElement<RemoverContaBancariaOutputType>(_RemoverContaBancariaOutput_QNAME, RemoverContaBancariaOutputType.class, null, value);
    }

}
