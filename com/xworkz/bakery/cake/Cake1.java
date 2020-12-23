package com.xworkz.bakery.cake;

public class Cake1 {

	private String flavour;
	private String shape;
	private double size;
	
	
	public void taste()
	{
		System.out.println("invoked taste");
	}


	public String getFlavour() {
		return flavour;
	}


	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}
	
	
	
}
