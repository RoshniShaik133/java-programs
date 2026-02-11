package com.Array;

public class Leader {

	public static void main(String[] args) {
		System.out.println("main method starded");
		int[] num = {16,17,4,3,2};
		System.out.println("leader values: ");
		for(int  i= 0; i< num.length; i++) {
			for(int j = i; j < num.length;j++) {
				if(num[i] == num[j]) {
					System.out.println(num[i] +" ");
					break;
					
				}
			}
		}
		

	}

}
