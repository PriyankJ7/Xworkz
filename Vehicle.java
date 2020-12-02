package com.xworkz.constructor.cpoies;

public class Vehicle {
	
	private int mfgDate;
	private String company;
	private int chasisNo;
	private String color;
	private String ownerName;
	
	public Vehicle(int mfgDate,String company,int chasisNo)
	{
		System.out.println("parameter");
		
		this.mfgDate=mfgDate;
		this.company=company;
		this.chasisNo=chasisNo;
		//this.color=color;
		//this.ownerName=ownerName;
		
		
	}

	public int getMfgDate() {
		return mfgDate;
	}

	public String getCompany() {
		return company;
	}

	public int getChasisNo() {
		return chasisNo;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println("color name is :"+ color);
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("Ownername is :"+ownerName);
	}

	

}
