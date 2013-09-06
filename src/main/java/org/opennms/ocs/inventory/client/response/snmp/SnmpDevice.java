package org.opennms.ocs.inventory.client.response.snmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

	/**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SNMP">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CHECKSUM" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CONTACT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DOMAIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="IPADDR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LASTDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="LOCATION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MACADDR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SNMPDEVICEID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="UPTIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SNMP_FANS">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MANUFACTURER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="REVISION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SERIALNUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "m_snmp",
        "m_snmpfans"
    })
    public class SnmpDevice {

        @XmlElement(name = "SNMP", required = true)
        protected Snmp m_snmp;
        @XmlElement(name = "SNMP_FANS", required = true)
        protected SnmpFans m_snmpfans;

        /**
         * Gets the value of the m_snmp property.
         * 
         * @return
         *     possible object is
         *   
         *     
         */
        public Snmp getSNMP() {
            return m_snmp;
        }

        /**
         * Sets the value of the m_snmp property.
         * 
         * @param value
         *     allowed object is
         *    
         *     
         */
        public void setSNMP(Snmp value) {
            this.m_snmp = value;
        }

        /**
         * Gets the value of the m_snmpfans property.
         * 
         * @return
         *     possible object is
         *  
         *     
         */
        public SnmpFans getSNMPFans() {
            return m_snmpfans;
        }

        /**
         * Sets the value of the m_snmpfans property.
         * 
         * @param value
         *     allowed object is
         * 
         *     
         */
        public void setSNMPFans(SnmpFans value) {
            this.m_snmpfans = value;
        }

		@Override
		public String toString() {
			return "SnmpDevice [m_snmp=" + m_snmp + ", m_snmpfans="
					+ m_snmpfans + "]";
		}    

    }
