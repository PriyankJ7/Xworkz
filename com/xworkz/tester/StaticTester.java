package com.xworkz.tester;
import com.xworkz.concepts.staticproblem.Person;

public class StaticTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person.name="Yash";
		Person.dob="08/01/1986";
		Person.address="Basavangudi";
		
		Person.displayInfo();
		
		Person.name="Alia";
		//Person.dob="31/08/1993";
		//Person.address="Mumbai";
		
		Person.displayInfo();
	}

}
