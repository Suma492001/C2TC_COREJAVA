package com.cg.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<>();
		//key - should be unique,value-can be duplicate
		hm.put("Let Us C",320);
		hm.put("The Complete Reference C++",450);
		hm.put("The Complete Reference JAVA",465);
		hm.put("python programming", 320);
		hm.put("Application Development using spring Boot",600);
		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator i =set.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(i.next());
		}
		Map<String,String> hmOne =new HashMap<>();
		hmOne.put("Nithin","nithin@gmail.com");
		hmOne.put("gana ","ghana@gmail.com");
		hmOne.put("Deepak",null);
		hmOne.put(null,"abcd@gmail.com");
		hmOne.put(null,null);
		System.out.println(hmOne);
	}

}
