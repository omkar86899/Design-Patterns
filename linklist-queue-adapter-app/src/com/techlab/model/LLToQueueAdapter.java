package com.techlab.model;

import java.util.Iterator;
import java.util.LinkedList;

public class LLToQueueAdapter<T> implements Iterable<T>{
	LinkedList<T> list;
	
	public LLToQueueAdapter() {
		list = new LinkedList<T>();
	}
	
	public int size() {
		return list.size();
	}
	
	public void enqueue(T val) {
		list.add(val);
	}
	
	public T dequeue() {
		return list.removeFirst();
	}
	
	public T peek() {
		return list.peek();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}
}
