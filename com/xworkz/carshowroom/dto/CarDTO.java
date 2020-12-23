package com.xworkz.carshowroom.dto;

import carshowroom.carEnum.CarVariant;

public class CarDTO {
	private String model;
	private double price;
	private CarVariant variants;

	public CarDTO() {
		super();
	}

	public CarDTO(String model, double price, CarVariant variants) {
		super();
		this.model = model;
		this.price = price;
		this.variants = variants;

	}
	
	

	public CarDTO(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CarVariant getVariants() {
		return variants;
	}

	public void setVariants(CarVariant top) 
	{
		this.variants = top;
	}

	
	}

	


