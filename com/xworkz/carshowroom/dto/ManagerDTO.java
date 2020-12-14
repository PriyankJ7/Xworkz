package com.xworkz.carshowroom.dto;

public class ManagerDTO {

	private String name;
	private int contactNo;

	public ManagerDTO() {
		System.out.println("created ManagerDTO ");
	}

	public ManagerDTO(String name, int contactNo) {
		super();
		this.name = name;
		this.contactNo = contactNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

}
