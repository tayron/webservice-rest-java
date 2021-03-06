
package br.com.ibk.v1.banco;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-19T03:11:26.575-02:00
 * Generated source version: 3.1.8
 */

@WebFault(name = "servicoFault", targetNamespace = "http://ibk.com.br/v1/fault")
public class BancoFault extends Exception {
    
    private br.com.ibk.v1.fault.ServicoFaultType servicoFault;

    public BancoFault() {
        super();
    }
    
    public BancoFault(String message) {
        super(message);
    }
    
    public BancoFault(String message, Throwable cause) {
        super(message, cause);
    }

    public BancoFault(String message, br.com.ibk.v1.fault.ServicoFaultType servicoFault) {
        super(message);
        this.servicoFault = servicoFault;
    }

    public BancoFault(String message, br.com.ibk.v1.fault.ServicoFaultType servicoFault, Throwable cause) {
        super(message, cause);
        this.servicoFault = servicoFault;
    }

    public br.com.ibk.v1.fault.ServicoFaultType getFaultInfo() {
        return this.servicoFault;
    }
}
