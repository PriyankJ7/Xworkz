class Percentage
{
public static void main(String[] args)
{
System.out.println("invoked main method by JVM");
arrayOfPercentage();
}

public static void arrayOfPercentage()
{
	System.out.println("This method is invoked by main");
	int sslcPercentage=88;
	int pucPercentage=82;
	int degreePercentage=72;
	
	
	int[] allPercentages={sslcPercentage,pucPercentage,degreePercentage};
	
        int noOfPercentages=allPercentages.length;
		System.out.println("total no of percentages :"+noOfPercentages);
		
		 int index1=allPercentages[0];
		System.out.println("The index one is :"+index1);

	 int index2=allPercentages[1];
		System.out.println("The index two is :"+index2);

		 


		

}

}