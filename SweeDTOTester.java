package com.xworkz.data;

import java.util.Arrays;

import com.xworkz.data.constants.Shape;
import com.xworkz.data.dto.SweetDTO;

public class SweeDTOTester {

	public static void main(String[] args) {
		
		
		SweetDTO dto=new SweetDTO();	
		System.out.println(dto.getName());
		
	String[] color=new String[3];
	color[0]="White";
	color[1]="Orange";
	color[2]="yellow";

		SweetDTO dto1=new SweetDTO("Laadu",color, Shape.ROUND);
	    dto1.setPopularState("Tirupati");
	    dto1.setPrice(600);
	    System.out.println(dto1.getName());
	    System.out.println(dto1.getShape());
		System.out.println(Arrays.toString(dto1.getColor()));
		
		SweetDTO dto2=new SweetDTO(500,2);
		System.out.println(dto2.getPrice());
		System.out.println(dto2.getQuantity());
		
	}

}
 