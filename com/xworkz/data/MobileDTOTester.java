package com.xworkz.data;

import com.xworkz.data.dto.*;

public class MobileDTOTester {

	public static void main(String[] args) {

		MobileDTO dto = new MobileDTO();
		System.out.println(dto.getModelName());

		MobileDTO dto1 =new MobileDTO("Redmi","blue", "48MP");
		System.out.println(dto1.getModelName());
		System.out.println(dto1.getColor());
		System.out.println(dto1.getCameraPixel());

		
		MobileDTO dto2 =new MobileDTO( (byte)8,"Medium");
		System.out.println(dto2.getSize());
		System.out.println(dto2.getStorage());
		
		

	}

}
