public class Cricket
{
	public static void main(String[] test)
	{
		System.out.println("Invoked by JVM");
	playing("Sachin");	
	playing("KL Rohul", 8);
	playing("Kohli", "INDIA");
	playing(8,4);
	playing(7,"Bumhra");

	
	}
	

	public static void playing(String playersName)
	{
		System.out.println("The Players name is:"+playersName);
		
	}
	public static void playing(String playersName,int noOfPlayers)
	{
		System.out.println("playersName is :"+playersName);
		System.out.println("noOfPlayers is :"+noOfPlayers);
	}
	
	public static void playing(String playersName, String teamName)
	{
		System.out.println("playersName is:"+ playersName);
		System.out.println("teamName is :"+teamName);
	}
	
	public static void playing(int NoOfBatsmans, String nameOfBollers)
	{
		System.out.println("NoOfBatsmans is :"+NoOfBatsmans);
		System.out.println("noOfBollers is:"+nameOfBollers);
	}
	public static void playing(int noOfaudiance,int noOfCochers)
	{
	System.out.println("noOfaudianceis:" +noOfaudiance);
	System.out.println("noOfCochers is :"+noOfCochers);
	}
}