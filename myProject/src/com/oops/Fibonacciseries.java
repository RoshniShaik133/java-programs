package com.oops;
import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		System.out.println("enter the value: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  n1 = 0;
		int n2 = 4;
		int n3 = 8;
		System.out.println(n1 +""+ n2);
	for(int  i = 0; i<n; i++) {
		n3=n1+n2;
	System.out.println(" " + n3);
	   n1 = n2;
	   n2 = n3;
	}
		
		
		

	}

}
