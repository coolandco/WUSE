package com.WUSE.Distance;

public class Meter extends A_distance {	
	
	public Meter(float value){
		super(1.0f,value);	//calls super constructor to set the baseRate
	}
	
	public Meter(){
		this(0f);	//generates a new meter object with value 0
	}
	
	
//	@Override
//	public meter plus(A_meter toAdd) {
//		
//		return super.plus(toAdd);
//		
//	}

	
}
