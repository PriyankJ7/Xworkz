package com.xworkz.transfer.tester;
import com.xworkz.transfer.AppointmentDTO;
import com.xworkz.transfer.Hospital;

public class HospitalTester {

	public static void main(String[] args) {
		Hospital hospital=new Hospital("victory","City market");
		
		hospital.appointment("Priyank",974534567,54,"fever","Dr.Komal");
		
		AppointmentDTO appointment=hospital.getAppointmentDTO();
		System.out.println("Patient name:" +appointment.getPatientName());
		System.out.println("mobile no:" +appointment.getMobileNumber());
		System.out.println("Doctor name:" +appointment.getDoctorName());
		
		
		
	
		
		
		
				

	}

}
