package com.WUSE.Time;

public class Second extends A_Time {

	
	public Second(float value){
		super(1f,value);	//calls super constructor to set the baseRate
	}
	
	public Second(){
		this(0f);	//generates a new meter object with value 0
	}

}
