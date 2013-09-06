package org.opennms.ocs.inventory.client.response.snmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;



    /**
     * <p>Java class for anonymous complex m_type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element m_name="CHECKSUM" m_type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element m_name="CONTACT" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element m_name="DESCRIPTION" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element m_name="DOMAIN" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element m_name="ID" m_type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element m_name="IPADDR" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element m_name="LASTDATE" m_type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element m_name="LOCATION" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element m_name="MACADDR" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element m_name="NAME" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element m_name="SNMPDEVICEID" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element m_name="TYPE" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element m_name="UPTIME" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "m_checksum",
        "m_contact",
        "m_description",
        "m_domain",
        "m_id",
        "m_ipaddr",
        "m_lastdate",
        "m_location",
        "m_macaddr",
        "m_name",
        "snmpdevicem_id",
        "m_type",
        "m_uptime"
    })
    public class Snmp {

        @XmlElement(name = "CHECKSUM")
        protected int m_checksum;
        @XmlElement(name = "CONTACT", required = true)
        protected String m_contact;
        @XmlElement(name = "DESCRIPTION", required = true)
        protected String m_description;
        @XmlElement(name = "DOMAIN", required = true)
        protected String m_domain;
        @XmlElement(name = "ID")
        protected int m_id;
        @XmlElement(name = "IPADDR", required = true)
        protected String m_ipaddr;
        @XmlElement(name = "LASTDATE", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar m_lastdate;
        @XmlElement(name = "LOCATION", required = true)
        protected String m_location;
        @XmlElement(name = "MACADDR", required = true)
        protected String m_macaddr;
        @XmlElement(name = "NAME", required = true)
        protected String m_name;
        @XmlElement(name = "SNMPDEVICEID", required = true)
        protected String snmpdevicem_id;
        @XmlElement(name = "TYPE", required = true)
        protected String m_type;
        @XmlElement(name = "UPTIME", required = true)
        protected String m_uptime;

        /**
         * Gets the value of the m_checksum property.
         * 
         */
        public int getChecksum() {
            return m_checksum;
        }

        /**
         * Sets the value of the m_checksum property.
         * 
         */
        public void setChecksum(int value) {
            this.m_checksum = value;
        }

        /**
         * Gets the value of the m_contact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContact() {
            return m_contact;
        }

        /**
         * Sets the value of the m_contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContact(String value) {
            this.m_contact = value;
        }

        /**
         * Gets the value of the m_description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return m_description;
        }

        /**
         * Sets the value of the m_description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.m_description = value;
        }

        /**
         * Gets the value of the m_domain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomain() {
            return m_domain;
        }

        /**
         * Sets the value of the m_domain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomain(String value) {
            this.m_domain = value;
        }

        /**
         * Gets the value of the m_id property.
         * 
         */
        public int getId() {
            return m_id;
        }

        /**
         * Sets the value of the m_id property.
         * 
         */
        public void setId(int value) {
            this.m_id = value;
        }

        /**
         * Gets the value of the m_ipaddr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIPAddr() {
            return m_ipaddr;
        }

        /**
         * Sets the value of the m_ipaddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIPAddr(String value) {
            this.m_ipaddr = value;
        }

        /**
         * Gets the value of the m_lastdate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastDate() {
            return m_lastdate;
        }

        /**
         * Sets the value of the m_lastdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastDate(XMLGregorianCalendar value) {
            this.m_lastdate = value;
        }

        /**
         * Gets the value of the m_location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return m_location;
        }

        /**
         * Sets the value of the m_location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.m_location = value;
        }

        /**
         * Gets the value of the m_macaddr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMacAddr() {
            return m_macaddr;
        }

        /**
         * Sets the value of the m_macaddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMacAddr(String value) {
            this.m_macaddr = value;
        }

        /**
         * Gets the value of the m_name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return m_name;
        }

        /**
         * Sets the value of the m_name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.m_name = value;
        }

        /**
         * Gets the value of the snmpdevicem_id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNMPDeviceId() {
            return snmpdevicem_id;
        }

        /**
         * Sets the value of the snmpdevicem_id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNMPDeviceId(String value) {
            this.snmpdevicem_id = value;
        }

        /**
         * Gets the value of the m_type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return m_type;
        }

        /**
         * Sets the value of the m_type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.m_type = value;
        }

        /**
         * Gets the value of the m_uptime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUptime() {
            return m_uptime;
        }

        /**
         * Sets the value of the m_uptime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUptime(String value) {
            this.m_uptime = value;
        }

		@Override
		public String toString() {
			return "Snmp [m_checksum=" + m_checksum + ", m_contact="
					+ m_contact + ", m_description=" + m_description
					+ ", m_domain=" + m_domain + ", m_id=" + m_id
					+ ", m_ipaddr=" + m_ipaddr + ", m_lastdate=" + m_lastdate
					+ ", m_location=" + m_location + ", m_macaddr=" + m_macaddr
					+ ", m_name=" + m_name + ", snmpdevicem_id="
					+ snmpdevicem_id + ", m_type=" + m_type + ", m_uptime="
					+ m_uptime + "]";
		}

    }
