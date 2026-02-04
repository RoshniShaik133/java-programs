package com.basics;

public class Customer {
	int cid;
	String cname;
	
	protected void finalize() {
		System.out.println("finalize called !!");
		
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
	//	1) nullifing the object
		
		c1 = null;
		c2 = null;
		c3 = null;
		//re - assingining the object
		Customer c4 = new Customer();
		c1 = c4;
		System .gc();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
