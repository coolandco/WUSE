package com.WUSE.Distance;

public class Meter extends A_distance {	
	
	
	/**
	 * creates a Kilometer with a specific length
	 * @param value 
	 */
	public Meter(float value){
		super(1.0f,value);	//calls super constructor to set the baseRate
	}
	
	/**
	 * creates an empty Kilometer with the value 0
	 */
	public Meter(){
		this(0f);	//generates a new meter object with value 0
	}


	
}
