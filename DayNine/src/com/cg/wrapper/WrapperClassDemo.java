package com.cg.wrapper;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10; //Primitive TYpe
		
		//Unboxing =converting object type into primitive type
		
		Integer j = new Integer(10); //Wrapper or object type
		int k=j.intValue();
		
		//AutoBoxing =primitive to object
		 int i1=10; //Primitive TYpe
		Integer a = new Integer(10); //Wrapper or object type
		Integer b =i;
		System.out.println(args[0]);
	}


}
