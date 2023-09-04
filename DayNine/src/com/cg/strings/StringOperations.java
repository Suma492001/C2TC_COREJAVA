package com.cg.strings;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 =new String( "  indian  3  ");
		
		//0-
		//
		String s2 =s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,6));	
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.stripIndent());
		
		String s3="Hello";
		//String s4="World";
		//String s4="Hello";
		String s4 =new String("Hello");
		System.out.println(s3==s4); 
		System.out.println(s3.equals(s4));
		
		

	}

}
