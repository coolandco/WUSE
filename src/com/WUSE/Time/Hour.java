package com.WUSE.Time;

public class Hour extends A_Time<Hour> {

	/**
	 * creates an Hour with a specific time
	 * @param value 
	 */
	public Hour(float value){
		super(1f / 3600f ,value);	//calls super constructor to set the baseRate
	}
	
	
	/**
	 * creates an empty Hour with the value 0
	 */
	public Hour(){
		this(0f);	//generates a new meter object with value 0
	}

}
