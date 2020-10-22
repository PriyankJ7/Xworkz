public class Place
{
	public static void main(String[] test)
	{
		System.out.println("Method invoked by JVM");
		
		String[] place={"Gadag", "Hubli", "Haveri"};
		NameOfPlace(place);
	}	
	
	public static void NameOfPlace(String[] pNames)
	{
		System.out.println("method invoked by main");
		
		//Check length 
		int size=pNames.length;
		System.out.println(" No of place are :"+size);
		
		//index
		
		String noOfIndex0=pNames[0];
		System.out.println("Palce index zero is :"+noOfIndex0);
		
		String noOfIndex1=pNames[1];
		System.out.println("Palce index one is :"+noOfIndex1);
		
		String noOfIndex2=pNames[2];
		System.out.println("Palce index two is :"+noOfIndex2);
		
		
	}
}