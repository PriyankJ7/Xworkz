package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.dto.*;

import carshowroom.carEnum.CarVariant;

/**
 * @author Priyank
 * 
 */

/**
 * @author Dell
 *
 */
/**
 * @author Dell
 *
 */
public class CarShowRoom {

	private String name;
	private String location;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[5];
	private int currentIndex = 0;
	private String tempCars;

	public CarShowRoom() {
		System.out.println("creatd CarShowRoom");
	}

	public CarShowRoom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

//add manager with name and contact no

	/**
	 * @param name
	 * @param contactNo Add the manager by using name and contact no
	 */
	public void addManager(String name, int contactNo) {
		if (name != null && contactNo != 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("manager added");
		} else {
			System.out.println("details are invalid");
		}
	}

	// add manager with ManagerDTO
	/**
	 * @param dto manager DTO
	 */
	public void addManager(ManagerDTO dto) {
		if (dto != null) {
			this.managerDTO = dto;
			System.out.println("manager added");
		} else {
			System.out.println("details are invalid");
		}
	}

//dispaly manager by checking not null value condition 

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());
		} else {
			System.out.println("Provide correct details");
		}
	}

//remove the manaeger 
	public void removeManager() {
		this.managerDTO = null;
	}

	// update the manager

	/**
	 * @param name update the manager by using ManagerDTO name
	 */
	public void updateManager(ManagerDTO name) {
		if (managerDTO != null) {
			this.managerDTO = name;
			System.out.println("new manager added");
		} else {
			System.out.println("Manager is not updated ");
		}

	}

	// add cars using CarDTO

	/**
	 * @param dto add cars using CarDTO
	 */
	public void addCars(CarDTO dto) {
		if (dto != null && currentIndex < 5) {

			this.cars[currentIndex] = dto;
			currentIndex++;
			System.out.println("car available at the index:" + this.currentIndex);
			System.out.println("car added");

		} else {
			if (dto == null) {
			}
			System.out.println("Car is not avaiable");
		}

	}

	// display cars
	public void dispalyCar() {
		CarDTO[] tempCars = this.cars;
		for (int i = 0; i < tempCars.length; i++) {
			CarDTO dto = tempCars[i];
			System.out.println(dto);
			System.out.println(dto.getModel());
			System.out.println(dto.getPrice());
			System.out.println(dto.getVariants());
		}
	}
//update the car using variant

	/**
	 * @param newVariant
	 * @param newIndexToUpdate update the car using variant
	 */
	public void updateCarVariant(CarVariant newVariant, int newIndexToUpdate) {
		if (newVariant != null && newIndexToUpdate >= 0 && newIndexToUpdate < 5) {
			System.out.println("Car is at index of :" + newIndexToUpdate);
			System.out.println("Variant is :" + newVariant);

			CarDTO carDTO = this.cars[newIndexToUpdate];
			System.out.println("car model is :" + carDTO.getModel());
			carDTO.setVariants(newVariant);
		}

	}

	// Check the car using index

	/**
	 * @param index Check the car using index
	 */
	public void CarAtIndex(int index) {
		if (index > 0 && index < 5) {
			System.out.println("the index is :" + index);

			CarDTO carDto = this.cars[index];
			System.out.println(carDto.getModel());
			System.out.println(carDto.getPrice());
			System.out.println(carDto.getVariants());
		}
	}
//display car using model

	/**
	 * @param model display car using model
	 */
	public void displayByModel(String model) {
		if (model != null) {
			System.out.println("Search the modle :" + model);
			for (int index = 0; index < this.cars.length; index++) {
				CarDTO refDTO = cars[index];
				String localModel = refDTO.getModel();

				if (localModel.equals(model)) {
					System.out.println(cars[index].getPrice());
					System.out.println(cars[index].getVariants());
				}

			}
		}
	}

	// delete the model by index

	/**
	 * @param index delete the model by index
	 */
	public void deleteByIndex(int index) {

		for (int i = 0; i < 5; i++) {

			CarDTO ref = this.cars[i];
			if (ref.equals(ref)) {
				System.out.println(" index is valid");
				System.out.println(" car model is :" + ref.getModel());
				System.out.println("car price is :" + ref.getPrice());
				System.out.println("car variant is :" + ref.getVariants());
				break;
			} else {
				System.out.println("index is not found");
			}
		}
	}
	// delete by model

	/**
	 * @param model delete by model
	 */
	public void deleteByModel(String model) {
		boolean getCar = false;
		if (model != null) {
			for (int index1 = 0; index1 < cars.length; index1++) {
				CarDTO carDTO = this.cars[index1];
				String ref = carDTO.getModel();
				if (ref != null) {
					if (ref.equals(model)) {
						this.cars[index1] = null;
						System.out.println(" car model deleted " + model);
						getCar = true;
						break;
					}

				}
			}
		}

		if (getCar == false) {
			System.out.println(" car model is not deleted ");
		}
	}
}
