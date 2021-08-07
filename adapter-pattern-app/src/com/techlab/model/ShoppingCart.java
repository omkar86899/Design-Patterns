package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	public List<Item> getItems(){
		return this.items;
	}
	public void add(Item item) {
		this.items.add(item);
	}
	public void remove(Item item) {
		this.items.remove(item);
	}
}
