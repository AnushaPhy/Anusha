package com.packag;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0);
		System.out.println(1);
		try {
			System.out.println(2/0);
		}
		catch(ArithmeticException e) {
		System.out.println("Exception Handled");
		}
		System.out.println(3);
		System.out.println(4);
		

	}

}
