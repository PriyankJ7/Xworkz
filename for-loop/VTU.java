 public class VTU
 {
	 public static void printMessage() 
	 {
		 for(byte msg=0;msg<=4;msg++)
		 {
			 System.out.println("Shaping the future");
		 }
	 }
	 
	 public static void printMessage(int loopSize)
	{
		for(int msg=0;msg<=loopSize;msg++)
		{
			System.out.println("Shapping the future" +msg);
		}
	}
	
	public static void groupMessagesAndLoop()
	{
		System.out.println("invoked groupMessagesAndLoop ");
		String[] messages={"Good morning", "Updates are available", "memory is full", "Shut down", "Battery is full"};
		
		System.out.println("the message size" + messages.length);
		
		for(int count=0;count< messages.length;count++)
		{
			System.out.println("count :"+count);
			String message=messages[count];
			System.out.println("message "+message);
		}
	}
	
 }