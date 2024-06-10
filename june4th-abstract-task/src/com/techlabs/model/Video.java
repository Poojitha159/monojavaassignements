package com.techlabs.model;

public class Video extends Playable{
	
	private String title;
	private String resolution;
	
	
	
    public Video(String title, String resolution) {
		//super();
		this.title = title;
		this.resolution = resolution;
	}

	public void play() {
		System.out.println(title+" Video playing at "+resolution+" resolution");
	}
	
	public void pause() {
		System.out.println("Pause the "+title+" video");
	
	}
	
	public void stop() {
	
		System.out.println("Stop the " +title+" Video");
	}

}
