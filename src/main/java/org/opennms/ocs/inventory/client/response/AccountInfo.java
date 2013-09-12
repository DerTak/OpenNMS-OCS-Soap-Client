/**
 * 
 */
package org.opennms.ocs.inventory.client.response;

import java.util.ArrayList;
import java.util.List;

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
@XmlType(name = "", propOrder = { "_entries" })
public class AccountInfo {

    @XmlElement(name = "ENTRY", required = true)
    protected List<Entry> _entries;

    /**
     * Gets the value of the _entries property.
     * 
     * @return possible object is
     *         {@link Computers.Computer.AccountInfo.Entry }
     */
    public List<Entry> getEntries() {
    	if(_entries == null){
    		_entries = new ArrayList<Entry>();
    	}
        return _entries;
    }

    /**
     * Sets the value of the _entries property.
     * 
     * @param value
     *            allowed object is
     *            {@link Computers.Computer.AccountInfo.Entry }
     */
    public void setEntries(List<Entry> value) {
        this._entries = value;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "_entries=" + _entries +
                '}';
    }
}

