public class ColourTester
{
	public static void main(String[] val)
	{
		String colourValue="RED";
		Colour Converted=Colour.valueOf(colourValue);
		System.out.println("the colour value is :"+colourValue);
		
		
		Colour[] clr=Colour.values();
		System.out.println(clr.length);
		
		//length
		for(int box=0;box<clr.length;box++)
		{
			System.out.println("index "+box);
			
			Colour clrValue=clr[box];
			System.out.println("Colour enum values :"+clrValue);
		}
	}
}