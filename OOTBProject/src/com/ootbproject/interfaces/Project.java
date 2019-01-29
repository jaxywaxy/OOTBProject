package com.ootbproject.interfaces;

public class Project {

	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new DummyAlgorithm();
		algorithm.complexAlgorithm(10, 20);
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}

}
