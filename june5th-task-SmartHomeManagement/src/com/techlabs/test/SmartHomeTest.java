package com.techlabs.test;

import com.techlabs.model.Light;
import com.techlabs.model.SecurityCamera;
import com.techlabs.model.SmartHome;
import com.techlabs.model.Thermostat;

public class SmartHomeTest {

	public static void main(String[] args) {
		
		SmartHome smart=new SmartHome(5);
		
		Light light=new Light("L1","Living Room light");
		
		Thermostat thermo=new Thermostat("T1","AC");
		
		SecurityCamera camera=new SecurityCamera("C1","Outside Room camera");
		
		
		
		smart.addDevices(light);
		smart.addDevices(thermo);
		smart.addDevices(camera);
		
		System.out.println('\n');
		
		smart.ControlDevice("L1", true);
		
		smart.ControlDevice("T1", true);
		
		//smart.ControlDevice("C1", true);
		//((Thermostat)thermo).setTemperature(20.5);
		
		thermo.setTemperature(50.6);
		
		//((SecurityCamera)camera).startRecording();
		camera.startRecording();
		System.out.println(camera.getStatus());
        System.out.println('\n');
		
		
		smart.listAllDevices();
		

	}

}
