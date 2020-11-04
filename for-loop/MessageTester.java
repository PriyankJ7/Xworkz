public class MessageTester
{
	public static void main(String[] msgs)
	{
		System.out.println(" JVM invokoed main");
		VTU.printMessage();
		String valueAtIndex0=msgs[0];
		int no=Integer.parseInt(valueAtIndex0);
		VTU.printMessage(no);
		
		
		System.out.println("***************");
		
		VTU.groupMessagesAndLoop();
		
		
		
		System.out.println("EXIT :: main");
	}
	

}