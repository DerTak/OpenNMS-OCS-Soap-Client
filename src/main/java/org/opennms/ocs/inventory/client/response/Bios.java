/**
 * 
 */
package org.opennms.ocs.inventory.client.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element name="ASSETTAG" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BDATE" _type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BMANUFACTURER" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BVERSION" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SMANUFACTURER" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SMODEL" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SSN" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TYPE" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_assetTag", "_bDate",
        "_bManufacturer", "_bVersion", "_sManufacturer", "_sModel",
        "_ssn", "_type" })
public class Bios {

    @XmlElement(name = "ASSETTAG", required = true)
    protected String _assetTag;

    @XmlElement(name = "BDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar _bDate;

    @XmlElement(name = "BMANUFACTURER", required = true)
    protected String _bManufacturer;

    @XmlElement(name = "BVERSION", required = true)
    protected String _bVersion;

    @XmlElement(name = "SMANUFACTURER", required = true)
    protected String _sManufacturer;

    @XmlElement(name = "SMODEL", required = true)
    protected String _sModel;

    @XmlElement(name = "SSN")
    protected int _ssn;

    @XmlElement(name = "TYPE", required = true)
    protected String _type;

    /**
     * Gets the value of the _assetTag property.
     * 
     * @return possible object is {@link String }
     */
    public String getAssetTag() {
        return _assetTag;
    }

    /**
     * Sets the value of the _assetTag property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setAssetTag(String value) {
        this._assetTag = value;
    }

    /**
     * Gets the value of the _bDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getBDate() {
        return _bDate;
    }

    /**
     * Sets the value of the _bDate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setBDate(XMLGregorianCalendar value) {
        this._bDate = value;
    }

    /**
     * Gets the value of the _bManufacturer property.
     * 
     * @return possible object is {@link String }
     */
    public String getBManufacturer() {
        return _bManufacturer;
    }

    /**
     * Sets the value of the _bManufacturer property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setBManufacturer(String value) {
        this._bManufacturer = value;
    }

    /**
     * Gets the value of the _bVersion property.
     * 
     * @return possible object is {@link String }
     */
    public String getBVersion() {
        return _bVersion;
    }

    /**
     * Sets the value of the _bVersion property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setBVersion(String value) {
        this._bVersion = value;
    }

    /**
     * Gets the value of the _sManufacturer property.
     * 
     * @return possible object is {@link String }
     */
    public String getSManufacturer() {
        return _sManufacturer;
    }

    /**
     * Sets the value of the _sManufacturer property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setSManufacturer(String value) {
        this._sManufacturer = value;
    }

    /**
     * Gets the value of the _sModel property.
     * 
     * @return possible object is {@link String }
     */
    public String getSModel() {
        return _sModel;
    }

    /**
     * Sets the value of the _sModel property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setSModel(String value) {
        this._sModel = value;
    }

    /**
     * Gets the value of the _ssn property.
     */
    public int getSSN() {
        return _ssn;
    }

    /**
     * Sets the value of the _ssn property.
     */
    public void setSSN(int value) {
        this._ssn = value;
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
        return "Bios{" +
                "_assetTag='" + _assetTag + '\'' +
                ", _bDate=" + _bDate +
                ", _bManufacturer='" + _bManufacturer + '\'' +
                ", _bVersion='" + _bVersion + '\'' +
                ", _sManufacturer='" + _sManufacturer + '\'' +
                ", _sModel='" + _sModel + '\'' +
                ", _ssn=" + _ssn +
                ", _type='" + _type + '\'' +
                '}';
    }
}
