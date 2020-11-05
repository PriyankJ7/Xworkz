public class AddressTester
{
	public static void main(String[] values)
	{
		System.out.println("JVM invoked  main");
		
		short door=Address.doorNo;
		System.out.println(" the doo no is:" +door);
		
		String st=Address.street;
		System.out.println(" the street is :"+st);
		
		int pin=Address.pincode;
		System.out.println("the picode is:"+ pin);
		
		String c=Address.city;
		System.out.println("the city is:"+c);
		
	}
}