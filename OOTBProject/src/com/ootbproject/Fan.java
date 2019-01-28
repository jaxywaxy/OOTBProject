package com.ootbproject;

public class Fan {
//state

	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; // 1 - 5

//constructors

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

//behaviour

	void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	void changeSpeed() {
	}

	@Override
	public String toString() {
		return String.format("make - %s , radius - %f, color - %s, isOn - %b, speed - %d ", make, radius, color, isOn,
				speed);
	}
}
