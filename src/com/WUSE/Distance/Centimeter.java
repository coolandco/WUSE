package com.WUSE.Distance;

public class Centimeter extends Distance_Abstract<Centimeter> {

	/**
	 * creates a centimeter with a specific length
	 * @param value 
	 */
	public Centimeter(float value){
		super(100f,value);	//calls super constructor to set the baseRate
	}
	
	/**
	 * creates an empty centimeter with the value 0
	 */
	public Centimeter(){
		this(0f);	//generates a new meter object with value 0
	}

}
