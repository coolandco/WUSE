package com.WUSE.Time;

public class Minute extends A_Time<Minute> {
	
	/**
	 * creates a Minute with a specific time
	 * @param value 
	 */
	public Minute(float value){
		super( 1f / 60f ,value);	//calls super constructor to set the baseRate
	}
	
	
	/**
	 * creates an empty Minute with the value 0
	 */
	public Minute(){
		this(0f);	//generates a new meter object with value 0
	}

}
