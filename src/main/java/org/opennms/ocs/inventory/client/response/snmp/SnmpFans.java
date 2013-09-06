package org.opennms.ocs.inventory.client.response.snmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
     *         &lt;element name="DESCRIPTION" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MANUFACTURER" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="REFERENCE" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="REVISION" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SERIALNUMBER" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TYPE" m_type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "m_description",
        "m_manufacturer",
        "m_reference",
        "m_revision",
        "m_serialNumber",
        "m_type"
    })
    public class SnmpFans {

        @XmlElement(name = "DESCRIPTION", required = true)
        protected String m_description;
        @XmlElement(name = "MANUFACTURER", required = true)
        protected String m_manufacturer;
        @XmlElement(name = "REFERENCE", required = true)
        protected String m_reference;
        @XmlElement(name = "REVISION", required = true)
        protected String m_revision;
        @XmlElement(name = "SERIALNUMBER", required = true)
        protected String m_serialNumber;
        @XmlElement(name = "TYPE", required = true)
        protected String m_type;

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
         * Gets the value of the m_manufacturer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManufacturer() {
            return m_manufacturer;
        }

        /**
         * Sets the value of the m_manufacturer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManufacturer(String value) {
            this.m_manufacturer = value;
        }

        /**
         * Gets the value of the m_reference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReference() {
            return m_reference;
        }

        /**
         * Sets the value of the m_reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReference(String value) {
            this.m_reference = value;
        }

        /**
         * Gets the value of the m_revision property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRevision() {
            return m_revision;
        }

        /**
         * Sets the value of the m_revision property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRevision(String value) {
            this.m_revision = value;
        }

        /**
         * Gets the value of the m_serialNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerialNumber() {
            return m_serialNumber;
        }

        /**
         * Sets the value of the m_serialNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerialNumber(String value) {
            this.m_serialNumber = value;
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

		@Override
		public String toString() {
			return "SnmpFans [m_description=" + m_description
					+ ", m_manufacturer=" + m_manufacturer + ", m_reference="
					+ m_reference + ", m_revision=" + m_revision
					+ ", m_serialNumber=" + m_serialNumber + ", m_type="
					+ m_type + "]";
		}

    }
