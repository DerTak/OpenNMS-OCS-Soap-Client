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
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MANUFACTURER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_description", "_manufacturer",
"_name" })
public class Sound {

    @XmlElement(name = "DESCRIPTION", required = true)
    protected String _description;

    @XmlElement(name = "MANUFACTURER", required = true)
    protected String _manufacturer;

    @XmlElement(name = "NAME", required = true)
    protected String _name;

    /**
     * Gets the value of the _description property.
     * 
     * @return possible object is {@link String }
     */
    public String getDESCRIPTION() {
        return _description;
    }

    /**
     * Sets the value of the _description property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDescription(String value) {
        this._description = value;
    }

    /**
     * Gets the value of the _manufacturer property.
     * 
     * @return possible object is {@link String }
     */
    public String getManufacturer() {
        return _manufacturer;
    }

    /**
     * Sets the value of the _manufacturer property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setManufacturer(String value) {
        this._manufacturer = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName() {
        return _name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setName(String value) {
        this._name = value;
    }

    @Override
    public String toString() {
        return "Sound{" +
                "_description='" + _description + '\'' +
                ", _manufacturer='" + _manufacturer + '\'' +
                ", _name='" + _name + '\'' +
                '}';
    }
}
