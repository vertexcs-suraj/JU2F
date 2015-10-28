package com.u2f.models;

import java.util.Properties;

public class Selector {

	private String type;
	private Properties parameters;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Properties getParameters() {
		return parameters;
	}
	public void setParameters(Properties parameters) {
		this.parameters = parameters;
	}
	
}
