public class Person
{
public static void main(String[] args)
{
System.out.println("this method invoked");
printEmail("priyank@gmail.com");
printLanguage("java");
}

public static void  printEmail( String param)
{
System.out.println("Email id :" +param);
}
public static void printLanguage(String val)
{
System.out.println("Language :"+ val);
}
}