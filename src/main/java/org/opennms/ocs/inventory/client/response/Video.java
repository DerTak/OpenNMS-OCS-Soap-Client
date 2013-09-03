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
 *         &lt;element name="CHIPSET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MEMORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RESOLUTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = { "_chipset", "_memory", "_name",
"_resolution" })
public class Video {

    @XmlElement(name = "CHIPSET", required = true)
    protected String _chipset;

    @XmlElement(name = "MEMORY", required = true)
    protected String _memory;

    @XmlElement(name = "NAME", required = true)
    protected String _name;

    @XmlElement(name = "RESOLUTION", required = true)
    protected String _resolution;

    /**
     * Gets the value of the _chipset property.
     * 
     * @return possible object is {@link String }
     */
    public String getChipset() {
        return _chipset;
    }

    /**
     * Sets the value of the _chipset property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setChipset(String value) {
        this._chipset = value;
    }

    /**
     * Gets the value of the _memory property.
     * 
     * @return possible object is {@link String }
     */
    public String getMemory() {
        return _memory;
    }

    /**
     * Sets the value of the _memory property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setMemory(String value) {
        this._memory = value;
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
     * Gets the value of the _resolution property.
     * 
     * @return possible object is {@link String }
     */
    public String getResolution() {
        return _resolution;
    }

    /**
     * Sets the value of the _resolution property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setResolution(String value) {
        this._resolution = value;
    }

    @Override
    public String toString() {
        return "Video{" +
                "_chipset='" + _chipset + '\'' +
                ", _memory='" + _memory + '\'' +
                ", _name='" + _name + '\'' +
                ", _resolution='" + _resolution + '\'' +
                '}';
    }
}

