package com.xworkz.constructor;

public class SeasonTester {

	public static void main(String[] args) {
		
		Season season1=new Season(); //default constructor
		System.out.println(season1.name);
		System.out.println(season1.startMonth);
		
		//Parameter constructor
		Season season2=new Season("Summer","May");
		System.out.println(season2.name);
		System.out.println(season2.startMonth);
		
		
		
		

	}

}
