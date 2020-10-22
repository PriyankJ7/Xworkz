public class Phone
{
public static void main(String[] box )
{
	System.out.println("method invoked by JVM");
	
	studentNames("Priyank");
	String name= "Pooja";
	studentNames(name);
	
	
} 

public static void studentNames(String sNames)
{
	System.out.println("method invoked by main");
	
	//length
	
	
	
	System.out.println("Student Name is:"+sNames);
	
		
}
}