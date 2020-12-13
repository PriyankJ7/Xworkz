package com.xworkz.transfer.tester;
import com.xworkz.transfer.*;

public class ICUTester2 {

	public static void main(String[] args) {
		ICU icu=new ICU(true,2500,true);
		icu.addmissionDetails("Priyank", "Eye Problem", "Dr.Kumar", "Paavana");
		ICUAdmissionDTO admissionDTO=icu.getAdmissionDTO();
		System.out.println(admissionDTO.getPatientName());
		System.out.println(admissionDTO.getDoctorName());
		System.out.println(admissionDTO.getNurseAssigned());
		System.out.println(admissionDTO.getSeverity());
		

	}

}
