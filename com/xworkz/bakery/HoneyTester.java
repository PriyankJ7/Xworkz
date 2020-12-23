package com.xworkz.bakery;
import com.xworkz.bakery.cake.*;
public class HoneyTester {

	public static void main(String[] args) {
		 Cake cake=new Cake();
		 cake.setFlavour("chacolate");
		 cake.setShape("round");
		 cake.setSize(267);		
		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());
 cake.taste();
 }

}
