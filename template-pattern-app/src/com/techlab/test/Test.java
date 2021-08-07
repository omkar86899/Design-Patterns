package com.techlab.test;

import com.techlab.model.Cricket;
import com.techlab.model.Football;
import com.techlab.model.Game;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Cricket();
		game.play();
		game = new Football();
		game.play();
	}

}
