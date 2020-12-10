package com.xworkz.data;

import java.util.Arrays;

import com.xworkz.data.dto.CountryDTO;

public class CountryDTOTester {

	public static void main(String[] args) {

		CountryDTO dto = new CountryDTO();
		System.out.println(dto.getName());
		System.out.println(dto.getPopulation());

		CountryDTO dto1 = new CountryDTO("Russia", "asia");

		System.out.println(dto1.getName());
		System.out.println(dto1.getContinent());

		CountryDTO dto2 = new CountryDTO(123454321, "Modi", "Ram nath kovind");

		System.out.println(dto2.getPopulation());
		System.out.println(dto2.getPrimeMinister());
		System.out.println(dto2.getPresident());

		String[] allStates = new String[3];
		allStates[0] = "Karnataka";
		allStates[1] = "Goa";
		allStates[2] = "Madhya Pradesh";

		String[] AllLan = new String[4];
		AllLan[0] = "Kannada";
		AllLan[1] = "hindi";
		AllLan[2] = "Marati";
		AllLan[3] = "Tegalu";

		CountryDTO dto3 = new CountryDTO(allStates, AllLan);
		System.out.println(Arrays.toString(AllLan));
		System.out.println(Arrays.toString(allStates));

	}

}
