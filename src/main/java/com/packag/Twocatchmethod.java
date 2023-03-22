package com.packag;

public class Twocatchmethod {
	public static void main (String[]args) {
		System.out.println(0);
		System.out.println(1);
	
	try {
		System.out.println(2/0);
	}
	
	catch(ArithmeticException e) {
	System.out.println("ArithmeticException Handled");
	}
	catch(Exception e) {
		System.out.println("Exception Handled");
	}
	
	finally {
		System.out.println("Success");
	}
	System.out.println(3);
	System.out.println(4);

}
}
