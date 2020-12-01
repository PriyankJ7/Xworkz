package com.xworkz.constructor;

public class FruitTester {

	public static void main(String[] args) {
		
		Fruit fruitName=new Fruit();
		System.out.println(fruitName.name);
		
		
		Fruit fruitName2=new Fruit("Apple");
		System.out.println(fruitName2.name);
		
		String var=fruitName2.name;
		System.out.println(var);
		
		
		
		Fruit fruitName3=new Fruit("Banana",100);
		System.out.println(fruitName3.name);
		System.out.println(fruitName3.price);
		String bn=fruitName3.name;
		double pr=fruitName3.price;
		System.out.println(bn);
		System.out.println(pr);
		
		
		
		
		
		
		
		
		
		
	}

}
