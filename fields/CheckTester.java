public class CheckTester
{
public static void main(String[] args)
{
String MN=Check.motherName;
System.out.println("MN is:"+ MN);

 byte no=Check.staffInSchool;
 System.out.println("the staff no is:"+no);
 
 short bcheck=Check.balanceInBank;
 System.out.println("the balance is :"+bcheck);
 
 int fees=Check.collegeFees;
 System.out.println("fees :"+fees);
 
 long stars=Check.starsInSky;
 System.out.println("the stars :"+stars);
 
 double earth=Check.distanceBetweenSunAndEarth;
 System.out.println("the earth :"+earth);
 
 boolean tv=Check.tvIsLivingThing;
 System.out.println("the tv is "+tv);
 
  //change value

 String mtname=Check.motherName="Jayasree";
 System.out.println("motherName is:" +mtname);
 
 byte change=Check.staffInSchool=87;
 System.out.println("the change is :"+change);
 
 
}

}