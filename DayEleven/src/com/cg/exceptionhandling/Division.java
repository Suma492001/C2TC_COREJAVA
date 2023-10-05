package com.cg.exceptionhandling;
 
public class Division {
	public static void divide() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers");
		try {
			a=sc.nextint();
			b=sc.nextint();
			c=a/b;
			System.out.println("Division is" + c);
			
		}
		catch (ArithmeticException) {
			
		
	}
	catch(InputMismatchException) {
	 System.out.println(e.getmessage);	
	}

}
