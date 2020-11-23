package com.xworkz.basics.pocket.string;

public class PernosalInfo {

	public static void main(String[] args) {
		
		System.out.println("JVM invoked main");
		
		String firstName="Priyank";
		System.out.println("First name :" +firstName);
		
		String lastName="Jirankalli";
		System.out.println("Last name is:"+ lastName);
		
		//toUpperCase()
		
	String convrted=firstName.toUpperCase();
	System.out.println("convrted is "+convrted);
	
	//toupperCase()
	
	String convrtedTo=firstName.toLowerCase();
	System.out.println("convrted is "+convrtedTo);
		
	//concat
	String fullName=firstName + lastName;
	System.out.println("full name is " +fullName);
	
	//concat
	
	String add=fullName.concat("Pinky");
	System.out.println(fullName);
	System.out.println("addition is :"+add);
	

	}

}
