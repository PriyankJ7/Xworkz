package com.xworkz.transfer;

public class Hospital {
	private String name;
	private String location;
	private int appointmentSlots=5;
	private AppointmentDTO AppointmentDTO;
	
	
	

	public  Hospital(String name,String location)
	{
		this.name=name;
		this.location=location;	
	}
	
	public void appointment(String name,long mobile,int age, String reason,String doctor)
	{
		this.AppointmentDTO=new AppointmentDTO(name, mobile, age, reason, doctor);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location) 
	{
		this.location = location;
	}

	public int getAppointmentSlots()
	{
		return appointmentSlots;
	}

	public void setAppointmentSlots(int appointmentSlots) 
	{
		this.appointmentSlots = appointmentSlots;
	}

	public AppointmentDTO getAppointmentDTO() 
	{
		return AppointmentDTO;
	}

	public void setAppointmentDTO(AppointmentDTO appointmentDTO) {
		AppointmentDTO = appointmentDTO;
	}
	
}
