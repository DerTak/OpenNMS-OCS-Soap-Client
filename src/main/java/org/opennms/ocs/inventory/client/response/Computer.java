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
 * The following schema fragment specifies the expected content contained
 * within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entry">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bios">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ASSETTAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="BMANUFACTURER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BVERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SMANUFACTURER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SMODEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Controllers" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CAPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MANUFACTURER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DICO_SOFT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Drives" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CREATEDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FILESYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FREE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="LETTER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NUMFILES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TOTAL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VOLUMN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Hardware">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHECKSUM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="DEFAULTGATEWAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DNS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FIDELITY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="IPADDR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IPSRC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LASTCOME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="LASTDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="MEMORY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OSCOMMENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OSNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OSVERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PROCESSORN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PROCESSORS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PROCESSORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="QUALITY" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="SSTATE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SWAP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="USERAGENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="USERDOMAIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="WINCOMPANY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="WINOWNER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="WINPRODID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="WINPRODKEY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="WORKGROUP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Networks">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IPADDRESS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IPDHCP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IPGATEWAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IPMASK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IPSUBNET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MACADDR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SPEED" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TYPEMIB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VIRTUALDEV" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Software" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BITSWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="COMMENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FILESIZE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="FOLDER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="INSTALLDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PUBLISHER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SOUNDS" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MANUFACTURER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="STORAGES">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DISKSIZE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="FIRMWARE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="MANUFACTURER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MODEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SERIALNUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Videos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHIPSET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MEMORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RESOLUTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
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
 * 
 * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
 *
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_accountInfo", "_bios", "_controllers",
        "_dicosoft", "_drives", "_hardware", "_networks", "_softwares",
        "_sounds", "_storages", "_videos" })
public class Computer {

    @XmlElement(name = "ACCOUNTINFO", required = true)
    protected AccountInfo _accountInfo;

    @XmlElement(name = "BIOS", required = true)
    protected Bios _bios;

    @XmlElement(name = "CONTROLLERS", required = true)
    protected List<Controller> _controllers;

    @XmlElement(name = "DICO_SOFT", required = true)
    protected String _dicosoft;

    @XmlElement(name = "DRIVES", required = true)
    protected List<Drive> _drives;

    @XmlElement(name = "HARDWARE", required = true)
    protected Hardware _hardware;

    @XmlElement(name = "NETWORKS", required = true)
    protected List<Network> _networks;

    @XmlElement(name = "SOFTWARES", required = true)
    protected List<Software> _softwares;

    @XmlElement(name = "SOUNDS", required = true)
    protected List<Sound> _sounds;

    @XmlElement(name = "STORAGES", required = true)
    protected List<Storage> _storages;

    @XmlElement(name = "VIDEOS", required = true)
    protected List<Video> _videos;

    /**
     * Gets the value of the m_accountInfo property.
     * 
     * @return possible _accountInfo
     */
    public AccountInfo getAccountInfo() {
        return _accountInfo;
    }

    /**
     * Sets the value of the m_accountInfo property.
     * 
     * @param value
     *
     */
    public void setAccountInfo(AccountInfo value) {
        this._accountInfo = value;
    }


    /**
     * Gets bios.
     *
     * @return the bios
     */
    public Bios getBios() {
        return _bios;
    }

    /**
     * Sets the value of the bios property.
     *
     *
     * @param value the value
     */
    public void setBios(Bios value) {
        this._bios = value;
    }

    /**
     * Gets the value of the _controllers property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list
     * will be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the _controllers property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getControllers().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     *
     */
    public List<Controller> getControllers() {
        if (_controllers == null) {
            _controllers = new ArrayList<Controller>();
        }
        return this._controllers;
    }

    /**
     * Gets the value of the _dicosoft property.
     * 
     * @return possible object is {@link String }
     */
    public String getDicosoft() {
        return _dicosoft;
    }

    /**
     * Sets the value of the _dicosoft property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDicosoft(String value) {
        this._dicosoft = value;
    }

    /**
     * Gets the value of the _drives property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list
     * will be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the _drives property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDrives().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     *
     */
    public List<Drive> getDrives() {
        if (_drives == null) {
            _drives = new ArrayList<Drive>();
        }
        return this._drives;
    }

    /**
     * Gets the value of the _hardware property.
     * 
     * @return hardware
     */
    public Hardware getHardware() {
        return _hardware;
    }

    /**
     * Sets the value of the _hardware property.
     * @param value the value
     */
    public void setHardware(Hardware value) {
        this._hardware = value;
    }

    /**
     * Gets the value of the _networks property.
     *
     *
     * @return the networks
     */
    public List<Network> getNetworks() {
        if (_networks == null) {
            _networks = new ArrayList<Network>();
        }
        return this._networks;
    }

    /**
     * Gets the value of the _softwares property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list
     * will be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the _softwares property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSoftware().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     *
     */
    public List<Software> getSoftwares() {
        if (_softwares == null) {
            _softwares = new ArrayList<Software>();
        }
        return this._softwares;
    }

    /**
     * Gets the value of the _sounds property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list
     * will be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the _sounds property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSOUNDS().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     *
     */
    public List<Sound> getSounds() {
        if (_sounds == null) {
            _sounds = new ArrayList<Sound>();
        }
        return this._sounds;
    }

    /**
     * Gets the value of the _storages property.
     *
     *
     * @return the storages
     */
    public List<Storage> getStorages() {
        return _storages;
    }

    /**
     * Sets the value of the _storages property.
     *
     * @param value the value
     */
    public void setStorages(List<Storage> value) {
        this._storages = value;
    }


    public void setVideos(List<Video> _videos) {
        this._videos = _videos;
    }
    
    public List<Video> getVideos() {
        return _videos;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "_accountInfo=" + _accountInfo +
                ", _bios=" + _bios +
                ", _controllers=" + _controllers +
                ", _dicosoft='" + _dicosoft + '\'' +
                ", _drives=" + _drives +
                ", _hardware=" + _hardware +
                ", _networks=" + _networks +
                ", _softwares=" + _softwares +
                ", _sounds=" + _sounds +
                ", _storages=" + _storages +
                ", _videos=" + _videos +
                '}';
    }
}
