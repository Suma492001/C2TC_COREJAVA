package com.cg.exceptionhandling;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=10;
		 int y=0;
		 int z;
		 try {
			 z=x/y;
		 System.out.println(z);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	}
 
	
	
}
