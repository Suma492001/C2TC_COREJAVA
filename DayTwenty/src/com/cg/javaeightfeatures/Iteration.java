package com.cg.javaeightfeatures;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iteration {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5,6);
		System.out.println("---Collection output---");
		System.out.println(list);
		
		//// //External Iterations///// ///
		
		System.out.println("---For Loop output:---");
		//for Loop
		for(int i=0;i<6;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---ForEach Loop output---");
		//ForEach Loop
		for(Integer i: list) {
			System.out.println(i);
		}
		
		
		System.out.println("---Iterator Output---");
		//Iterator
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
