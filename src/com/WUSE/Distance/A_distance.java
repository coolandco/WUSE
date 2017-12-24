package com.WUSE.Distance;


import com.WUSE.AbstractUnits.A_speed;
import com.WUSE.Time.A_Time;
import com.WUSE.Units.BaseUnit;

public abstract class A_distance extends BaseUnit<A_distance>{
	
	
	protected A_distance(float baseRate,float value) {
				super(baseRate,value);
	}
	
	
	public A_speed dividedBy(A_Time time) {
		
		//returns a new Speed
		
		return new A_speed(this, time);
	}	

}
