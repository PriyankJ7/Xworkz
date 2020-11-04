public class Runner
{

public static void main(String[] names)
{
	System.out.println("JVM invoked main");
	System.out.println("pgm to print all the arguments of the main method");
	
	for(int loop=0;loop<names.length;loop++)
	{
		System.out.println("the loop is "+ loop);
		
		String mainMethodArgs=names[loop];
		System.out.println("the mainMethodArgs :"+mainMethodArgs);
	}
	
	System.out.println("Exit ::main");
}

}