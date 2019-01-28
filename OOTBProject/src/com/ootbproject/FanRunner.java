package com.ootbproject;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", .456, "white");
		fan.switchOn();
		fan.setSpeed((byte) 4);
		System.out.println(fan);

		fan.switchOff();
		System.out.println(fan);

	}
}