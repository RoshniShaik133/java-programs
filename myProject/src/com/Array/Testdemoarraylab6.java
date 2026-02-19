package com.Array;
import java.util.Scanner;

public class Testdemoarraylab6 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int square = num * num;
		        int temp = square;
		        int sum = 0;

		     
		        int[] digits = new int[10];
		        int index = 0;

		        while (temp > 0) {
		            digits[index] = temp % 10;
		            sum = sum + digits[index];
		            temp = temp / 10;
		            index++;
		        }

		        System.out.println("Square: " + square);
		        System.out.println("Sum of digits of square: " + sum);

		        if (sum == num) {
		            System.out.println(num + " is a Neon Number");
		        } else {
		            System.out.println(num + " is NOT a Neon Number");
		        

		        sc.close();
		    }


	

	}

	}
