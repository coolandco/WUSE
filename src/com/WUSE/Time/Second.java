package com.WUSE.Time;

public class Second extends A_Time<Second> {

	
	/**
	 * creates a Second with a specific time
	 * @param value 
	 */
	public Second(float value){
		super(1f,value);	//calls super constructor to set the baseRate
	}

	
	/**
	 * creates an empty Second with the value 0
	 */
	public Second(){
		this(0f);	//generates a new meter object with value 0
	}

}
