package com.techlabs.test;

import com.techlabs.model.Audio;
import com.techlabs.model.Playable;
import com.techlabs.model.Video;

public class TestPlayable {

	public static void main(String[] args) {
		
		
		//Playable p=new Playable();
		
		
		Playable audio=new Audio("mounangane");
		
		audio.play();
		audio.pause();
		audio.stop();
		
		System.out.println('\n');
		
		Playable video=new Video("Victory","1080p");
		video.play();
		video.pause();
		video.stop();
		
		
		

	}

}
