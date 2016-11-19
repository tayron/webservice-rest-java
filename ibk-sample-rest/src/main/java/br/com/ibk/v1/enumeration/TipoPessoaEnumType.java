
package br.com.ibk.v1.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoPessoaEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPessoaEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PF"/&gt;
 *     &lt;enumeration value="PJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoPessoaEnumType", namespace = "http://ibk.com.br/v1/enumeration")
@XmlEnum
public enum TipoPessoaEnumType {

    PF,
    PJ;

    public String value() {
        return name();
    }

    public static TipoPessoaEnumType fromValue(String v) {
        return valueOf(v);
    }

}
