package com.u2f.test;

import java.util.Properties;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.u2f.auth.U2FClient;
import com.u2f.models.DeviceDescriptor;
import com.u2f.models.RegisterRequest;
import com.u2f.models.RegisterRequestData;
import com.u2f.utils.Constants;

public class U2FTest {

	U2FClient client=null;
	String apiToken = null;
	@Before
	public void setUp() throws Exception {
		Properties props = new Properties();
		props.load(getClass().getResourceAsStream("/token"));
		apiToken = props.get("apitoken").toString();
		testU2FClient();
	}

	@Test
	public void testU2FClient() {
		client=new U2FClient(Constants.API_ENDPOINT, apiToken);
	}

	@Test
	public void testList() {
		DeviceDescriptor[] devices = client.list("testuser");
		for(DeviceDescriptor d:devices)
			System.out.println(d.getHandle());
		Assert.assertEquals(0, devices.length);
	}
	
	@Test
	public void testInitRegister(){
		RegisterRequestData rData = client.initRegister("testuser");
		RegisterRequest[] req = rData.getRegisterRequests();
		for(RegisterRequest r:req){
			System.out.println("AppId "+r.getAppId());
			System.out.println("Challenge "+r.getChallenge());
			System.out.println("Version "+r.getVersion());
		}
	}
	
	@After
	public void breakDown(){
		client.close();
	}

}
