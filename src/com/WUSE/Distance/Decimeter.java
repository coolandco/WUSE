package com.WUSE.Distance;

public class Decimeter extends A_distance {

	/**
	 * creates a Decimeter with a specific length
	 * @param value 
	 */
	public Decimeter(float value) {
		super(10f, value);
	}
	
	/**
	 * creates an empty Decimeter with the value 0
	 */
	public Decimeter() {
		this(0f);
	}

}
