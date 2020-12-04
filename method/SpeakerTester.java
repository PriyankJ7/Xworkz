package com.xworkz.method;
import com.xworkz.method.electronic.*;

public class SpeakerTester {

	public static void main(String[] args) {
		
		Speaker speaker=new Speaker("Red",6);
		System.out.println(speaker.getCompanyName());
		
		
		speaker.increaseVolume();
		speaker.onOrOff();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		
		

	}

}
