package com.xworkz.constructor.cpoies.init;
import com.xworkz.constructor.cpoies.*;
public class PaperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paper paper=new Paper("ClassMate",30.00f,12.00f,"White");
		String brandName=paper.getBrandName();
		float width=paper.getWidth();
		float length=paper.getLength();
		String color=paper.getColor();
		
		System.out.println(brandName);
		System.out.println(width);
		System.out.println(length);
		System.out.println(color);
		
		paper.setColor("black");
		color=paper.getColor();
		System.out.println("the updated:" +color);
		  
		
		
		

	}

}
