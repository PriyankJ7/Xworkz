package com.xworkz.basics.pocket;

public class PocketMoneyEstimator {
	
	private static double totalAmount;

	public static void request(double amount , String day)
	{
		System.out.println("invoked request");
		
		System.out.println("the 1st arg is :" +amount);
		System.out.println("The 2nd arg is "+day);
		
	
		//total amount 
		totalAmount=totalAmount+amount;
		System.out.println("the total is :"+ totalAmount);
		
		System.out.println("EXIT:: request");
	}
	
	public static void expendeture(double amount) {
		System.out.println("invoked expedeture");
		
		System.out.println("the 1st arg is :" +amount);
		//sub
		totalAmount=totalAmount-amount;
		System.out.println("the total is :"+ totalAmount);
		System.out.println("EXIT:: expendeture");
		
	}
	
	public static double getTotalAmount()
	{
		return totalAmount;
	}
	

}
