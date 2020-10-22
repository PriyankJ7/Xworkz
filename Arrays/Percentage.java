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
      float sslcPercentage=88.08f;
	  float pucPercentage=82.76f;
	  float degreePercentage=72.87f;
	
	
	 float[] allPercentages={sslcPercentage,pucPercentage,degreePercentage};
	
         float noOfPercentages=allPercentages.length;
		System.out.println("total no of percentages :"+noOfPercentages);
		
		 float index1=allPercentages[0];
		System.out.println("The index one is :"+index1);

	  float index2=allPercentages[1];
		System.out.println("The index two is :"+index2);

		 


		

}

}
