package com.langfundamentals;


public class Classmethod {
	int add(int a,int b) {
		 return a+b;
	 }
	int sub(int a, int b) {
		 return a-b;
	 }
	  int mul(int a, int b) {
		 return a*b;
	 }
	

	public static void main(String[] args) {
		Classmethod m = new Classmethod();
		
		int sum = m.add(234,23456);
		int diff = m.sub(743,8472);
		int product = m.mul(2839384,9478357);
		
		System.out.println("addition =" +sum);
		System.out.println("sub =" +diff);
		System.out.println("mul =" +product);
		

	}

}
