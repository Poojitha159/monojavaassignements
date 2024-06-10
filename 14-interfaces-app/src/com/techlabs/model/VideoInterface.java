package com.techlabs.model;

public class VideoInterface implements PlayableInterface{
	
	private String title;
	private String resolution;
	
	

	public VideoInterface(String title,String resolution) {
		super();
		this.title=title;
		this.resolution=resolution;
		
	}

	
	public void play() {
		System.out.println("Play the video"+title+"with "+resolution+" resolution");
		
		
	}

	@Override
	public void pause() {
		System.out.println("Pause  the "+title);
		
	}

	@Override
	public void stop() {
		System.out.println("Stop playing the "+title+" video");
	}

	public void dance() {
		System.out.println("Dancing the "+title+" video");
		
	}
}
