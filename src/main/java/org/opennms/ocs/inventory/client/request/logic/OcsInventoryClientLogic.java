package org.opennms.ocs.inventory.client.request.logic;

import javax.xml.soap.SOAPException;

import org.opennms.ocs.inventory.client.response.Computers;

/**
 * The Interface OcsInventoryClientLogic.
 *
 * @author <A HREF="mailto:sergey.ovsyuk@gmail.com">Sergey Ovsyuk </A>
 */
public interface OcsInventoryClientLogic {

    /**
     * Inits the client with a default checksum value.
     *
     * @param host the host
     * @param login the login
     * @param password the password
     * @throws SOAPException 
     */
    void init(String host, String login, String password) throws SOAPException;

    /**
     * Inits the client.
     *
     * @param host the host
     * @param login the login
     * @param password the password
     * @param checksum the checksum
     * @throws SOAPException 
     */
    void init(String host, String login, String password, String checksum) throws SOAPException;

    /**
     * Gets the computers.
     *
     * @return the computers
     * @throws Exception 
     * @throws SOAPException 
     */
    Computers getComputers() throws SOAPException, Exception;
}
