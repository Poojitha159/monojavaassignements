package com.techlabs.model;

public class SecurityCamera implements SmartDevice,Monitorable {
	
	private String deviceId;
	private String name;
	private boolean recording;
	
	//String getStatus();
	
	
	public SecurityCamera(String deviceId, String name) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.recording = true;
	}


	@Override
	public String getStatus() {
		
		return name+" is "+(recording ? "recording":"not recording");
	}


	@Override
	public String getDevice() {
		
		return deviceId;
	}


	@Override
	public String getName() {
		
		return name;
	}


	@Override
	public boolean isOn() {
		
		return recording;
	}
	
	public void startRecording() {
		recording=true;
		//System.out.println(name+" started recording");
	}
	
	public void stopRecording() {
		recording=false;
		
	}

}
