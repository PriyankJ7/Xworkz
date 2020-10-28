public class Life
{
	public static void main(String[] test)
	{
		System.out.println("Invoked by JVM");
		
		String ageInString=test[0];
		int age=Integer.parseInt(ageInString);
	      String ageCl=LifeCycle.ageFormat(age);
		
		System.out.println("the age format is:"+ageCl);
	
	System.out.println("exit: main");
	}
}