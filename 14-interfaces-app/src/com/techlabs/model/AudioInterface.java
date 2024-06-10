package com.techlabs.model;

public class AudioInterface implements PlayableInterface {
	
	
     private String title;
	
		
	
    public AudioInterface(String title) {
		super();
		this.title=title;
		
	}

	public void play() {
		System.out.println("Audio palying");
		
	}
	
	public void pause() {
		System.out.println("Audio pausing");
	
	}
	
	public void stop() {
	
		System.out.println("Audio STOP");
	}

}
