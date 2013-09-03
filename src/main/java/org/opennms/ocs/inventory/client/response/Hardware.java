/**
 * 
 */
package org.opennms.ocs.inventory.client.response;

import java.math.BigDecimal;

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
 *         &lt;element _name="CHECKSUM" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element _name="DEFAULTGATEWAY" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="DESCRIPTION" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="DNS" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="FIDELITY" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element _name="ID" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element _name="IPADDR" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="IPSRC" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="LASTCOME" _type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element _name="LASTDATE" _type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element _name="MEMORY" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element _name="NAME" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="OSCOMMENTS" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="OSNAME" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="OSVERSION" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="PROCESSORN" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element _name="PROCESSORS" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element _name="PROCESSORT" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="QUALITY" _type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element _name="SSTATE" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element _name="SWAP" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element _name="TYPE" _type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element _name="USERAGENT" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="USERDOMAIN" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="USERID" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="WINCOMPANY" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="WINOWNER" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="WINPRODID" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="WINPRODKEY" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element _name="WORKGROUP" _type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_checksum", "_defaultGateway",
        "_description", "_dns", "_fidelity", "_id", "_ipaddr", "_ipsrc",
        "_lastcome", "_lastdate", "_memory", "_name", "_oscomments",
        "_osname", "_osversion", "_processorn", "_processors",
        "_processort", "_quality", "_sstate", "_swap", "_type",
        "_useragent", "_userdomain", "_userid", "_wincompany",
        "_winowner", "_winprodId", "_winProdKey", "_workGroup" })
public class Hardware {

    @XmlElement(name = "CHECKSUM")
    protected int _checksum;

    @XmlElement(name = "DEFAULTGATEWAY", required = true)
    protected String _defaultGateway;

    @XmlElement(name = "DESCRIPTION", required = true)
    protected String _description;

    @XmlElement(name = "DNS", required = true)
    protected String _dns;

    @XmlElement(name = "FIDELITY")
    protected int _fidelity;

    @XmlElement(name = "ID")
    protected int _id;

    @XmlElement(name = "IPADDR", required = true)
    protected String _ipaddr;

    @XmlElement(name = "IPSRC", required = true)
    protected String _ipsrc;

    @XmlElement(name = "LASTCOME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar _lastcome;

    @XmlElement(name = "LASTDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar _lastdate;

    @XmlElement(name = "MEMORY")
    protected int _memory;

    @XmlElement(name = "NAME", required = true)
    protected String _name;

    @XmlElement(name = "OSCOMMENTS", required = true)
    protected String _oscomments;

    @XmlElement(name = "OSNAME", required = true)
    protected String _osname;

    @XmlElement(name = "OSVERSION", required = true)
    protected String _osversion;

    @XmlElement(name = "PROCESSORN")
    protected int _processorn;

    @XmlElement(name = "PROCESSORS")
    protected int _processors;

    @XmlElement(name = "PROCESSORT", required = true)
    protected String _processort;

    @XmlElement(name = "QUALITY", required = true)
    protected BigDecimal _quality;

    @XmlElement(name = "SSTATE")
    protected int _sstate;

    @XmlElement(name = "SWAP")
    protected int _swap;

    @XmlElement(name = "TYPE")
    protected int _type;

    @XmlElement(name = "USERAGENT", required = true)
    protected String _useragent;

    @XmlElement(name = "USERDOMAIN", required = true)
    protected String _userdomain;

    @XmlElement(name = "USERID", required = true)
    protected String _userid;

    @XmlElement(name = "WINCOMPANY", required = true)
    protected String _wincompany;

    @XmlElement(name = "WINOWNER", required = true)
    protected String _winowner;

    @XmlElement(name = "WINPRODID", required = true)
    protected String _winprodId;

    @XmlElement(name = "WINPRODKEY", required = true)
    protected String _winProdKey;

    @XmlElement(name = "WORKGROUP", required = true)
    protected String _workGroup;

    /**
     * Gets the value of the _checksum property.
     */
    public int getChecksum() {
        return _checksum;
    }

    /**
     * Sets the value of the _checksum property.
     */
    public void setChecksum(int value) {
        this._checksum = value;
    }

    /**
     * Gets the value of the _defaultGateway property.
     * 
     * @return possible object is {@link String }
     */
    public String getDefaultGateway() {
        return _defaultGateway;
    }

    /**
     * Sets the value of the _defaultGateway property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDdfaultGateway(String value) {
        this._defaultGateway = value;
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
     * Gets the value of the _dns property.
     * 
     * @return possible object is {@link String }
     */
    public String getDNS() {
        return _dns;
    }

    /**
     * Sets the value of the _dns property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDNS(String value) {
        this._dns = value;
    }

    /**
     * Gets the value of the _fidelity property.
     */
    public int getFidelity() {
        return _fidelity;
    }

    /**
     * Sets the value of the _fidelity property.
     */
    public void setFidelity(int value) {
        this._fidelity = value;
    }

    /**
     * Gets the value of the _id property.
     */
    public int getId() {
        return _id;
    }

    /**
     * Sets the value of the _id property.
     */
    public void setId(int value) {
        this._id = value;
    }

    /**
     * Gets the value of the _ipaddr property.
     * 
     * @return possible object is {@link String }
     */
    public String getIpaddr() {
        return _ipaddr;
    }

    /**
     * Sets the value of the _ipaddr property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setIpaddr(String value) {
        this._ipaddr = value;
    }

    /**
     * Gets the value of the _ipsrc property.
     * 
     * @return possible object is {@link String }
     */
    public String getIpsrc() {
        return _ipsrc;
    }

    /**
     * Sets the value of the _ipsrc property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setIpsrc(String value) {
        this._ipsrc = value;
    }

    /**
     * Gets the value of the _lastcome property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastcome() {
        return _lastcome;
    }

    /**
     * Sets the value of the _lastcome property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setLastcome(XMLGregorianCalendar value) {
        this._lastcome = value;
    }

    /**
     * Gets the value of the _lastdate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastdate() {
        return _lastdate;
    }

    /**
     * Sets the value of the _lastdate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setLastdate(XMLGregorianCalendar value) {
        this._lastdate = value;
    }

    /**
     * Gets the value of the _memory property.
     */
    public int getMemory() {
        return _memory;
    }

    /**
     * Sets the value of the _memory property.
     */
    public void setMemory(int value) {
        this._memory = value;
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
     * Gets the value of the _oscomments property.
     * 
     * @return possible object is {@link String }
     */
    public String getOscomments() {
        return _oscomments;
    }

    /**
     * Sets the value of the _oscomments property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setOscomments(String value) {
        this._oscomments = value;
    }

    /**
     * Gets the value of the _osname property.
     * 
     * @return possible object is {@link String }
     */
    public String getOsname() {
        return _osname;
    }

    /**
     * Sets the value of the _osname property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setOsname(String value) {
        this._osname = value;
    }

    /**
     * Gets the value of the _osversion property.
     * 
     * @return possible object is {@link String }
     */
    public String getOsversion() {
        return _osversion;
    }

    /**
     * Sets the value of the _osversion property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setOsversion(String value) {
        this._osversion = value;
    }

    /**
     * Gets the value of the _processorn property.
     */
    public int getProcessorn() {
        return _processorn;
    }

    /**
     * Sets the value of the _processorn property.
     */
    public void setProcessorn(int value) {
        this._processorn = value;
    }

    /**
     * Gets the value of the _processors property.
     */
    public int getProcessors() {
        return _processors;
    }

    /**
     * Sets the value of the _processors property.
     */
    public void setProcessors(int value) {
        this._processors = value;
    }

    /**
     * Gets the value of the _processort property.
     * 
     * @return possible object is {@link String }
     */
    public String getProcessort() {
        return _processort;
    }

    /**
     * Sets the value of the _processort property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setProcessort(String value) {
        this._processort = value;
    }

    /**
     * Gets the value of the _quality property.
     * 
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getQuality() {
        return _quality;
    }

    /**
     * Sets the value of the _quality property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     */
    public void setQuality(BigDecimal value) {
        this._quality = value;
    }

    /**
     * Gets the value of the _sstate property.
     */
    public int getSstate() {
        return _sstate;
    }

    /**
     * Sets the value of the _sstate property.
     */
    public void setSstate(int value) {
        this._sstate = value;
    }

    /**
     * Gets the value of the _swap property.
     */
    public int getSwap() {
        return _swap;
    }

    /**
     * Sets the value of the _swap property.
     */
    public void setSwap(int value) {
        this._swap = value;
    }

    /**
     * Gets the value of the _type property.
     */
    public int getType() {
        return _type;
    }

    /**
     * Sets the value of the _type property.
     */
    public void setType(int value) {
        this._type = value;
    }

    /**
     * Gets the value of the _useragent property.
     * 
     * @return possible object is {@link String }
     */
    public String getUseragent() {
        return _useragent;
    }

    /**
     * Sets the value of the _useragent property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setUseragent(String value) {
        this._useragent = value;
    }

    /**
     * Gets the value of the _userdomain property.
     * 
     * @return possible object is {@link String }
     */
    public String getUserdomain() {
        return _userdomain;
    }

    /**
     * Sets the value of the _userdomain property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setUserdomain(String value) {
        this._userdomain = value;
    }

    /**
     * Gets the value of the _userid property.
     * 
     * @return possible object is {@link String }
     */
    public String getUserId() {
        return _userid;
    }

    /**
     * Sets the value of the _userid property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setUserId(String value) {
        this._userid = value;
    }

    /**
     * Gets the value of the _wincompany property.
     * 
     * @return possible object is {@link String }
     */
    public String getWincompany() {
        return _wincompany;
    }

    /**
     * Sets the value of the _wincompany property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setWincompany(String value) {
        this._wincompany = value;
    }

    /**
     * Gets the value of the _winowner property.
     * 
     * @return possible object is {@link String }
     */
    public String getWinowner() {
        return _winowner;
    }

    /**
     * Sets the value of the _winowner property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setWinowner(String value) {
        this._winowner = value;
    }

    /**
     * Gets the value of the _winprodId property.
     * 
     * @return possible object is {@link String }
     */
    public String getWinProdId() {
        return _winprodId;
    }

    /**
     * Sets the value of the _winprodId property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setWinProdId(String value) {
        this._winprodId = value;
    }

    /**
     * Gets the value of the _winProdKey property.
     * 
     * @return possible object is {@link String }
     */
    public String getWinProdKey() {
        return _winProdKey;
    }

    /**
     * Sets the value of the _winProdKey property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setWinProdKey(String value) {
        this._winProdKey = value;
    }

    /**
     * Gets the value of the _workGroup property.
     * 
     * @return possible object is {@link String }
     */
    public String getWorkGroup() {
        return _workGroup;
    }

    /**
     * Sets the value of the _workGroup property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setWorkGroup(String value) {
        this._workGroup = value;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "_checksum=" + _checksum +
                ", _defaultGateway='" + _defaultGateway + '\'' +
                ", _description='" + _description + '\'' +
                ", _dns='" + _dns + '\'' +
                ", _fidelity=" + _fidelity +
                ", _id=" + _id +
                ", _ipaddr='" + _ipaddr + '\'' +
                ", _ipsrc='" + _ipsrc + '\'' +
                ", _lastcome=" + _lastcome +
                ", _lastdate=" + _lastdate +
                ", _memory=" + _memory +
                ", _name='" + _name + '\'' +
                ", _oscomments='" + _oscomments + '\'' +
                ", _osname='" + _osname + '\'' +
                ", _osversion='" + _osversion + '\'' +
                ", _processorn=" + _processorn +
                ", _processors=" + _processors +
                ", _processort='" + _processort + '\'' +
                ", _quality=" + _quality +
                ", _sstate=" + _sstate +
                ", _swap=" + _swap +
                ", _type=" + _type +
                ", _useragent='" + _useragent + '\'' +
                ", _userdomain='" + _userdomain + '\'' +
                ", _userid='" + _userid + '\'' +
                ", _wincompany='" + _wincompany + '\'' +
                ", _winowner='" + _winowner + '\'' +
                ", _winprodId='" + _winprodId + '\'' +
                ", _winProdKey='" + _winProdKey + '\'' +
                ", _workGroup='" + _workGroup + '\'' +
                '}';
    }
}

