package com.xworkz.method.electronic;

public class Speaker {

	
	private String companyName="JBL";
	private String color;
	private int batteryBackUpInHours;
	
	private boolean connected;
	
	private int maxValue=4;
	private int minValue=0;
	private int currentValue=0;
	
	
	public Speaker(String color,int batteryBackUpInHours)
	{
		this.batteryBackUpInHours=batteryBackUpInHours;
		this.color=color;
															
	System.out.println("ars 1:"+batteryBackUpInHours);
	System.out.println("args 2:"+color);
		}
	public void onOrOff()
	{
		System.out.println("speaker is :");
		
		if(this.connected==false)
		{
			this.connected=true;
			System.out.println("speaker is on");
			return;
		}else if(this.connected==true)
		{
			this.connected=false;
			System.out.println("speaker is off");
		}

	}
	
	public void increaseVolume()
	{
		if(this.connected==true)
		{
		
		if(this.currentValue<this.maxValue)
		{
			this.currentValue=this.currentValue+1;
			System.out.println("current value is :"+this.currentValue);
			
		}
		else{
			System.out.println("max reached");	
		}
		}
		else{
			System.out.println("Speaker is off");
		}
		
	}
	
	public void decreaseVolume() 
	{
		if(this.connected=true)
		{
			if(this.maxValue>this.minValue)
			{
				this.maxValue=this.maxValue-1;
				System.out.println("current volume is:"+this.maxValue);
			}
		
			else {
			System.out.println("min value reached");
			
		}
		}
	else {
		System.out.println("speaker off");
	
	}
	}
	
	
	
	
	
	
	public String getCompanyName() {
		return companyName;
	}

	public String getColor() {
		return color;
	}

	public int getBatteryBackUpInHours() {
		return batteryBackUpInHours;
	}
	
}
