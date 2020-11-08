public class TheaterFinder
{
public static void findTheater(String theaterName)
{
System.out.println("invoked findTheater");
System.out.println(" arg 1 theater "+theaterName);
switch(theaterName)
{
	case "PVR":
		System.out.println("case is"+theaterName);
		break;
		
    case "LAXMI":
		System.out.println("case is"+theaterName);
		break;
		
	case "KRISHNA":
		System.out.println("case is"+theaterName);
		break;
		
	case "MAHAL":
		System.out.println("case is"+theaterName);
		break;
		
	case "KAMAL":
		System.out.println("case is"+theaterName);
		break;
	default :
				System.out.println("no theatermacthed");

	
}
				System.out.println("EXIT::findTheater");
}

public static void findTheaterUsingEnum(Theater theaterName)
{
System.out.println("invoked findTheater");
System.out.println(" arg 1 theater "+theaterName);
switch(theaterName)
{
	case PVR:
		System.out.println("case is"+theaterName);
		break;
		
    case LAXMI:
		System.out.println("case is"+theaterName);
		break;
		
	case KRISHNA:
		System.out.println("case is"+theaterName);
		break;
		
	case MAHAL:
		System.out.println("case is"+theaterName);
		break;
		
	case KAMAL:
		System.out.println("case is"+theaterName);
		break;
	default :
	System.out.println("no institute matched");
	}
	
	System.out.println("EXIt::findTheaterUsingEnum ");
}
}