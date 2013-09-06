package org.opennms.ocs.inventory.client.request.logic.test;

import org.junit.Assert;
import org.junit.Test;
import org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogic;
import org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogicSnmpImp;
import org.opennms.ocs.inventory.client.response.snmp.SnmpDevices;

public class OCSInventoryClientIntegrationSnmpTest {

    /**
     * The host.
     */
    private String host = "http://192.168.56.101";
    /**
     * The login.
     */
    private String login = "dev";
    /**
     * The password.
     */
    private String password = "dev";


    @Test
    public void test() {
        OcsInventoryClientLogic ocsInventoryClientLogic = new OcsInventoryClientLogicSnmpImp();
        try {
            ocsInventoryClientLogic.init(host, login, password);

            SnmpDevices snmpDevices = ocsInventoryClientLogic.getSnmpDevices();
            
            Assert.assertNotNull(snmpDevices);
            System.out.println(snmpDevices.getSNMPDevices());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
