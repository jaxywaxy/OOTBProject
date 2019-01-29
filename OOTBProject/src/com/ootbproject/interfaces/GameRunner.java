package com.ootbproject.interfaces;

public class GameRunner {
	public static void main(String[] args) {
		ChessGame game = new ChessGame();
		// MarioGame game = new MarioGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
