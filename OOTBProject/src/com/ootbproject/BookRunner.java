package com.ootbproject;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Object Orientated Programming", "Some Guy");

		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Excellent Book", 5));

		System.out.println(book);

	}

}
