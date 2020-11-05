public class CountryTester
{
	public static void main(String[] names)
	{
		System.out.println("JVM invocked");
		
		String name=Country.countryname;
		System.out.println("the country "+name);
		
		long ppl=Country.noOfPeople;
		System.out.println("the no of ppl is:"+ppl);
		 
		 
		 byte lan=Country.noOfLanguages;
		 System.out.println("the language is :"+lan);
		 
		 byte st=Country.noOfStates; 
		 System.out.println("the states are "+st);
		 
		 
		
	}
}