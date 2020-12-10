package com.xworkz.data.dto;

public class SweetDTO {
	private String name;
	private int price;
	private int quantity;

	public SweetDTO() {
		System.out.println("created SweetDTO ");

	}
	
	public SweetDTO (String name,int price)
	{
		System.out.println("2 parameter constrctor");
		this.name=name;
		this.price=price;
		
	}
	
	public SweetDTO(int price,int quantity)
	{
		this.price=price;
		this.quantity=quantity;
		System.out.println("3 parameter constrctor");	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
