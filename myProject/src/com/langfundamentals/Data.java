package com.langfundamentals;

public class Data {
	byte a = 3;
	short b = 74;
	int  c = 345;
	long d = 1234567l;
	float e = 8520911743f;
	double f = 2456;
	char g = 'r';
	boolean  bol = true;
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(bol);
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.display();

	}

}
