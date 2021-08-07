package com.techlab.test;

import java.util.Iterator;

import com.techlab.model.LLToQueueAdapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLToQueueAdapter<Integer> queue = new LLToQueueAdapter<Integer>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		for(Iterator<Integer> i = queue.iterator(); i.hasNext();) {
        	System.out.println(i.next());
        }
		
		System.out.println("Size of Queue: "+queue.size());
		System.out.println("Peek: "+queue.peek());
		System.out.println("Removing Elements: "+queue.dequeue());
	}

}
