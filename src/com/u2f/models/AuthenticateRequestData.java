package com.u2f.models;

public class AuthenticateRequestData {

	private SignRequest[] authenticateRequests;

	public SignRequest[] getAuthenticateRequests() {
		return authenticateRequests;
	}

	public void setAuthenticateRequests(SignRequest[] authenticateRequests) {
		this.authenticateRequests = authenticateRequests;
	}
	
}
