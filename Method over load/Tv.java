public class Tv
{
	public static void main(String[] args)
	{
		telicasting("Udaya");
		telicasting(345);
		telicasting(89.94f);
		telicasting("A");
		
	}
	
	public static void telicasting(String channelName)
	{
		System.out.println("The channel Name is :"+channelName);
	}
	
	public static void telicasting(int channelNo)
	{
		System.out.println("The channel no is:"+channelNo);
	}
	
	public static void telicasting(float succesPercentage)
	{
		System.out.println("The percentage is :"+succesPercentage);
	}
	
	public static void telicasting(char grade)
	{
		System.out.println("The grade is :"+grade);
	}	
}