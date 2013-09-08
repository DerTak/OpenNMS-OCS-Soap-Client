package org.opennms.ocs.inventory.client.request.logic;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.commons.codec.binary.Base64;
import org.opennms.ocs.inventory.client.response.Computers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class OcsInventoryClientLogicImp.
 *
 * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
 */
public class GetComputersLogic extends GeneralClientLogic {

    private static Logger LOGGER = LoggerFactory.getLogger(GetComputersLogic.class);
    
    /**
     * The Constant ASKINGFOR.
     */
    private static final String ASKINGFOR_INVENTORY = "INVENTORY";

    /**
     * The Constant WEB__SERVICE_METHOD.
     */
    private static final String WEB_SERVICE_METHOD_GET_COMPUTER = "get_computers_V1";
    
    /*
     * (non-Javadoc)
     * @see
     * org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic
     * #init(java.lang.String, java.lang.String, java.lang.String)
     */
    public void init(String host, String login, String password) throws SOAPException {
    	super.init(host, login, password, null, new ArrayList<String>());
    	initRequestParameter();
    }

    /*
     * (non-Javadoc)
     * @see
     * org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic
     * #init(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    
    public void init(String host, String login, String password, String checksum) throws SOAPException {
        super.init(host, login, password, checksum, new ArrayList<String>());
        initRequestParameter();
    }
    
    /*
     * (non-Javadoc)
     * @see
     * org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic
     * #init(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public void init(String host, String login, String password, String checksum, List<String> tags) throws SOAPException {
    	super.init(host, login, password, checksum, tags);
    	initRequestParameter();

    }
    
    /**
     * Inits the request parameter.
     */
    private void initRequestParameter(){
    	m_askingfor = ASKINGFOR_INVENTORY;
    	m_web_service_method = WEB_SERVICE_METHOD_GET_COMPUTER;
    	
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
}
