package com.techlabs.model;

public class Light implements SmartDevice,Controllable ,Monitorable{
	
	private String deviceId;
	private String name;
	private boolean on;
	
	
	
	
	public Light(String deviceId, String name) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.on = on;
	}

	@Override
	public void turnOn() {
		on=true;
		System.out.println(name+" Light ON");
		
	}

	@Override
	public void turnOff() {
		on=false;
		System.out.println(name+" Light OFF");
		
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
		
		return on;
	}
    @Override
	public String getStatus() {
		 return name+" is "+(on?"On":"Off");
	}
}
