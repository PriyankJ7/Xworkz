package com.xworkz.constructor.cpoies.init;
import com.xworkz.constructor.cpoies.*;

public class VehicleTester {

	private static Object color;

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle(2019,"Honda",702);
	// TODO Auto-generated method stub

		int mfgDate=vehicle.getMfgDate();
		String company=vehicle.getCompany();
		int chasisNo=vehicle.getChasisNo();
		//String color=vehicle.getColor();
		//String ownerName=vehicle.getOwnerName();
		
		System.out.println(mfgDate);
		System.out.println(company);
		System.out.println(chasisNo);
		//System.out.println(color);
		//System.out.println(ownerName);
		
	    String color="Gray";
		vehicle.setColor(color);
		
		
		
		
		String ownerName="Soichiro Honda";
		vehicle.setOwnerName( ownerName);
		
		
		
		
		
	}

}
