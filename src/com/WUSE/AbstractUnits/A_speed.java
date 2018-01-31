package com.WUSE.AbstractUnits;

import com.WUSE.Units.Unit;
import com.WUSE.Units.UnitOperators;
import com.WUSE.Time.A_Time;
import com.WUSE.Units.BaseUnit;
import com.WUSE.Distance.A_distance;

public class A_speed extends Unit<A_speed>{

	
/**
 * Provides the functionality to create a speed out of a distance and a Time
 * 
 * @param a An Object derivated from Distance
 * @param b An Object derivated from Time
 * @throws Exception 
 */
//	public A_speed(BaseUnit<A_distance<?>,?> a, BaseUnit<A_Time<?>,?> b) {
//		
//		super(a, b, UnitOperators.DIVIDE);
//	}
	public A_speed(A_distance<?> a_distance, A_Time<?> time) throws Exception {
		
		super(a_distance, time, UnitOperators.DIVIDE);
	}
	
	
	/**
	 * creates an empty object of the type speed
	 */
	public A_speed() {
		
		super(UnitOperators.DIVIDE);
	}





}
