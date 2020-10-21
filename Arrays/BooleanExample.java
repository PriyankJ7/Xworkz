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

String waterConstant="false";
String starsCounts="false";
String traingle="true";

String[] noOfBoolean={waterConstant,starsCounts,traingle};

int number=noOfBoolean.length;
System.out.println("no of Boolean Statements :"+number );

String index0=noOfBoolean[0];
System.out.println(" the index is :" +index0);

String index1=noOfBoolean[1];
System.out.println(" the index is :" +index1);

String index2=noOfBoolean[2];
System.out.println(" the index is :" +index2);


}


 }