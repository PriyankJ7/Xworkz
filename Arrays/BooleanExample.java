 public class BooleanExample
 {
 public static void main(String[] args)
 {
 System.out.println("This method is invoked by JVM");
  booleanMethod();
 }
 
public static void booleanMethod()
{
System.out.println("Thsi method is invoked by main");

boolean waterConstant="false";
boolean starsCounts="false";
boolean traingle="true";

boolean[] noOfBoolean={waterConstant,starsCounts,traingle};

int number=noOfBoolean.length;
System.out.println("no of Boolean Statements :"+number );

boolean index0=noOfBoolean[0];
System.out.println(" the index is :" +index0);

boolean index1=noOfBoolean[1];
System.out.println(" the index is :" +index1);

boolean index2=noOfBoolean[2];
System.out.println(" the index is :" +index2);


}


 }
