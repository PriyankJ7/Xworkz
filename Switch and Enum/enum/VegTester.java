public class VegTester
{
	public static void main(String[] names)
	{
		String vegNames=names[0];
		Vegetable val=Vegetable.valueOf(vegNames);
		System.out.println("the veg is :" +val); 
	}
}j