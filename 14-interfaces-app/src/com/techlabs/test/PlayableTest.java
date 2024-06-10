package com.techlabs.test;

import com.techlabs.model.AudioInterface;
import com.techlabs.model.PlayableInterface;
import com.techlabs.model.VideoInterface;

public class PlayableTest {

	public static void main(String[] args) {
		//PlayableInterface pi=new PlayableInterface();   //cannot create object to interface
		PlayableInterface pi;
		VideoInterface video=new VideoInterface("Victory","1080p");
				
	   video.play();
		video.pause();
		video.stop();
		video.dance();

		System.out.println('\n');
		
		
		AudioInterface audio=new AudioInterface("mounam");
		
		audio.play();
		audio.pause();
		audio.stop();
		
		System.out.println('\n');
		
		PlayableInterface p=new VideoInterface("legend","720p");
		p.play();
		p.pause();
		p.pause();
   
		//p.dance(); //not possible
		
		pi=new VideoInterface("wiining","420p");
		pi.play();
				
		//pi.dance();   //not possible
		
	}

}
