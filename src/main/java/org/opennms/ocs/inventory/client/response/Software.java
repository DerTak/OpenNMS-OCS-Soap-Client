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
 *         &lt;element name="BITSWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FILESIZE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FOLDER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSTALLDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PUBLISHER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = { "_bitswidth", "_comments",
        "_filename", "_filesize", "_folder", "_guid", "_installdate",
        "_language", "_name", "_publisher", "_source", "_version" })
public class Software {

    @XmlElement(name = "BITSWIDTH")
    protected int _bitswidth;

    @XmlElement(name = "COMMENTS", required = true)
    protected String _comments;

    @XmlElement(name = "FILENAME", required = true)
    protected String _filename;

    @XmlElement(name = "FILESIZE")
    protected int _filesize;

    @XmlElement(name = "FOLDER", required = true)
    protected String _folder;

    @XmlElement(name = "GUID", required = true)
    protected String _guid;

    @XmlElement(name = "INSTALLDATE", required = true)
    protected String _installdate;

    @XmlElement(name = "LANGUAGE", required = true)
    protected String _language;

    @XmlElement(name = "NAME", required = true)
    protected String _name;

    @XmlElement(name = "PUBLISHER", required = true)
    protected String _publisher;

    @XmlElement(name = "SOURCE")
    protected int _source;

    @XmlElement(name = "VERSION", required = true)
    protected String _version;

    /**
     * Gets the value of the _bitswidth property.
     */
    public int getBITSWIDTH() {
        return _bitswidth;
    }

    /**
     * Sets the value of the _bitswidth property.
     */
    public void setBitswidth(int value) {
        this._bitswidth = value;
    }

    /**
     * Gets the value of the _comments property.
     * 
     * @return possible object is {@link String }
     */
    public String getComments() {
        return _comments;
    }

    /**
     * Sets the value of the _comments property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setComments(String value) {
        this._comments = value;
    }

    /**
     * Gets the value of the _filename property.
     * 
     * @return possible object is {@link String }
     */
    public String getFilename() {
        return _filename;
    }

    /**
     * Sets the value of the _filename property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setFilename(String value) {
        this._filename = value;
    }

    /**
     * Gets the value of the _filesize property.
     */
    public int getFilesize() {
        return _filesize;
    }

    /**
     * Sets the value of the _filesize property.
     */
    public void setFilesize(int value) {
        this._filesize = value;
    }

    /**
     * Gets the value of the _folder property.
     * 
     * @return possible object is {@link String }
     */
    public String getFolder() {
        return _folder;
    }

    /**
     * Sets the value of the _folder property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setFolder(String value) {
        this._folder = value;
    }

    /**
     * Gets the value of the _guid property.
     * 
     * @return possible object is {@link String }
     */
    public String getGUID() {
        return _guid;
    }

    /**
     * Sets the value of the _guid property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setGUID(String value) {
        this._guid = value;
    }

    /**
     * Gets the value of the _installdate property.
     * 
     * @return possible object is {@link String }
     */
    public String getInstalldate() {
        return _installdate;
    }

    /**
     * Sets the value of the _installdate property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setInstalldate(String value) {
        this._installdate = value;
    }

    /**
     * Gets the value of the _language property.
     * 
     * @return possible object is {@link String }
     */
    public String getLanguage() {
        return _language;
    }

    /**
     * Sets the value of the _language property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setLanguage(String value) {
        this._language = value;
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
     * Gets the value of the _publisher property.
     * 
     * @return possible object is {@link String }
     */
    public String getPUBLISHER() {
        return _publisher;
    }

    /**
     * Sets the value of the _publisher property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setPublisher(String value) {
        this._publisher = value;
    }

    /**
     * Gets the value of the _source property.
     */
    public int getSource() {
        return _source;
    }

    /**
     * Sets the value of the _source property.
     */
    public void setSource(int value) {
        this._source = value;
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
        return "Software{" +
                "_bitswidth=" + _bitswidth +
                ", _comments='" + _comments + '\'' +
                ", _filename='" + _filename + '\'' +
                ", _filesize=" + _filesize +
                ", _folder='" + _folder + '\'' +
                ", _guid='" + _guid + '\'' +
                ", _installdate='" + _installdate + '\'' +
                ", _language='" + _language + '\'' +
                ", _name='" + _name + '\'' +
                ", _publisher='" + _publisher + '\'' +
                ", _source=" + _source +
                ", _version='" + _version + '\'' +
                '}';
    }
}