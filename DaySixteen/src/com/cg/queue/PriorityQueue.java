package com.cg.queue;

import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {

		Queue<String>pq =new PriorityQueue<>();
		pq.add("core java");
		pq.add("React");
		pq.add("html");
		pq.add("angular");
		
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.contains("html"));


	}

}
