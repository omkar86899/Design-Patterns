package com.techlab.model;

public class CDBuilder {
	public CDSetPacker buildSonyCD() {
		CDSetPacker cds = new CDSetPacker();
		cds.addItem(new Sony());
		return cds;
	}

	public CDSetPacker buildSamsungCD() {
		CDSetPacker cds = new CDSetPacker();
		cds.addItem(new Samsung());
		return cds;
	}
}
