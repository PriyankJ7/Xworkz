package com.xworkz.data;
import java.util.Arrays;

import com.xworkz.data.dto.*;

public class PlayerDTOTester {

	public static void main(String[] args) {
		
		PlayerDTO dto=new PlayerDTO();
		
		dto.setName("Dhoni");
		dto.setCountry("India");
		
		String[] sportsname= new String[3];//Arrays of sports Name
		sportsname[0]="Boxing";
		sportsname[1]="Criecket";
		sportsname[2]="football";
		
		System.out.println(Arrays.toString(sportsname));
		
		String[] awardList=new String[3];
		awardList[0]="Arjuna";
		awardList[1]="Drona";
		awardList[2]="Khel Ratna";
		dto.setAwards(awardList);
		
		PlayerDTO dto2=new PlayerDTO();
		dto2.setCountry("USA");
		dto2.setName("Sachin");
		String[] awardsList=null;
		dto2.setAwards(awardsList);
	}

}
