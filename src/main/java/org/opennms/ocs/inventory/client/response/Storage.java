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
 *         &lt;element name="DESCRIPTION" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DISKSIZE" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIRMWARE" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MANUFACTURER" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODEL" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAME" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SERIALNUMBER" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TYPE" _type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = { "_description", "_disksize",
        "_firmware", "_manufacturer", "_model", "_name", "_serialnumber",
"_type" })
public class Storage {

    @XmlElement(name = "DESCRIPTION", required = true)
    protected String _description;

    @XmlElement(name = "DISKSIZE")
    protected int _disksize;

    @XmlElement(name = "FIRMWARE")
    protected int _firmware;

    @XmlElement(name = "MANUFACTURER", required = true)
    protected String _manufacturer;

    @XmlElement(name = "MODEL", required = true)
    protected String _model;

    @XmlElement(name = "NAME", required = true)
    protected String _name;

    @XmlElement(name = "SERIALNUMBER", required = true)
    protected String _serialnumber;

    @XmlElement(name = "TYPE", required = true)
    protected String _type;

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
     * Gets the value of the _disksize property.
     */
    public int getDisksize() {
        return _disksize;
    }

    /**
     * Sets the value of the _disksize property.
     */
    public void setDisksize(int value) {
        this._disksize = value;
    }

    /**
     * Gets the value of the _firmware property.
     */
    public int getFirmware() {
        return _firmware;
    }

    /**
     * Sets the value of the _firmware property.
     */
    public void setFirmware(int value) {
        this._firmware = value;
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
     * Gets the value of the _model property.
     * 
     * @return possible object is {@link String }
     */
    public String getModel() {
        return _model;
    }

    /**
     * Sets the value of the _model property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setModel(String value) {
        this._model = value;
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

    /**
     * Gets the value of the _serialnumber property.
     * 
     * @return possible object is {@link String }
     */
    public String getSerialNumber() {
        return _serialnumber;
    }

    /**
     * Sets the value of the _serialnumber property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setSerialNumber(String value) {
        this._serialnumber = value;
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

    @Override
    public String toString() {
        return "Storage{" +
                "_description='" + _description + '\'' +
                ", _disksize=" + _disksize +
                ", _firmware=" + _firmware +
                ", _manufacturer='" + _manufacturer + '\'' +
                ", _model='" + _model + '\'' +
                ", _name='" + _name + '\'' +
                ", _serialnumber='" + _serialnumber + '\'' +
                ", _type='" + _type + '\'' +
                '}';
    }
}
