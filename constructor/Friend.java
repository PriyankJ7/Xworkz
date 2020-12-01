package com.xworkz.constructor;

public class Friend {
	public String name;
	public String place;
	public int age;
	
	public Friend()
	{
		System.out.println("default");
		
	}
	public Friend(String name, String place)
	{
		this.name=name;
		this.place=place;
		System.out.println("parameter");
	}
	
	public Friend(String name)
	{
		this.name=name;
		System.out.println("one parameter");
	}
	public Friend(String place, int age)
	{
		this.place=place;
		this.age=age;

		System.out.println("two parameter");
	}
	public Friend(int age,String name)
	{
		this.age=age;
		this.name=name;
System.out.println("two parameter");
	}
	

}
