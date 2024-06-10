package com.techlabs.model;

public class SmartHome{
	
	private SmartDevice[] devices;
	int deviceCount;
	
	private int count;
	
	
	
	
	/*public SmartHome(SmartDevice[] devices, int count) {
		super();
		this.devices = devices;
		this.count = count;
	}*/




	public SmartHome(int deviceCount) {
		super();
		this.devices=new SmartDevice[deviceCount];
	    this.deviceCount=deviceCount;
	    
	}

	public String addDevices(SmartDevice device) {
		if(count<devices.length) {
			devices[count++]=device;
			System.out.println(device.getName()+" added to SmartHome. ");
		}
		return ("SmartHome is full.Cannot add "+device.getName()); 
	}
	
	public void ControlDevice(String deviceId,boolean turnOn) {
		for(SmartDevice device:devices) {
			if(device!=null && device.getDevice().equals(deviceId) && device instanceof Controllable) {
				//if(device instanceof Controllable) {
					if(turnOn) {
						((Controllable)device).turnOn();
					}
					else {
						  ((Controllable)device).turnOff();
						
					}
					
					
			}
				/*else {
					System.out.println(device.getName()+" is not controllable.");
				}*/
				return;
			
		}
		System.out.println("Device with ID "+deviceId+" is not found");
	}
	
	public void listAllDevices() {
		System.out.println("List of all devices in SmartHome:");
		System.out.println('\n');
		
		/*for(int i=0;i<count;i++) {
			System.out.println(devices[i]);
		}*/
		
		
		for(SmartDevice device:devices) {
			if(device!=null) {
				//System.out.println(device.getName()+" : "+(device.isOn()? "On":"Off"));
				System.out.println(device.getName());
				if(device instanceof Monitorable) {
					System.out.println("Status: "+((Monitorable)device).getStatus());
				}
			}
		}
	}
}
