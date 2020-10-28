// write a pgm to return the age.child.kid.teen.Adult, old

public class LifeCycle
{
	
	public static String ageFormat(int age)
	{
		System.out.println("invoked by ageFormat");
		System.out.println("age :"+age);
		
		if(age>=1 &&age<=5)
		{
			System.out.println("the age is child :" +age);
			return "child";
		}
		
		if(age>=5 && age<=12)
		{
			System.out.println("the age is kids:" +age);
			return "kids";
		}
		
		if(age>=13 && age<=19)
		{
			System.out.println("the age is teenage:" +age);
			return "teenage";
		}
		if(age>=20 && age<=50)
		{
			System.out.println("the age is adult:" +age);
			return "adult";
		}
		
		
		if(age>=50 && age<=100)
		{
			System.out.println("the age is old:" +age);
			return "old";
		}
	return "Chiranjivi";
	}
}
	
