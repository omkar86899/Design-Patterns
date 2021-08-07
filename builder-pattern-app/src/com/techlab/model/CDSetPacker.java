package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class CDSetPacker {
	private List<Packer> items = new ArrayList<Packer>();

	public void addItem(Packer packs) {
		items.add(packs);
	}

	public void getCost() {
		for (Packer packs : items) {
			packs.price();
		}
	}

	public String showItems() {
		StringBuilder builder = new StringBuilder();
		for (Packer packing : items) {
			builder.append("CD name : " + packing.pack());
			builder.append(", Price : " + packing.price());
		}
		return builder.toString();
	}
}
