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
 *         &lt;element name="IPADDRESS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IPDHCP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IPGATEWAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IPMASK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IPSUBNET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MACADDR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPEED" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TYPEMIB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VIRTUALDEV" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "", propOrder = { "description", "ipaddress",
        "ipdhcp", "ipgateway", "ipmask", "ipsubnet", "macaddr",
        "speed", "status", "type", "typemib", "virtualdev" })
public class Network {

    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;

    @XmlElement(name = "IPADDRESS", required = true)
    protected String ipaddress;

    @XmlElement(name = "IPDHCP", required = true)
    protected String ipdhcp;

    @XmlElement(name = "IPGATEWAY", required = true)
    protected String ipgateway;

    @XmlElement(name = "IPMASK", required = true)
    protected String ipmask;

    @XmlElement(name = "IPSUBNET", required = true)
    protected String ipsubnet;

    @XmlElement(name = "MACADDR", required = true)
    protected String macaddr;

    @XmlElement(name = "SPEED", required = true)
    protected String speed;

    @XmlElement(name = "STATUS", required = true)
    protected String status;

    @XmlElement(name = "TYPE", required = true)
    protected String type;

    @XmlElement(name = "TYPEMIB", required = true)
    protected String typemib;

    @XmlElement(name = "VIRTUALDEV")
    protected int virtualdev;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the ipaddress property.
     * 
     * @return possible object is {@link String }
     */
    public String getIPAddress() {
        return ipaddress;
    }

    /**
     * Sets the value of the ipaddress property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setIPAddress(String value) {
        this.ipaddress = value;
    }

    /**
     * Gets the value of the ipdhcp property.
     * 
     * @return possible object is {@link String }
     */
    public String getIPDHCP() {
        return ipdhcp;
    }

    /**
     * Sets the value of the ipdhcp property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setIPDHCP(String value) {
        this.ipdhcp = value;
    }

    /**
     * Gets the value of the ipgateway property.
     * 
     * @return possible object is {@link String }
     */
    public String getIPGateway() {
        return ipgateway;
    }

    /**
     * Sets the value of the ipgateway property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setIPGateway(String value) {
        this.ipgateway = value;
    }

    /**
     * Gets the value of the ipmask property.
     * 
     * @return possible object is {@link String }
     */
    public String getIPMask() {
        return ipmask;
    }

    /**
     * Sets the value of the ipmask property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setIPMask(String value) {
        this.ipmask = value;
    }

    /**
     * Gets the value of the ipsubnet property.
     * 
     * @return possible object is {@link String }
     */
    public String getIPSubnet() {
        return ipsubnet;
    }

    /**
     * Sets the value of the ipsubnet property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setIPSubnet(String value) {
        this.ipsubnet = value;
    }

    /**
     * Gets the value of the macaddr property.
     * 
     * @return possible object is {@link String }
     */
    public String getMACADDR() {
        return macaddr;
    }

    /**
     * Sets the value of the macaddr property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setMACADDR(String value) {
        this.macaddr = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return possible object is {@link String }
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setSpeed(String value) {
        this.speed = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typemib property.
     * 
     * @return possible object is {@link String }
     */
    public String getTypeMib() {
        return typemib;
    }

    /**
     * Sets the value of the typemib property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setTypeMib(String value) {
        this.typemib = value;
    }

    /**
     * Gets the value of the virtualdev property.
     */
    public int getVirtualDEV() {
        return virtualdev;
    }

    /**
     * Sets the value of the virtualdev property.
     */
    public void setVirtualDEV(int value) {
        this.virtualdev = value;
    }

    @Override
    public String toString() {
        return "Network{" +
                "description='" + description + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                ", ipdhcp='" + ipdhcp + '\'' +
                ", ipgateway='" + ipgateway + '\'' +
                ", ipmask='" + ipmask + '\'' +
                ", ipsubnet='" + ipsubnet + '\'' +
                ", macaddr='" + macaddr + '\'' +
                ", speed='" + speed + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", typemib='" + typemib + '\'' +
                ", virtualdev=" + virtualdev +
                '}';
    }
}
