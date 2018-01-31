package com.WUSE.Time;

import com.WUSE.Units.BaseUnit;

public abstract class A_Time<T extends A_Time> extends BaseUnit<T,A_Time> {
	
	/**
	 * Provides the functionality to create a Time
	 * 
	 * @param baseRate
	 * @param value
	 */
	protected A_Time(float baseRate,float value) {
		super(baseRate,value);
	}
	

}
