package com.Array;

public class Testdemoarraylab7 {

	    public static void main(String[] args) {

	        int[] array = {11, 14, 13, 17, 21, 2, 4};

	        for (int n : array) {
	            boolean prime = true;

	            if (n <= 1) prime = false;
	            else {
	                for (int i = 2; i <= n / 2; i++) {
	                    if (n % i == 0) {
	                        prime = false;
	                        break;
	                    }
	                }
	            }

	            if (prime) {
	                int rev = 0, temp = n;
	                while (temp != 0) {
	                    rev = rev * 10 + temp % 10;
	                    temp /= 10;
	                }
	                System.out.println(n + " " + rev);
	            } else {
	                System.out.println(n + " Not Prime");
	            }
	        }
	    }
	}
	        
	    
	