package com.xworkz.basics.pocket;

public class PocketTester {

	public static void main(String[] args) {
		
		 PocketMoneyEstimator.request(30,"Monday");
		 PocketMoneyEstimator.request(100,"Teusday");
		 
		 
		 PocketMoneyEstimator.expendeture(100);
		 
		 double cash=PocketMoneyEstimator.getTotalAmount();
		 System.out.println("toat is :"+cash);
		 
		
		
		// TODO Auto-generated method stub

	}

}

