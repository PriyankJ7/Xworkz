package com.xworkz.basics.pocket;

public class CredicardEstimator {
	
	private static double totalAmount;
	
	
	
	public static void expendeture(double amount)
	{
		System.out.println("invoked expendeture");
		
		System.out.println("1st arg is "+amount);
	
		
		//total
		totalAmount=totalAmount+amount;
		System.out.println("the total is :"+totalAmount);
		
		//Subtraction
			totalAmount=totalAmount-amount;
			System.out.println("the total is :"+totalAmount);
			System.out.println("EXIT :: expendeture");
	}
			
			
	public static double getTotalAmount()
	{
		return totalAmount;
	}
}


