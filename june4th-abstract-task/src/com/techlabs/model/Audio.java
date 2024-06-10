package com.techlabs.model;

public class Audio extends Playable{
	
	private String title;
	
	public Audio(String title) {
		super();
		this.title=title;
	}
	
	@Override
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
