public class Location
{
	public static void main(String[] snames)
	{
		System.out.println(" JVM invoked main");
		
		
		for(int state=0;state<snames.length;state++)
		{
			System.out.println("the place is "+state);
			String nameOfState=snames[state];
			System.out.println("the state name is "+nameOfState);
		}
		
		System.out.println("EXIT :: main");
	}
}