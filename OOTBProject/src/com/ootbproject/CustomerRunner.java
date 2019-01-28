package com.ootbproject;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("1 A Street", "wellington", "6000");

		Customer customer = new Customer("John Doe", homeAddress);

		Address workAddress = new Address("2 B Road", "Wellington", "6003");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);

	}

}
