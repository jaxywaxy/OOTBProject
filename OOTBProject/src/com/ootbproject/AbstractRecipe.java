package com.ootbproject;

public abstract class AbstractRecipe {
	public void execute() {
		getReady();
		cookTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void cookTheDish();

	abstract void cleanup();

}
