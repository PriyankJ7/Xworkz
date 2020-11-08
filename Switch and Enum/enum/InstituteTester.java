public class InstituteTester{


public static void main(String[] photos)
{

System.out.println("invoked main, doing switch and enum");

InstitueFinder.lowestAndBestUsingString("whatver");
	String instituteName="XWORKZ";
	Institute enumInstituteName=Institute.valueOf(instituteName);
InstitueFinder.lowestAndBestUsingEnum(enumInstituteName);

System.out.println("EXIT :: main, doing switch and enum");
}

}
