package com.cg.strings;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer s1=new StringBuffer();// default capacity 16
		StringBuffer buffer =new StringBuffer("Hello");
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		StringBuffer s2 =new StringBuffer(200); //exact input as capacity
		System.out.println(s2.capacity());
	}

}
