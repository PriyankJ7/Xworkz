package com.xworkz.data;

import com.xworkz.data.dto.*;

public class CampanyDTOTester {

	public static void main(String[] args) {
		ComapanyDTO dto = new ComapanyDTO();
		System.out.println(dto.getName());

		ComapanyDTO dto1 = new ComapanyDTO("xwork", 1234);
		System.out.println(dto1.getName());
		System.out.println(dto1.getNoOfEmployees());

		ComapanyDTO dto2 = new ComapanyDTO("Bangalore", "contact@gmail.com", "www.xworkz.com");
		System.out.println(dto2.getLocation());
		System.out.println(dto2.getEmail());
		System.out.println(dto2.getWebsite());

	}

}
