package com.xworkz.coffeeday;
import com.xworkz.coffeeday.appliances.*;

public class CoffeeMachineTester {

	public static void main(String[] args) {
		CoffeeMachine coffeeMachine=new CoffeeMachine(new Power());
		
		boolean success=coffeeMachine.grind("civet");
		
		if(success)
		{
			System.out.println("I know grinding was done");
		}else
		{
			System.out.println("grinding not done");
		}

	}

}
