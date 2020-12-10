package com.xworkz.data.dto;

public class ComapanyDTO {
	private String name;
	private int noOfEmployees;
	private String location;
	private String email;
	private String website;
	
	
	public ComapanyDTO()
	{
		System.out.println("created ComapanyDTO");
	}
	
	public ComapanyDTO(String name,int noOfEmployees)
	{
		System.out.println("2 parameter constrctor");
		this.name=name;
		this.noOfEmployees=noOfEmployees;
	}

	public ComapanyDTO(String location, String email,String website)
	{
		System.out.println("3 parameter constrctor");
		this.location=location;
		this.email=email;
		this.website=website;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	
	
}
