package com.xworkz.transfer;
import com.xworkz.transfer.*;
import com.xworkz.transfer.tester.*;

public class ICU {
	
	boolean ventilatorAvailable;
	double costPerDay;
	boolean tvAvailabe;
	ICUAdmissionDTO admissionDTO; 
	
	public ICU() {
		System.out.println("created ICU");
		
	}

	public ICU(boolean ventilatorAvailable, double costPerDay, boolean tvAvailabe) 
	{
		super();
		this.ventilatorAvailable = ventilatorAvailable;
		this.costPerDay = costPerDay;
		this.tvAvailabe = tvAvailabe;
	}
	
	public void addmissionDetails(String patientName, String severity,String doctorAssigned, String nurseAssigned)
	{
		if(patientName!=null && severity!=null && doctorAssigned!=null && nurseAssigned!=null)
		{
			System.out.println("details are validated........");
		
	this.admissionDTO=new ICUAdmissionDTO(patientName, severity, doctorAssigned, nurseAssigned); 

    }else
    {
    	System.out.println("details are not validated........beacuse of null contetnt");
    	
    }
	}
	
	public void updateDoctor(String newDoctorName)
	{
		this.admissionDTO.setDoctorName(newDoctorName);
	}

	
	public boolean isVentilatorAvailable() {
		return ventilatorAvailable;
	}

	public void setVentilatorAvailable(boolean ventilatorAvailable) {
		this.ventilatorAvailable = ventilatorAvailable;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public boolean isTvAvailabe() {
		return tvAvailabe;
	}

	public void setTvAvailabe(boolean tvAvailabe) {
		this.tvAvailabe = tvAvailabe;
	}

	public ICUAdmissionDTO getAdmissionDTO() {
		return admissionDTO;
	}

	public void setAdmissionDTO(ICUAdmissionDTO admissionDTO) {
		this.admissionDTO = admissionDTO;
	}
	
}
