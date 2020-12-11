package com.xworkz.data.dto;
import com.xworkz.data.constants.*;

public class SweetDTO {
	private String name;
	private int price;
	private int quantity;
	private String popularState;
	private String[] color;
	private Shape shape;
	
	
	public SweetDTO() {
		System.out.println("created SweetDTO ");

	}
	
	public SweetDTO (String name,String[] color, Shape shape)
	{
		System.out.println("2 parameter constrctor");
		this.name=name;
		
		this.color=color;
		this.shape=shape;
		
	}
	public SweetDTO(int price,int quantity)
	{
		this.price=price;
		this.quantity=quantity;
		System.out.println("3 parameter constrctor");	
	}
	
	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String getPopularState() {
		return popularState;
	}

	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}

	public String[] getColor() {
		return color;
	}

	public void setColor(String[] color) {
		this.color = color;
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
