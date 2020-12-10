package com.xworkz.data.dto;

public class MobileDTO {
	private String modelName;
	private int price;
	private byte batteryBackup;
	private byte ram;
	private short Storage;
	private String size;
	private String color;
	private String cameraPixel;

	public MobileDTO() {
		System.out.println("created MobileDTO");
	}

	public MobileDTO(String modelName, String color, String cameraPixel) {
		System.out.println("3 parameters");
		this.modelName = modelName;
		
		this.color=color;
		this.cameraPixel = cameraPixel;
	}

	public MobileDTO(byte Storage, String size) {
		System.out.println("2 parameters");
		this.Storage = Storage;         
		this.size = size;
		//this.price=price;
		//this. batteryBackup= batteryBackup;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public byte getBatteryBackup() {
		return batteryBackup;
	}

	public void setBatteryBackup(byte batteryBackup) {
		this.batteryBackup = batteryBackup;
	}

	public byte getRam() {
		return ram;
	}

	public void setRam(byte ram) {
		this.ram = ram;
	}

	public byte getStorage() {
		return (byte) Storage;
	}

	public void setStorage(byte storage) {
		Storage = storage;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
	
	
		this.color = color;
	}

	public String getCameraPixel() {
		return cameraPixel;
	}

	public void setCameraPixel(String cameraPixel) {
		this.cameraPixel = cameraPixel;
	}

}
