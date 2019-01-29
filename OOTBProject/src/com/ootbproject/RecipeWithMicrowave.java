package com.ootbproject;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("gather the ingredients");
		System.out.println("get utensils");
		System.out.println("find the microwave");

	}

	@Override
	void cookTheDish() {
		System.out.println("put ingredients in a microwave safe bowl");

		System.out.println("Place in microwave and set timer");
		System.out.println("cook the dish");

	}

	@Override
	void cleanup() {
		System.out.println("do the dishes");

	}

}
