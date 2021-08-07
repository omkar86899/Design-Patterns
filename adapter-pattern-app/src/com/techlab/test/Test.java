package com.techlab.test;

import java.util.List;
import com.techlab.model.Item;
import com.techlab.model.ShoppingCart;
import external.Hat;
import external.HatAdapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();
		HatAdapter hatAdapter = new HatAdapter(new Hat("cap","captain",200));
		cart.add(hatAdapter);
		prinDetails(cart);
	}

	private static void prinDetails(ShoppingCart cart) {
		// TODO Auto-generated method stub
		List<Item> items = cart.getItems();
		for (Item item : items) {
			System.out.println(item.itemName());
			System.out.println(item.itemPrice());
		}
	}

}
