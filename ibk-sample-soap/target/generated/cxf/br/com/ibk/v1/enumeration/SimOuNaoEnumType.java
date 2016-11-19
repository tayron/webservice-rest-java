
package br.com.ibk.v1.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimOuNaoEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimOuNaoEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SIM"/&gt;
 *     &lt;enumeration value="NAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SimOuNaoEnumType", namespace = "http://ibk.com.br/v1/enumeration")
@XmlEnum
public enum SimOuNaoEnumType {

    SIM,
    NAO;

    public String value() {
        return name();
    }

    public static SimOuNaoEnumType fromValue(String v) {
        return valueOf(v);
    }

}
