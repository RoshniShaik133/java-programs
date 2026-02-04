package com.basics;

public class Employee {
	int eid;
	String ename;

	public static void main(String[] args) {
		System.out.println("Main method started");
		Employee e1 = new Employee();
		System.out.println(e1);
		e1.eid = 19;
		e1.ename = "roshni";
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		
		 e1= null;
		 System.out.println(e1);
		
		System.out.println("main method ended");
		
		
		
		

	}

}
