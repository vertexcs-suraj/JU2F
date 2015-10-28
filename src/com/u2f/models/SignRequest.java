package com.u2f.models;

public class SignRequest {

	private String version;
	private String challenge;
	private String keyHandle;
	private String appId;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getChallenge() {
		return challenge;
	}
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	public String getKeyHandle() {
		return keyHandle;
	}
	public void setKeyHandle(String keyHandle) {
		this.keyHandle = keyHandle;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	
}
