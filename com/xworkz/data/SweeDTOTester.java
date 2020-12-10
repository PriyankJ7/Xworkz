package com.xworkz.data;

import com.xworkz.data.dto.Color;
import com.xworkz.data.dto.SweetDTO;

public class SweeDTOTester {

	public static void main(String[] args) {
		SweetDTO dto=new SweetDTO();
		System.out.println(dto.getName());
		
		
		//Colour[] clr=Color.values();
		//System.out.println(clr);

		SweetDTO dto1=new SweetDTO("Mysore Pak",350);
		System.out.println(dto1.getName());
		System.out.println(dto1.getPrice());
		
		SweetDTO dto2=new SweetDTO(500,2);
		System.out.println(dto2.getPrice());
		System.out.println(dto2.getQuantity());
		
	}

}
 