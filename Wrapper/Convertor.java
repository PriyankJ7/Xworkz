public class Convertor
{
	public static void main(String[] args)
	{
		System.out.println("JVM invoked main");
		
		// String converted to byte
		String channelNo="52";
		byte convertorChannel=Byte.parseByte(channelNo);
		System.out.println("converted byte:" +convertorChannel);
		
		String balance="5000";
		short convertorBalance=Short.parseShort(balance);
		System.out.println("converted short:"+convertorBalance);
		
		
		String noOfStudents ="75500";
		int convertorStudents=Integer.parseInt(noOfStudents);
		System.out.println("converted int:"+convertorStudents);
		
		
		String noOfPopulation="6500000";
		long convertorPopulation=Long.parseLong(noOfPopulation);
		System.out.println("converted long:"+convertorPopulation);
		
		String percentage="87.98f";
		float convertorPercentage=Float.parseFloat(percentage);
		System.out.println("converted float :"+convertorPercentage);
		
	
		String lifeOnElectrons="1000000000000";
	    double convertorElectrons=Double.parseDouble(lifeOnElectrons);
		System.out.println("converted double:"+convertorElectrons);
		

		String sunisblue="no";
		boolean convertorsunisblue=Boolean.parseBoolean(sunisblue);
		System.out.println("converted boolean:"+convertorsunisblue);
		
	}
} 