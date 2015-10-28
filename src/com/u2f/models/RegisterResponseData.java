package com.u2f.models;

import java.util.Properties;

public class RegisterResponseData {

	private RegisterResponse registerResponse;
	private Properties properties;
	public RegisterResponse getRegisterResponse() {
		return registerResponse;
	}
	public void setRegisterResponse(RegisterResponse registerResponse) {
		this.registerResponse = registerResponse;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
}
