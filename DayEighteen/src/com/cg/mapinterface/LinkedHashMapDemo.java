package com.cg.mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> lhm =new LinkedHashMap<>();
		lhm.put("Nithin","nithin@gmail.com");
		lhm.put("gana ","ghana@gmail.com");
		lhm.put("Deepak",null);
		lhm.put(null,"abcd@gmail.com");
		lhm.put(null,null);
		System.out.println(lhm);

	}

}
