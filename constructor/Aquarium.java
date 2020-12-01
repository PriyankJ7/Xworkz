package com.xworkz.constructor;

public class Aquarium {

	public String name;
	public String shape;
	public int cost;
	public String size;
	
	public Aquarium() {
		System.out.println("default");	
	}
	
	public Aquarium(String name,String shape,int cost,String size)
	{
		this.name=name;
		this.shape=shape;
		this.cost=cost;
		this.size=size;
		
		System.out.println("parameter");
		
	}
}
