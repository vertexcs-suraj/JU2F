package com.u2f.models;

public class RegisterRequestData {

	private SignRequest[] authenticateRequests;
	private RegisterRequest[] registerRequests;
	public SignRequest[] getAuthenticateRequests() {
		return authenticateRequests;
	}
	public void setAuthenticateRequests(SignRequest[] authenticateRequests) {
		this.authenticateRequests = authenticateRequests;
	}
	public RegisterRequest[] getRegisterRequests() {
		return registerRequests;
	}
	public void setRegisterRequests(RegisterRequest[] registerRequests) {
		this.registerRequests = registerRequests;
	}
	
}
