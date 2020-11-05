public class AllTester
{
public static void main(String[] args)
{
System.out.println("JVM invoked main");

System.out.println("  class HOME ");	
String HN=Home.homeName;
System.out.println("the hN is:"+HN);

byte np=Home.noOfPpl;
System.out.println(" ppl :"+np);

int sl=Home.salary;
System.out.println("the salary is :"+sl);

short things=Home.noOfthings;
System.out.println("the things are:"+ things);

long ppl=Home.populationOfIndia;
System.out.println("the population is:" +ppl);


System.out.println("Class Game");

String nm=Game.name;
System.out.println("the name is:" +nm);

byte p=Game.players;
System.out.println("the plyaers are :"+p);

int a=Game.account;
System.out.println("the account is :"+a);

short f=Game.noOfFans;
System.out.println("the fans are :"+f);

boolean s=Game.sunIsBlack;
System.out.println("the statement is :"+s);

System.out.println("Class Tv ");

String tv=Tv.TvName;
System.out.println("the tv name is:"+tv);

byte nc=Tv.noOfChannels;
System.out.println("the channels are :"+nc);

int am=Tv.amount;
System.out.println("the amount is:"+am);

short noC=Tv.noOfCustomers;
System.out.println("the no of customer is:"+noC);

boolean w=Tv.tvWorking;
System.out.println("tv working :"+w);








}
}