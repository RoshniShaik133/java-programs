package com.basics;

public class Car {

	public static void main(String[] args) {
	Car c = new Car();
	Car c1 = new Car();
	Car c2 = new Car();
	// c = null;
	 //c1 = c;
	 //c2 = null;
	 c2 = c1;
    System.out.println(c);
    System.out.println(c1);
    System.out.println(c2);
	}

}
