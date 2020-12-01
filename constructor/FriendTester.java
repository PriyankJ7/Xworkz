package com.xworkz.constructor;

public class FriendTester {

	public static void main(String[] args) 
	{
	 //default
		Friend frnd=new Friend();
		System.out.println(frnd.name);
		System.out.println(frnd.place);
		System.out.println(frnd.age);
		
		//parameter
		Friend frnd2=new Friend("Priyank","Hubli");
		System.out.println(frnd2.name);
		System.out.println(frnd2.place);
		
		Friend frnd3=new Friend("Priyank");
		System.out.println(frnd3.name);
		
		Friend frnd4=new Friend("Hubli", 22);
		System.out.println(frnd4.place);
		System.out.println(frnd4.age);
		
		Friend frnd5=new Friend(22,"Priyank");
		System.out.println(frnd5.age);
		System.out.println(frnd5.name);
	}

}
