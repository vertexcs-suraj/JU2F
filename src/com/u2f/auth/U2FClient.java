package com.u2f.auth;

import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;
import org.glassfish.jersey.client.ClientConfig;

import com.u2f.models.AuthenticateRequestData;
import com.u2f.models.AuthenticateResponseData;
import com.u2f.models.DeviceDescriptor;
import com.u2f.models.RegisterRequestData;
import com.u2f.models.RegisterResponseData;


public class U2FClient {

	private String APIToken = null;
	private String endPoint = null;
	ClientConfig cConfig = new ClientConfig(MOXyJsonProvider.class);
	private Client httpClient = ClientBuilder.newClient(cConfig);
//	private WebTarget trgt = null;
	public U2FClient(String endPoint,String token){
		this.endPoint = endPoint;
		APIToken = token;
	}
	
	public DeviceDescriptor[] list(String userid){
		
		return httpClient.target(endPoint).path(userid).request(MediaType.APPLICATION_JSON)
				.header("Authorization", "Bearer "+APIToken)
				.get(DeviceDescriptor[].class);
	}
	
	public void deleteAll(String userid){
		httpClient.target(endPoint).path(userid).request(MediaType.APPLICATION_JSON)
			.header("Authorization", "Bearer "+APIToken)
			.delete();
	}
	
	public RegisterRequestData initRegister(String userid){
		return httpClient.target(endPoint).path(userid+"/register").request(MediaType.APPLICATION_JSON)
				.header("Authorization", "Bearer "+APIToken)
				.get(RegisterRequestData.class);
	}
	
	public DeviceDescriptor completeRegister(String userid, RegisterResponseData respData){
		return httpClient.target(endPoint).path(userid+"/register").request(MediaType.APPLICATION_JSON)
				.header("Authorization", "Bearer "+APIToken)
				.post(Entity.entity(respData, MediaType.APPLICATION_JSON), DeviceDescriptor.class);
	}
	
	public AuthenticateRequestData initAuth(String userid){
		return httpClient.target(endPoint).path(userid+"/authenticate").request(MediaType.APPLICATION_JSON)
				.header("Authorization", "Bearer "+APIToken)
				.get(AuthenticateRequestData.class);
	}
	
	public DeviceDescriptor completeAuth(String userid,AuthenticateResponseData respData){
		return httpClient.target(endPoint).path(userid+"/authenticate").request(MediaType.APPLICATION_JSON)
				.header("Authorization", "Bearer "+APIToken)
				.post(Entity.entity(respData, MediaType.APPLICATION_JSON), DeviceDescriptor.class);
	}
	
	public DeviceDescriptor getDeviceProperties(String userid, String keyhandle){
		return httpClient.target(endPoint).path(userid+"/"+keyhandle).request(MediaType.APPLICATION_JSON)
				.header("Authorization", "Bearer "+APIToken)
				.get(DeviceDescriptor.class);
	}
	
	public DeviceDescriptor setDeviceProperties(String userid,String keyhandle,Properties props){
		return httpClient.target(endPoint).path(userid+"/"+keyhandle).request(MediaType.APPLICATION_JSON)
				.header("Authorization", "Bearer "+APIToken)
				.post(Entity.entity(props, MediaType.APPLICATION_JSON), DeviceDescriptor.class);
	}
	
	public void close(){
		httpClient.close();
	}
}
