 public class State
 {
	 public static void main(String[] state)
	 {
		 System.out.println("This method is invoked by JVM");
		 String[] stateNames={"Karnata",
		 "Andra Pradesh",
		 "Assam", 
		 "Bihar",
		 "Goa",
		 "Gujarat",
		 "Haryana",
		 "Himachal Pradesh",
		 "Jammu and Kashmer", 
		 "Keral",
		 "Maharastra",
		 "Manipur",
		 "Panjab",
		 "Rajastan",
		 "Sikkim",
		 "Tamil Nadu"};
		 
		 nameOfState(stateNames);
		 
		 System.out.println("main exit");
	 }
		 
	 
	 public static void nameOfState(String[] names)
	 {
		 System.out.println("Method invoked by main");
		 
		 int SizeOfState=names.length;
		 System.out.println("No of States are :"+SizeOfState );
		 
		 String indexname1=names[1];
		 System.out.println(" The index one is :"+indexname1);
		  
		 String indexname2=names[2];
		 System.out.println(" The index two is :"+indexname2);
		  
		 String indexname3=names[3];
		 System.out.println(" The index three is :"+indexname3);
		  
		 String indexname4=names[0];
		 System.out.println(" The index four is :"+indexname4);
		  
		 String indexname5=names[5];
		 System.out.println(" The index five is :"+indexname5);
		 	 
	 }	 

	 
 }