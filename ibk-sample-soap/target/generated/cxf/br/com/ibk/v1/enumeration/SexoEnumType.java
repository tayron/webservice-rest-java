
package br.com.ibk.v1.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SexoEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SexoEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MASCULINO"/&gt;
 *     &lt;enumeration value="FEMININO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SexoEnumType", namespace = "http://ibk.com.br/v1/enumeration")
@XmlEnum
public enum SexoEnumType {

    MASCULINO,
    FEMININO;

    public String value() {
        return name();
    }

    public static SexoEnumType fromValue(String v) {
        return valueOf(v);
    }

}
