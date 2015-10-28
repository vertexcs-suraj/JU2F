package com.u2f.models;

public class SignResponse {

	private String keyHandle;
	private String signatureData;
	private String clientdata;
	public String getKeyHandle() {
		return keyHandle;
	}
	public void setKeyHandle(String keyHandle) {
		this.keyHandle = keyHandle;
	}
	public String getSignatureData() {
		return signatureData;
	}
	public void setSignatureData(String signatureData) {
		this.signatureData = signatureData;
	}
	public String getClientdata() {
		return clientdata;
	}
	public void setClientdata(String clientdata) {
		this.clientdata = clientdata;
	}
	
}
