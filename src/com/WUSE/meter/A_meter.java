package com.WUSE.meter;

import com.WUSE.Units.baseUnit;
import com.WUSE.zeit.A_zeit;

abstract class A_meter extends baseUnit<A_meter>{
	
	
	protected A_meter(float baseRate,float value) {
				super(baseRate,value);
	}
	
	
	public A_geschwindigkeit dividedBy(A_zeit time) {
		
		//returns a new Speed

		return new A_geschwindigkeit(this, time);
	}	

}
