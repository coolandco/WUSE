package com.WUSE.Time;

public class Hour extends A_Time {

	
	public Hour(float value){
		super(1 / 3600,value);	//calls super constructor to set the baseRate
	}
	
	public Hour(){
		this(0f);	//generates a new meter object with value 0
	}

}
