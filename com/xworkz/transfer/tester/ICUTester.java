package com.xworkz.transfer.tester;
import com.xworkz.transfer.*;
public class ICUTester {

	public static void main(String[] args) {
	
		ICU icu=new ICU(true,1200,false);
		icu.addmissionDetails("Kavana", "fever", "Dr.Gouri", "Prabha");
		
		ICUAdmissionDTO dto=icu.getAdmissionDTO();
		System.out.println(dto.getPatientName());
		System.out.println(dto.getDoctorName());
		
		icu.updateDoctor("Arun Deshapande");
		System.out.println(dto.getDoctorName());
		
		
		

	}

}
