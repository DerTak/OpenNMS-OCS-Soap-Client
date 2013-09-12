package org.opennms.ocs.inventory.client.request.logic.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogicExecuter;
import org.opennms.ocs.inventory.client.response.Computer;
import org.opennms.ocs.inventory.client.response.Computers;
import org.opennms.ocs.inventory.client.response.Entry;
//import org.opennms.core.test.MockLogAppender;

public class OCSInventoryClientIntegrationTest {

    /**
     * The host.
     */
    private String host = "http://doku.informatik.hs-fulda.de";
    /**
     * The login.
     */
    private String login = "ocs-soap";
    /**
     * The password.
     */
    private String password = "ocsrockz";

    @Before
    public void setUp() throws Exception {
//        MockLogAppender.setupLogging();
    }

    @Test
    public void test() {
    	OcsInventoryClientLogicExecuter executer = new OcsInventoryClientLogicExecuter();
        try {

            Computers  computers = executer.getComputers(host, login, password);

            assertNotNull(computers);
            for (Computer cmp : computers.getComputers()) {
                System.out.println("hardware: " + cmp.getHardware().getIpsrc());
                for(Entry entry: cmp.getAccountInfo().getEntries()){
                	System.out.println("Name: " + entry.getName());
                	System.out.println("Value: " + entry.getValue());
                }
                System.out.println(cmp.getAccountInfo());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
