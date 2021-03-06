package br.com.ibk.v1.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-19T03:11:27.216-02:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "ClienteService", 
                  wsdlLocation = "file:/Users/frcabral/Developer/workspaces/workspace_rv/ibk-sample-soap/src/main/webapp/WEB-INF/v1/wsdl/cliente/ClienteService.wsdl",
                  targetNamespace = "http://ibk.com.br/v1/cliente") 
public class ClienteService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ibk.com.br/v1/cliente", "ClienteService");
    public final static QName ClientePort = new QName("http://ibk.com.br/v1/cliente", "ClientePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/frcabral/Developer/workspaces/workspace_rv/ibk-sample-soap/src/main/webapp/WEB-INF/v1/wsdl/cliente/ClienteService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ClienteService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/frcabral/Developer/workspaces/workspace_rv/ibk-sample-soap/src/main/webapp/WEB-INF/v1/wsdl/cliente/ClienteService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ClienteService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ClienteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClienteService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ClienteService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ClienteService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ClienteService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ClientePortType
     */
    @WebEndpoint(name = "ClientePort")
    public ClientePortType getClientePort() {
        return super.getPort(ClientePort, ClientePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClientePortType
     */
    @WebEndpoint(name = "ClientePort")
    public ClientePortType getClientePort(WebServiceFeature... features) {
        return super.getPort(ClientePort, ClientePortType.class, features);
    }

}
