package org.emp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Company 
{
public static void main(String[] args) 
{
	Employee e = new Employee();
	e.setEmpId(12345);
	e.setEmpName("Apple");
	e.setEmpPhone(12345l);
	
	Employee e1 = new Employee();
	e1.setEmpId(67890);
	e1.setEmpName("Ball");
	e1.setEmpPhone(67890l);
	
	Employee e2 = new Employee();
	e2.setEmpId(11220);
	e2.setEmpName("Cat");
	e2.setEmpPhone(11220l);
	
	System.out.println("***********************");			
	System.out.println("User Defined List");
	System.out.println("***********************");
	List<Employee> li = new ArrayList();
	li.add(e);
	li.add(e1);
	li.add(e2);
	
	System.out.println("***********************");
	System.out.println("FOR loop");
	System.out.println("***********************");
	for (int i = 0; i < li.size(); i++) 
	{
	System.out.println("Emp id is: "+li.get(i).getEmpId());
	System.out.println("Emp name is: "+li.get(i).getEmpName());
	System.out.println("Emp phone is: "+li.get(i).getEmpPhone());
	}
	
	System.out.println("\n***********************");
	System.out.println("FOREACH loop");
	System.out.println("***********************");
	for (Employee employee : li) 
	{
	System.out.println("Emp id is: "+employee.getEmpId());	
	System.out.println("Emp name is: "+employee.getEmpName());
	System.out.println("Emp phone is: "+employee.getEmpPhone());
	}
	
	
	System.out.println("\n***********************");
	System.out.println("User Defined Set");
	System.out.println("***********************");
	Set<Employee> si = new LinkedHashSet();
	si.add(e);
	si.add(e1);
	si.add(e2);
	
	//SET is value based so we can only use foreach loop
	for (Employee x : si) 
	{
	System.out.println("Emp id is: "+x.getEmpId());
	System.out.println("Emp name is: "+x.getEmpName());
	System.out.println("Emp Phone is: "+x.getEmpPhone());
	}
	
	System.out.println("\n***********************");
	System.out.println("User Defined Map");
	System.out.println("***********************");
	Map<Integer, Employee> mi = new LinkedHashMap();
	mi.put(01, e);
	mi.put(02, e1);
	mi.put(03, e2);
	
	Set<Entry<Integer, Employee>> entrySet = mi.entrySet();
	for (Entry<Integer, Employee> entry : entrySet) 
	{
		System.out.println(entry.getKey());
		System.out.println("Emp id is: "+entry.getValue().getEmpId());
		System.out.println("Emp name is: "+entry.getValue().getEmpName());
		System.out.println("Emp Phone is: "+entry.getValue().getEmpPhone());
	}
	System.out.println("Arunkumar K");
	
}
}
