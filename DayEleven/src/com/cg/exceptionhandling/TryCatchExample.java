package com.cg.exceptionhandling;

public class TryCatchExample {

	static void performDivision(int x ,int y) {
		System.out.println("I am in method");
		int z;
		try {
		z=x/y;
		System.out.println(z);
		}
	
		catch(ArithmeticException e) {
			System.out.println("I am in Catch Block:" + e.getMessage());
		}
	}
	
	
}
