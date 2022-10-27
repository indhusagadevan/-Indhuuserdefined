package org.java;

import java.util.*;
public class Classset {
public static void main(String [] args)
{
	Set<error1>ss=new LinkedHashSet<>();
	error1 d=new error1();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Name:");
	d.setName(sc.next());
	System.out.print("Enter the Empid:");
	d.setEmpid(sc.nextInt());
	System.out.print("Enter the Strenth:");
	d.setStrenth(sc.nextInt());
	System.out.print("Enter the Salary:");
	d.setSalary(sc.nextInt());
	System.out.print("Enter the Empgender:");
	d.setEmpgender(sc.next());
	
	ss.add(d);
	for(error1 i:ss)
	{
		System.out.println(i.getName());
		System.out.println(i.getEmpid());
		System.out.println(i.getStrenth());
		System.out.println(i.getSalary());
		System.out.println(i.getEmpgender());
	}
}

	
}

