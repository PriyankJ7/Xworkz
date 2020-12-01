package com.xworkz.constructor;

public class Season {
	
	public String name;
	public  String startMonth;
	
	public Season() {
		System.out.println("default");	
	}
	
	public Season(String name, String startMonth) {
		System.out.println("2 Parameteros");
		this.name=name;
		this.startMonth=startMonth;
		
	}
	
	

}
