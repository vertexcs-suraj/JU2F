package com.u2f.models;

import java.util.Properties;


public class DeviceDescriptor {
	private String handle;
	private String created;
	private String lastUsed;
	private DeviceMetadata metadata;
	private Properties properties;
	private boolean compromised;
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		this.handle = handle;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getLastUsed() {
		return lastUsed;
	}
	public void setLastUsed(String lastUsed) {
		this.lastUsed = lastUsed;
	}
	public DeviceMetadata getMetadata() {
		return metadata;
	}
	public void setMetadata(DeviceMetadata metadata) {
		this.metadata = metadata;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public boolean isCompromised() {
		return compromised;
	}
	public void setCompromised(boolean compromised) {
		this.compromised = compromised;
	}
	
	
}
