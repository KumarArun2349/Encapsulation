package org.stu;

import java.util.LinkedHashSet;
import java.util.Set;

public class College 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setStdId(1);
		s.setStdName("Arun");
		s.setAddress("Chennai");
		s.setStdPhone(9876543210l);
		s.setGender('M');
		s.seteMail("abc@gmailcom");
		
		Set<Student> si = new LinkedHashSet();
		si.add(s);
		
		for (Student stu : si) 
		{
			System.out.println("Student ID is: "+ stu.getStdId());	
			System.out.println("Student NAME is: "+ stu.getStdName());
			System.out.println("Student ADDRESS is: "+ stu.getAddress());
			System.out.println("Student Phone is: "+ stu.getStdPhone());
			System.out.println("Student Gender is: "+ stu.getGender());
			System.out.println("Student MAIL is: "+ stu.geteMail());	
		}	
		
	}
}
