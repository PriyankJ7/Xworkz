class Box
{
	public static void main(String[] args)
	{
		System.out.println(" Invoked the main method by jvm");
		
		ArrayOfEmais();
	}
	
	
	public static void ArrayOfEmais()
	{
		System.out.println("invoked by main method");
		
		String companyEmail="xworkxz@gmail.com";
		String personalEmail="priyank@gmail.com";
		String otherEmail="contact@gmail.com";
		
		String[] emails={companyEmail,personalEmail,otherEmail};
		    int arrayOfSize =emails.length;
			
			System.out.println("Total no of elements :"+arrayOfSize);
			
			String noOfIndex0= emails[0];
			System.out.println("The Index  zero is  :"+ noOfIndex0);
			
			String noOfIndex1= emails[1];
			System.out.println("The Index one  is :"+ noOfIndex1);
			
			String noOfIndex2= emails[2];
			System.out.println("The Index two is :"+ noOfIndex2);
			
			
			
		}
	
}