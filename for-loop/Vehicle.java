// write class with method to return an array of car brancd, Then lopp the brands in the main method


public class Vehicle
{
	public static void main(String[] cname)
	{
		System.out.println("JVM invoked main");
		
		carBrands();
	System.out.println("Exit:: main");	
		
	}
	
	
	
	public static String[] carBrands()
	{
		
		
		String[] nameOfCarbrands={"Audi", "Honda", "Kia" , "Toyota"};
		
		System.out.println("size is "+nameOfCarbrands.length);
		
		for(int count=2;count<nameOfCarbrands.length;count++)
		{
			System.out.println("count :" +count);
			
			String message=nameOfCarbrands[count];
			System.out.println("car "+message);
		  
		}
		
		
		return nameOfCarbrands;
	}
	
	
}