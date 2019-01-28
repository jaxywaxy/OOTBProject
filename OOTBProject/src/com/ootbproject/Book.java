package com.ootbproject;

import java.util.ArrayList;

public class Book {

	private int bookId;
	private String title;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;

	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("bookId - [%d] Book title [%s] Author  [%s], Review [%s]", bookId, title, author, reviews);
	}
}
