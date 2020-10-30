 public class Table
 {
	 
	 public static void main(String[] param)
	 {
		 System.out.println("invoked by JVM");
		 System.out.println(" main method args length is:"+param.length);
		 //one String
		 String str="Aptitude book";
		 holding(str);
		 
		 //two String
		 holding(str,"Story-book");
		 
		 //one String ,int
		 holding(str, 7);
		 
		 //int,String
		 holding(8,str);
	
		 
	 }
 public static  void holding(String something)
 {
	 System.out.println("invoked by holding");
	 System.out.println("Something :"+something);
 }
 
 public static void holding(String thing, String platesnames)
 {
	 System.out.println("invoked two parameters");
	 System.out.println("args 1 is:"+thing);
	  System.out.println("args 2 is:"+platesnames);
 }
 
 public static void holding(String thing,int noOfPlates)
 {
	 System.out.println("invoked two parameters");
	 System.out.println("args 1 is:"+thing);
	 System.out.println("args 2 is:"+noOfPlates);
 }
 public static void holding(int noOfPlates, String thing)
 {
	System.out.println("invoked two parameters");
	System.out.println("args 1 is:"+noOfPlates);
	System.out.println("args 2 is:"+thing);	
 }
 
 }