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
 * Java class for anonymous complex _type.
 * <p>
 * The following schema fragment specifies the expected content
 * contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element _name="CAPTION" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="DESCRIPTION" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="MANUFACTURER" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="NAME" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="TYPE" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="VERSION" _type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = { "_caption", "_description",
        "_manufacturer", "_name", "_type", "_version" })
public class Controller {

    @XmlElement(name = "CAPTION", required = true)
    protected String _caption;

    @XmlElement(name = "DESCRIPTION", required = true)
    protected String _description;

    @XmlElement(name = "MANUFACTURER", required = true)
    protected String _manufacturer;

    @XmlElement(name = "NAME", required = true)
    protected String _name;

    @XmlElement(name = "TYPE", required = true)
    protected String _type;

    @XmlElement(name = "VERSION", required = true)
    protected String _version;

    /**
     * Gets the value of the _caption property.
     * 
     * @return possible object is {@link String }
     */
    public String getCaption() {
        return _caption;
    }

    /**
     * Sets the value of the _caption property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setCaption(String value) {
        this._caption = value;
    }

    /**
     * Gets the value of the _description property.
     * 
     * @return possible object is {@link String }
     */
    public String getDescription() {
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
    public void setMAnufacturer(String value) {
        this._manufacturer = value;
    }

    /**
     * Gets the value of the _name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName() {
        return _name;
    }

    /**
     * Sets the value of the _name property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setName(String value) {
        this._name = value;
    }

    /**
     * Gets the value of the _type property.
     * 
     * @return possible object is {@link String }
     */
    public String getType() {
        return _type;
    }

    /**
     * Sets the value of the _type property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setType(String value) {
        this._type = value;
    }

    /**
     * Gets the value of the _version property.
     * 
     * @return possible object is {@link String }
     */
    public String getVersion() {
        return _version;
    }

    /**
     * Sets the value of the _version property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setVersion(String value) {
        this._version = value;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "_caption='" + _caption + '\'' +
                ", _description='" + _description + '\'' +
                ", _manufacturer='" + _manufacturer + '\'' +
                ", _name='" + _name + '\'' +
                ", _type='" + _type + '\'' +
                ", _version='" + _version + '\'' +
                '}';
    }
}
