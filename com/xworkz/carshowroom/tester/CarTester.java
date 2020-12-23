package com.xworkz.carshowroom.tester;

import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;

import carshowroom.carEnum.CarVariant;

public class CarTester {

	/**
	 * @param args car tester
	 */

	public static void main(String[] args) {

		CarShowRoom carShowRoom = new CarShowRoom();

		CarDTO dto = new CarDTO();

		dto.setModel("Tata Nexon");
		System.out.println(dto.getModel());

		dto.setPrice(2000000);
		System.out.println(dto.getPrice());

		// enum
		dto.setVariants(CarVariant.TOP);
		System.out.println(dto.getVariants());

		carShowRoom.addCars(dto);
		// add car

		// second car

		CarDTO dto2 = new CarDTO("Jeep", 2500000, CarVariant.TOP);
		carShowRoom.addCars(dto2);
		System.out.println(dto2.getModel());
		System.out.println(dto2.getPrice());
		System.out.println(dto2.getVariants());

		CarDTO dto3 = new CarDTO("Maruti 800", 500000, CarVariant.BASE);
		carShowRoom.addCars(dto3);
		System.out.println(dto3.getModel());
		System.out.println(dto3.getPrice());
		System.out.println(dto3.getVariants());

		CarDTO dto4 = new CarDTO("Swift", 3000000, CarVariant.TOP);
		carShowRoom.addCars(dto4);
		System.out.println(dto4.getModel());
		System.out.println(dto4.getPrice());
		System.out.println(dto4.getVariants());

		CarDTO dto5 = new CarDTO("Suzuki", 5400000, CarVariant.TOP);
		carShowRoom.addCars(dto5);
		System.out.println(dto5.getModel());
		System.out.println(dto5.getPrice());
		System.out.println(dto5.getVariants());

		// display

		carShowRoom.dispalyCar();

		// update the car with variant ad index
		carShowRoom.updateCarVariant(CarVariant.BASE, 3);

		// display the car model by index value
		carShowRoom.CarAtIndex(2);

		// display the car by using the model name
		carShowRoom.displayByModel("Swift");

		// delete the car by index
		carShowRoom.deleteByIndex(3);
		

		// delete by model
		carShowRoom.deleteByModel("Jeep");
		
	}

}
