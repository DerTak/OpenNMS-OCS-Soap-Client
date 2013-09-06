package org.opennms.ocs.inventory.client.request.logic.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.opennms.ocs.inventory.client.request.logic.GetComputersLogic;
import org.opennms.ocs.inventory.client.request.logic.OcsInventoryClientLogicExecuter;
import org.opennms.ocs.inventory.client.response.Computer;
import org.opennms.ocs.inventory.client.response.Computers;
//import org.opennms.core.test.MockLogAppender;

public class OCSInventoryClientIntegrationTest {

/*    *//**
     * The host.
     *//*
    private String host = "http://192.168.56.101";
    *//**
     * The login.
     *//*
    private String login = "dev";
    *//**
     * The password.
     *//*
    private String password = "dev";*/
	
    /**
     * The host.
     */
    private String host = "https://ocs-test.bonnierdigitalservices.se";
    /**
     * The login.
     */
    private String login = "OpenNMS_System";
    /**
     * The password.
     */
    private String password = "0p3nNMS!";

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
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
