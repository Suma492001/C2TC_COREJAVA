package com.cg.listinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List listone=new ArrayList();
		//listone.add(null);
		System.out.println(listone.size());
		System.out.println(listone.isEmpty());
		listone.add(10);
		listone.add(20);
		listone.add(true);
		listone.add(false);
		listone.add(20);
		listone.add("Hello");
		listone.add(56.78);
		listone.add(20);
		listone.add('A');
		listone.add(5,"Hi");// 5-index; i/p-Hi
		listone.add(20);
		System.out.println(listone);
		System.out.println(listone.contains(15));
		listone.remove(false);
		System.out.println(listone);
		
		//listone.remove(20);
		//System.out.println(listone);
		
		listone.remove(1); //int --index
		System.out.println(listone);
		
		System.out.println(listone.size());
		System.out.println(listone.get(5));
		
		System.out.println(listone.indexOf(20));
		System.out.println(listone.lastIndexOf(20));
		
		Collections.sort(listone);
		
		List listtwo =new ArrayList();
		listtwo.add(10);
	
		
		listone.removeAll(listone); //to remove common variables
		System.out.println();
		
		
		
	}

}
