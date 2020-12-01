package com.xworkz.constructor;

public class AquariumTester {

	public static void main(String[] args) {
		
		 Aquarium aqu=new  Aquarium();
		 {
			System.out.println(aqu.name);
			System.out.println(aqu.shape);
			System.out.println(aqu.cost);
			System.out.println(aqu.size);
		 }
		
		 Aquarium aqu2=new  Aquarium("Fish Mania","Round",1500,"Small");
		{
			 System.out.println(aqu2.name);
			 System.out.println(aqu2.shape);
			System.out.println(aqu2.cost);
			System.out.println(aqu2.size);
			 
			 }
		 
		 
	}

}
