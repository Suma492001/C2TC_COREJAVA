package com.cg.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String literal/using new keyword
		String str="Study";
		str.concat("Night"); //Concatenation
		System.out.println();
		
		
		//String Builder

		StringBuffer s1 = new StringBuffer("Study");
		s1.append("night");
		System.out.println(s1);

	}

}
