package org.opennms.ocs.inventory.client.request.logic;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.apache.commons.codec.binary.Base64;
import org.opennms.ocs.inventory.client.request.Engine;
import org.opennms.ocs.inventory.client.request.Request;
import org.opennms.ocs.inventory.client.request.RequestFactory;
import org.opennms.ocs.inventory.client.request.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class OcsInventoryClientLogicImp.
 *
 * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
 */
class GeneralClientLogic {

    private static Logger LOGGER = LoggerFactory.getLogger(GeneralClientLogic.class);
    /**
     * The url.
     */
    protected static String m_url;
    /**
     * The url name space xml.
     */
    private static String m_urlNameSpaceXml;
    /**
     * The login.
     */
    private static String m_login;
    /**
     * The password.
     */
    private static String m_password;
    /**
     * The checksum.
     */
    private static String m_checksum;
    /**
     * The tags to include in the request
     */
    private static List<Tag> m_tags;
    /**
     * The soap connection.
     */
    protected SOAPConnection soapConnection;
    /**
     * The Constant ENGINE.
     */
    private static final String ENGINE = "FIRST";
    /**
     * The Constant ASKINGFOR.
     */
    protected String m_askingfor;
    /**
     * The Constant CHECKSUM.
     */
    private static final String DEFAULT_CHECKSUM = "4099";
    /**
     * The Constant WANTED.
     */
    private static final String WANTED = "1";
    /**
     * The Constant WEB__SERVICE_METHOD.
     */
    protected String m_web_service_method;

    /*
     * (non-Javadoc)
     * @see
     * org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic
     * #init(java.lang.String, java.lang.String, java.lang.String)
     */
    protected void init(String host, String login, String password) throws SOAPException {
    	init(host, login, password, null, new ArrayList<String>());
    }

    /*
     * (non-Javadoc)
     * @see
     * org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic
     * #init(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */

    protected void init(String host, String login, String password, String checksum) throws SOAPException {
        init(host, login, password, checksum, new ArrayList<String>());
    }
    
    /*
     * (non-Javadoc)
     * @see
     * org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic
     * #init(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    protected void init(String host, String login, String password, String checksum, List<String> tags) throws SOAPException {

        LOGGER.info("Initialization OCS Inventory Client");
        LOGGER.info("Init parameters: host=" + host + ", login=" + login);
        m_login = login;
        m_password = password;
        m_checksum = DEFAULT_CHECKSUM;
        if (checksum != null) {
        	m_checksum = checksum;
        }
        LOGGER.info("Using checksum value {}", m_checksum);

        m_tags = new ArrayList<Tag>();
        if (tags != null) {
            LOGGER.info("Including {} tags in request", tags.size());
            for (String tagName : tags) {
                Tag aTag = new Tag();
                aTag.setValue(tagName);
                m_tags.add(aTag);
            }
        }
        m_url = String.format("%s/ocsinterface", host);
        m_urlNameSpaceXml = String.format("%s/Apache/Ocsinventory/Interface", host);

        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        soapConnection = soapConnectionFactory.createConnection();

    }

    
    /**
     * Creates the soap request.
     *
     * @return the SOAP message
     * @throws Exception the exception
     */
    protected SOAPMessage createSOAPRequest(Integer offset) throws Exception {
        LOGGER.info("Create SOAP request");
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        LOGGER.debug("Create SOAP envelope");
        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        SOAPHeader header = envelope.getHeader();
        header.addNamespaceDeclaration("xsi", "http://www.w3.org/2001/XMLSchema-instance");
        header.addNamespaceDeclaration("soapenc", "http://schemas.xmlsoap.org/soap/encoding/");
        header.addNamespaceDeclaration("xsd", "http://www.w3.org/2001/XMLSchema");
        header.addNamespaceDeclaration("soap", "http://schemas.xmlsoap.org/soap/envelope/");

        MimeHeaders hd = soapMessage.getMimeHeaders();

        String authorization = Base64.encodeBase64String((m_login + ":" + m_password).getBytes());
        hd.addHeader("Authorization", "Basic " + authorization);
        LOGGER.debug("Create SOAP body");

        // SOAP Body
        RequestFactory objFact = new RequestFactory();
        Request request = objFact.createRequest();
        Engine eng = new Engine();
        eng.setValue(ENGINE);
        request.setEngine(eng);
        request.setAskingfor(m_askingfor);
        request.setChecksum(m_checksum);
        request.getTag().addAll(m_tags);
        request.setOffset(Integer.toString(offset));
        request.setWanted(WANTED);
        JAXBContext jaxbContext = JAXBContext.newInstance(Request.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        StringWriter writer = new StringWriter();
        jaxbMarshaller.marshal(request, writer);
        SOAPBody soapBody = envelope.getBody();

        QName bodyName = new QName(m_urlNameSpaceXml, m_web_service_method, XMLConstants.DEFAULT_NS_PREFIX);
        SOAPBodyElement bodyElement = soapBody.addBodyElement(bodyName);
        SOAPElement soapBodyElem1 = bodyElement.addChildElement("c-gensym3");
        soapBodyElem1.setTextContent(writer.toString());

        soapMessage.saveChanges();
        LOGGER.info("SOAP request created");
        return soapMessage;
    }    

}
