package com.WUSE.Distance;


import com.WUSE.AbstractUnits.A_speed;
import com.WUSE.Time.A_Time;
import com.WUSE.Units.BaseUnit;

public abstract class A_distance extends BaseUnit<A_distance>{
	
	
	/**
	 * Provides the functionality to create a distance
	 * 
	 * @param baseRate base
	 * @param value
	 */
	protected A_distance(float baseRate,float value) {
				super(baseRate,value);
	}
	
	
	/**
	 * Provides the functionality to generate a speed from time
	 * the baseUnits of speed will maintain the original baserates
	 * 
	 * @param time a "time" object
	 * @return a speed object
	 */
	public A_speed dividedBy(A_Time time) {
		
		//returns a new Speed
		
		return new A_speed(this, time);
	}	

}
