package com.WUSE.meter;

public class meter extends A_meter {	
	
	public meter(float value){
		super(1.0f,value);	//calls super constructor to set the baseRate
	}
	
	public meter(){
		this(0f);	//generates a new meter object with value 0
	}
	
	
//	@Override
//	public meter plus(A_meter toAdd) {
//		
//		return super.plus(toAdd);
//		
//	}

	
}
