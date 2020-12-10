package com.xworkz.data;
import com.xworkz.data.dto.*;
import java.util.Date;
public class FileDTOTester {
 
	public static void main(String[] args)
	{
		FileDTO dto=new FileDTO();//default constructor
		System.out.println(dto.getName());
		System.out.println(dto.getCreatedDate());
		
		FileDTO dto2=new FileDTO("practise.jpg",124);//parameter
		System.out.println(dto2.getName());
		System.out.println(dto2.getSize());
		
		Date currentDate=new Date();
		dto.setCreatedDate(currentDate);
		System.out.println(dto.getCreatedDate());
		dto.setLocation("d://images");
		dto.setType("jpg");		
		Date date =new Date();
		
		
		FileDTO dto3=new FileDTO("xworkz.jpg", 160, "jpg", "d://images", date);//parameter
		System.out.println(dto3.getName());
		System.out.println(dto3.getCreatedDate());	
		System.out.println(dto3.getType());
		System.out.println(dto3.getLocation());
		System.out.println(dto3.getCreatedDate());
		
		
		
	}
}
