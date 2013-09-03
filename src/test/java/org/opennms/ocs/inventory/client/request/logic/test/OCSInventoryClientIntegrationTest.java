package org.opennms.ocs.inventory.client.request.logic.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
//import org.opennms.core.test.MockLogAppender;
import org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic;
import org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogicImp;
import org.opennms.ocs.inventory.client.response.Computer;
import org.opennms.ocs.inventory.client.response.Computers;

public class OCSInventoryClientIntegrationTest {

    /**
     * The host.
     */
    private String host = "192.168.56.101";
    /**
     * The login.
     */
    private String login = "dev";
    /**
     * The password.
     */
    private String password = "dev";

    @Before
    public void setUp() throws Exception {
//        MockLogAppender.setupLogging();
    }

    @Test
    public void test() {
        OcsInventoryClientLogic ocsInventoryClientLogic = new OcsInventoryClientLogicImp();
        try {
            ocsInventoryClientLogic.init(host, login, password);

            Computers comp = ocsInventoryClientLogic.getComputers();

            assertNotNull(comp);
            for (Computer cmp : comp.getComputers()) {
                System.out.println("hardware: " + cmp.getHardware().getIpsrc());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
