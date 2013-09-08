package org.opennms.ocs.inventory.client.request.logic;

import java.util.List;

import org.opennms.ocs.inventory.client.response.Computers;
import org.opennms.ocs.inventory.client.response.snmp.SnmpDevices;

/**
 * The Class OcsInventoryClientLogicExecuter.
 */
public class OcsInventoryClientLogicExecuter {
	
	/** The get computer logic. */
	private GetComputersLogic getComputerLogic = new GetComputersLogic();
	
	/** The get snmp devices logic. */
	private GetSnmpDevicesLogic getSnmpDevicesLogic = new GetSnmpDevicesLogic();
	
	public Computers getComputers(String host, String login, String password) throws Exception{
		getComputerLogic.init(host, login, password);
		return getComputerLogic.getComputers();
		
	}
	public Computers getComputers(String host, String login, String password, String checksum) throws Exception{
		getComputerLogic.init(host, login, password, checksum);
		return getComputerLogic.getComputers();
		
	}
	
	public Computers getComputers(String host, String login, String password, String checksum, List<String> tags) throws Exception{
		getComputerLogic.init(host, login, password, checksum, tags);
		return getComputerLogic.getComputers();
		
	}
	
	public SnmpDevices getSnmpDevices(String host, String login, String password) throws Exception{
		getSnmpDevicesLogic.init(host, login, password);
		return getSnmpDevicesLogic.getSnmpDevices();
		
	}
	public SnmpDevices getSnmpDevices(String host, String login, String password, String checksum) throws Exception{
		getSnmpDevicesLogic.init(host, login, password, checksum);
		return getSnmpDevicesLogic.getSnmpDevices();
		
	}
	
	public SnmpDevices getSnmpDevices(String host, String login, String password, String checksum, List<String> tags) throws Exception{
		getSnmpDevicesLogic.init(host, login, password, checksum, tags);
		return getSnmpDevicesLogic.getSnmpDevices();
		
	}

}
