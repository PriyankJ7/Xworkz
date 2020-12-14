package com.xworkz.carshowroom.tester;

import com.xworkz.carshowroom.showroom.*;
import com.xworkz.carshowroom.dto.*;

public class CarShowRoomTester {

	public static void main(String[] args) {
		CarShowRoom carShowRoom = new CarShowRoom();

		carShowRoom.addManager("Mohan", 998653649);
		carShowRoom.displayManager();

		carShowRoom.removeManager();
		carShowRoom.displayManager();

		ManagerDTO managerDTO = new ManagerDTO("Kavita", 764524524);
		carShowRoom.updateManager(managerDTO);

		carShowRoom.displayManager();
		carShowRoom.addManager(managerDTO);
		carShowRoom.displayManager();
		
		ManagerDTO managerDTO2=new ManagerDTO("Manoj",934523453);
		carShowRoom.updateManager(managerDTO2);
		carShowRoom.displayManager();
		
	}

}
