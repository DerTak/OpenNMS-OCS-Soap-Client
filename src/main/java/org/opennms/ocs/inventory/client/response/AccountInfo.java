/**
 * 
 */
package org.opennms.ocs.inventory.client.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content
 * contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Entry">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_entry" })
public class AccountInfo {

    @XmlElement(name = "Entry", required = true)
    protected Entry _entry;

    /**
     * Gets the value of the _entry property.
     * 
     * @return possible object is
     *         {@link Computers.Computer.AccountInfo.Entry }
     */
    public Entry getEntry() {
        return _entry;
    }

    /**
     * Sets the value of the _entry property.
     * 
     * @param value
     *            allowed object is
     *            {@link Computers.Computer.AccountInfo.Entry }
     */
    public void setEntry(Entry value) {
        this._entry = value;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "_entry=" + _entry +
                '}';
    }
}

