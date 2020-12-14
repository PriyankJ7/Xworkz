package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.dto.*;

public class CarShowRoom {

	private String name;
	private String location;
	ManagerDTO managerDTO;

	public CarShowRoom() {
		System.out.println("creatd CarShowRoom");
	}

	public CarShowRoom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void addManager(String name, int contactNo) {
		if (name != null && contactNo != 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
		System.out.println("manager added");
		} else {
			System.out.println("detarils are invalid");
		}
	}

	public void addManager(ManagerDTO dto) {
		if (dto != null) {
			this.managerDTO = dto;
			System.out.println("manager added");
		} else {
			System.out.println("details are invalid");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());
		} else {
			System.out.println("Provide correct details");
		}
	}
	
	public void removeManager()
	{
		this.managerDTO=null;
	}
	
	
	
	public void updateManager(ManagerDTO name)
	{
		if(managerDTO!=null)
		{
			this.managerDTO=name;
		System.out.println("new manager added");
	}
	else
	{
		System.out.println("Manager is not updated ");
	}
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ManagerDTO getManagerDTO() {
		return managerDTO;
	}

	public void setManagerDTO(ManagerDTO managerDTO) {
		this.managerDTO = managerDTO;
	}

	
}
