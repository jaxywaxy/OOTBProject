package com.ootbproject;

public class Address {
	private String line1;
	private String city;
	private String postcode;

	// operations
	public Address(String line1, String city, String postcode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return line1 + " " + city + " " + postcode;
	}
}
