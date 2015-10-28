package com.u2f.models;

import java.util.Properties;

public class AuthenticateResponseData {

	private SignResponse authenticateResponse;
	private Properties properties;
	public SignResponse getAuthenticateResponse() {
		return authenticateResponse;
	}
	public void setAuthenticateResponse(SignResponse authenticateResponse) {
		this.authenticateResponse = authenticateResponse;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
}
