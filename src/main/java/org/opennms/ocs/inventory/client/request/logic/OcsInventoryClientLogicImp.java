package org.opennms.ocs.inventory.client.request.logic;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
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
import org.opennms.ocs.inventory.client.response.Computers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class OcsInventoryClientLogicImp.
 *
 * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
 */
public class OcsInventoryClientLogicImp implements OcsInventoryClientLogic {

    private static Logger LOGGER = LoggerFactory.getLogger(OcsInventoryClientLogicImp.class);
    /**
     * The url.
     */
    private static String m_url;
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
    private SOAPConnection soapConnection;
    /**
     * The Constant ENGINE.
     */
    private static final String ENGINE = "FIRST";
    /**
     * The Constant ASKINGFOR.
     */
    private static final String ASKINGFOR = "INVENTORY";
    /**
     * The Constant CHECKSUM.
     */
    private static final String DEFAULT_CHECKSUM = "4099";
    /**
     * The Constant WANTED.
     */
    private static final String WANTED = "119587";
    /**
     * The Constant WEB__SERVICE_METHOD.
     */
    private static final String WEB__SERVICE_METHOD = "get_computers_V1";

    /*
     * (non-Javadoc)
     * @see
     * org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic
     * #init(java.lang.String, java.lang.String, java.lang.String)
     */
    public void init(String host, String login, String password) throws SOAPException {
    	init(host, login, password, null, new ArrayList<String>());
    }
    
    /*
     * (non-Javadoc)
     * @see
     * org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic
     * #init(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public void init(String host, String login, String password, String checksum, List<String> tags) throws SOAPException {

        LOGGER.info("Initialization OCS Inventory Client");
        LOGGER.info("Init parameters: host=" + host + ", login=" + login);
        m_login = login;
        m_password = password;
        m_checksum = DEFAULT_CHECKSUM;
        if (checksum != null) {
        	m_checksum = checksum;
        }
        LOGGER.info("Using checksum value {}", m_checksum);
        
        LOGGER.info("Including {} tags in request", tags.size());
        m_tags = new ArrayList<Tag>();
        for (String tagName : tags) {
            Tag aTag = new Tag();
            aTag.setValue(tagName);
            m_tags.add(aTag);
        }

        m_url = String.format("%s/ocsinterface", host);
        m_urlNameSpaceXml = String.format("%s/Apache/Ocsinventory/Interface", host);

        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        soapConnection = soapConnectionFactory.createConnection();

    }

    /*
     * (non-Javadoc)
     * @see
     * org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic
     * #getComputers()
     */
    public Computers getComputers() throws SOAPException, Exception {
        Computers computers = new Computers();
        JAXBContext jaxbContext = JAXBContext.newInstance(Computers.class);
        Unmarshaller jaxbMarshaller = jaxbContext.createUnmarshaller();

        Integer offset = 0;
        Boolean isEverythingRequested = false;
        while (!isEverythingRequested) {
            LOGGER.info("Prepare call web service from OCS server with offset " + offset);
            SOAPMessage soapResponse;

            soapResponse = soapConnection.call(createSOAPRequest(offset), m_url);

            LOGGER.info("Web service are already called from OCS server, parse response");
            SOAPBody spBody = soapResponse.getSOAPBody();
            SOAPElement soapElement = (SOAPElement) spBody.getChildElements().next();

            String content;
            for (int i = 1; i < soapElement.getChildNodes().getLength() - 1; i++) {
                content = soapElement.getChildNodes().item(i).getTextContent();

                if (Base64.isBase64(content)) {
                    content = new String(Base64.decodeBase64(content.getBytes()));
                }
                soapElement.getChildNodes().item(i).setTextContent(content + "\n");
            }

            content = soapElement.getTextContent();
//            LOGGER.info("For offset " + offset + " got content: " + content);
            InputStream is = new ByteArrayInputStream(content.getBytes());
            Computers computersFromThisRequest = (Computers) jaxbMarshaller.unmarshal(is);
            if (computersFromThisRequest.getComputers().isEmpty()) {
                isEverythingRequested = true;
            }
            computers.getComputers().addAll(computersFromThisRequest.getComputers());

            offset++;
        }
        LOGGER.info("OCS Inventory Client provided " + computers.getComputers().size() + " computers.");
        return computers;
    }

    /**
     * Creates the soap request.
     *
     * @return the SOAP message
     * @throws Exception the exception
     */
    private static SOAPMessage createSOAPRequest(Integer offset) throws Exception {
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
        request.setAskingfor(ASKINGFOR);
        request.setChecksum(m_checksum);
        request.getTag().addAll(m_tags);
        request.setOffset(Integer.toString(offset));
//        request.setWanted(WANTED);
        JAXBContext jaxbContext = JAXBContext.newInstance(Request.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        StringWriter writer = new StringWriter();
        jaxbMarshaller.marshal(request, writer);
        SOAPBody soapBody = envelope.getBody();

        QName bodyName = new QName(m_urlNameSpaceXml, WEB__SERVICE_METHOD, XMLConstants.DEFAULT_NS_PREFIX);
        SOAPBodyElement bodyElement = soapBody.addBodyElement(bodyName);
        SOAPElement soapBodyElem1 = bodyElement.addChildElement("c-gensym3");
        soapBodyElem1.setTextContent(writer.toString());

        soapMessage.saveChanges();
        LOGGER.info("SOAP request created");
        return soapMessage;
    }
}
