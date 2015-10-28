package com.u2f.models;

public class DeviceInfo {

	private String deviceId;
	private String displayName;
	private String imageUrl;
	private String deviceUrl;
	private Selector[] selectors;
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getDeviceUrl() {
		return deviceUrl;
	}
	public void setDeviceUrl(String deviceUrl) {
		this.deviceUrl = deviceUrl;
	}
	public Selector[] getSelectors() {
		return selectors;
	}
	public void setSelectors(Selector[] selectors) {
		this.selectors = selectors;
	} 
	
}
