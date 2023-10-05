package com.cg.mapinterface;

import java.util.concurrent.ConcurrentHashMap;

public class CuncurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer,String> chm =new ConcurrentHashMap();
		chm.put(100,"Hello");
		chm.put(101,"Hii");
		chm.put(102,"everyone");
		System.out.println(chm);
		
		chm.putIfAbsent(103,  "hello");
		System.out.println(chm);
		
		chm.remove(101,"haii");
		System.out.println(chm);
		
		chm.replace(100,"helo","hii");
		System.out.println(chm);
	}

}
