package com.techlab.test;

import com.techlab.model.File;
import com.techlab.model.Folder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Folder root = new Folder("movies");
		Folder co = new Folder("Comedy Movies");
		Folder im = new Folder("Images");
		root.addChild(co);
		root.addChild(im);
		im.addChild(new File("PP",1,"Image"));
		co.addChild(new File("CC",1,"Video"));
		root.addChild(new File("Ra.One",1,"Video"));
		root.addChild(new File("Avengers End Game",1,"Video"));
		System.out.println(root.display());
	}

}
