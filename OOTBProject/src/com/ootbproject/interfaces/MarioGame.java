package com.ootbproject.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump");

	}

	@Override
	public void down() {
		System.out.println("fall into a hole");

	}

	@Override
	public void left() {

	}

	@Override
	public void right() {
		System.out.println("go forward");

	}

}
