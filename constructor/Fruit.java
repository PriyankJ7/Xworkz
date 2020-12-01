package com.xworkz.constructor;

public class Fruit {
	
	public String name;
	public double price;
	
	public Fruit()
	{
		System.out.println("default constructor");
			
	}
	
	public Fruit(String name)
	{
		this.name=name;
		System.out.println("Paramter");
	}
	public Fruit(String name,double price)
	{
		System.out.println("2 parameter");
		this.name=name;
		this.price=price;
		
	}
	
	

	
}
