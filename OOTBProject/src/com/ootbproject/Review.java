package com.ootbproject;

public class Review {

	private int reviewId;
	private String description;
	private int rating;

	public Review(int reviewId, String description, int rating) {
		this.reviewId = reviewId;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return reviewId + " " + description + " " + rating;
	}

}
