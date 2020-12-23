package com.xworkz.bakery.cake;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		 Person  p=new Person();  //Person variable type has a it self as a object
		 Person g=new Student();   //Person variable type has a object of student type means child class 
		 Person g=new GraduateStudent(); //Person variable type has a object of graduateStudent type means child class
		 
		 
		 Person p2=new Student();
		Student s2=(Person).p2;
		 
		
		 
		 
		 
	}
	
	

}








class Person
{
	String name;
	int age;
	String address;
	
}
class Student extends Person
{
	int marks;
	int rollNo;
	
}

class GraduateStudent extends Student
{
	String graduateDate;
}
