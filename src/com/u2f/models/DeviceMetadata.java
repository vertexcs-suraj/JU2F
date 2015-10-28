package com.u2f.models;

public class DeviceMetadata {

	private VendorInfo vendor;
	private DeviceInfo device;
	public VendorInfo getVendor() {
		return vendor;
	}
	public void setVendor(VendorInfo vendor) {
		this.vendor = vendor;
	}
	public DeviceInfo getDevice() {
		return device;
	}
	public void setDevice(DeviceInfo device) {
		this.device = device;
	}
	
}
