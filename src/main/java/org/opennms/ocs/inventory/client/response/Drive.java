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
 *         &lt;element name="CREATEDATE" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FILESYSTEM" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FREE" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LETTER" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMFILES" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TOTAL" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TYPE" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VOLUMN" _type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = { "_createDate", "_filesystem", "_free",
        "_letter", "_numfiles", "_total", "_type", "_volumn" })
public class Drive {

    @XmlElement(name = "CREATEDATE", required = true)
    protected String _createDate;

    @XmlElement(name = "FILESYSTEM", required = true)
    protected String _filesystem;

    @XmlElement(name = "FREE")
    protected int _free;

    @XmlElement(name = "LETTER", required = true)
    protected String _letter;

    @XmlElement(name = "NUMFILES")
    protected int _numfiles;

    @XmlElement(name = "TOTAL")
    protected int _total;

    @XmlElement(name = "TYPE", required = true)
    protected String _type;

    @XmlElement(name = "VOLUMN", required = true)
    protected String _volumn;

    /**
     * Gets the value of the _createDate property.
     * 
     * @return possible object is {@link String }
     */
    public String getCreateDate() {
        return _createDate;
    }

    /**
     * Sets the value of the _createDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setCreateDate(String value) {
        this._createDate = value;
    }

    /**
     * Gets the value of the _filesystem property.
     * 
     * @return possible object is {@link String }
     */
    public String getFilesystem() {
        return _filesystem;
    }

    /**
     * Sets the value of the _filesystem property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setFilesystem(String value) {
        this._filesystem = value;
    }

    /**
     * Gets the value of the _free property.
     */
    public int getFree() {
        return _free;
    }

    /**
     * Sets the value of the _free property.
     */
    public void setFree(int value) {
        this._free = value;
    }

    /**
     * Gets the value of the _letter property.
     * 
     * @return possible object is {@link String }
     */
    public String getLetter() {
        return _letter;
    }

    /**
     * Sets the value of the _letter property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setLetter(String value) {
        this._letter = value;
    }

    /**
     * Gets the value of the _numfiles property.
     */
    public int getNumfiles() {
        return _numfiles;
    }

    /**
     * Sets the value of the _numfiles property.
     */
    public void setNumfiles(int value) {
        this._numfiles = value;
    }

    /**
     * Gets the value of the _total property.
     */
    public int getTotal() {
        return _total;
    }

    /**
     * Sets the value of the _total property.
     */
    public void setTotal(int value) {
        this._total = value;
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
     * Gets the value of the _volumn property.
     * 
     * @return possible object is {@link String }
     */
    public String getVolumn() {
        return _volumn;
    }

    /**
     * Sets the value of the _volumn property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setVolumn(String value) {
        this._volumn = value;
    }

    @Override
    public String toString() {
        return "Drive{" +
                "_createDate='" + _createDate + '\'' +
                ", _filesystem='" + _filesystem + '\'' +
                ", _free=" + _free +
                ", _letter='" + _letter + '\'' +
                ", _numfiles=" + _numfiles +
                ", _total=" + _total +
                ", _type='" + _type + '\'' +
                ", _volumn='" + _volumn + '\'' +
                '}';
    }
}
