public class SportTester
{
	public static void main(String[] sportName)
	{
		String sportCricket="CRICKET";
		Sport convertedCricketFromString=Sport.valueOf(sportCricket);
		System.out.println(convertedCricketFromString);
		
		Sport[] allSports=Sport.values();
		System.out.println(allSports.length);
		
		//length
		for(int sportInit=0;sportInit<allSports.length;sportInit++)
		{
			System.out.println("index "+sportInit);
			Sport sportvalue=allSports[sportInit];
			System.out.println("sport enum value :"+sportvalue);
			
		}
	}
}