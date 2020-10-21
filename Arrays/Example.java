class Example
{
public static void main(String[] args)
{
	
	System.out.println("This method is invoked by JVM");
	noOfChar();
}

public static void noOfChar()
{
	System.out.println("Ths method is invoked by main");
	
	char char1='A';
	char char2='g';
	char char3='d';
	char char4='t';
	char char5='p';
	char char6='k';
	char char7='l';
	char char8='b';
	char char9='w';
	char char10='c';
	
	char[] noOfChar={char1,char2,char3,char4,char5,char6,char7,char8,char9,char10};
	int size=noOfChar.length;
	System.out.println("Total no of characters :"+size);
	
	
	char index0=noOfChar[0];
	System.out.println(" The index is:"+ index0);
	
	char index1=noOfChar[1];
	System.out.println(" The index is:"+ index1);
	
	char index2=noOfChar[2];
	System.out.println(" The index is:"+ index2);
	
	char index3=noOfChar[3];
	System.out.println(" The index is:"+ index3);
	
	char index4=noOfChar[4];
	System.out.println(" The index is:"+ index4);
	
	char index5=noOfChar[5];
	System.out.println(" The index is:"+ index5);
	
	char index6=noOfChar[6];
	System.out.println(" The index is:"+ index6);
	
	char index7=noOfChar[7];
	System.out.println(" The index is:"+ index7);
	
	char index8=noOfChar[8];
	System.out.println(" The index is:"+ index8);
	
	char index9=noOfChar[9];
	System.out.println(" The index is:"+ index9);
	
	
	
	
	
}

}