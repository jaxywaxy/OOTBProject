package com.ootbproject;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("gather the ingredients");
		System.out.println("get utensils");

	}

	@Override
	void cookTheDish() {
		System.out.println("cook the dish");

	}

	@Override
	void cleanup() {
		System.out.println("do the dishes");

	}

}
