package com.WUSE.Distance;

public class Kilometer extends A_distance {

	/**
	 * creates a Kilometer with a specific length
	 * @param value 
	 */
	public Kilometer(float value) {
		super(0.001f, value);
	}
	
	/**
	 * creates an empty Kilometer with the value 0
	 */
	public Kilometer() {
		this(0f);
	}
	
	

}
