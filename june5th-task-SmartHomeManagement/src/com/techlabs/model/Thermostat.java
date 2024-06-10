package com.techlabs.model;

public class Thermostat implements SmartDevice,Controllable,Monitorable {
	
	private String deviceId;
	private String name;
	private boolean on;
	private double temperature;
	
	

	public Thermostat(String deviceId, String name) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.on = true;
		this.temperature = temperature;
	}

	/*@Override
	public String getStatus() {
		
		return null;
	}*/

	@Override
	public void turnOn() {
		on=true;
		System.out.println(name+" turned ON");
		
	}

	@Override
	public void turnOff() {
		on=false;
		System.out.println(name+" turned OFF");
		
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
	
	
	public String getStatus() {
		
		return name+" is "+(on ? "On":"Off");
	}


	@Override
	public String toString() {
		return "Thermostat [deviceId=" + deviceId + ", name=" + name + ", on=" + on + ", temperature=" + temperature +"C"
				+ "]";
	}
	
	public void setTemperature(double temperature) {
		this.temperature=temperature;
		System.out.println(name+ " temperature set to "+temperature);
		
		
	}

	
}
