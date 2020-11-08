public class TheaterTeser
{
	
	public static void main(String[] theater)
	{
		System.out.println("Invoked by main");
		
		TheaterFinder.findTheater("LAXMI");
		String theaterName="PVR";
		Theater enumTheaterName=Theater.valueOf(theaterName);
		TheaterFinder.findTheaterUsingEnum(enumTheaterName);
		
		
		
	}
	
}