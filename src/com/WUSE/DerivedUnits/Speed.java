package com.WUSE.DerivedUnits;

import com.WUSE.Units.Unit;
import com.WUSE.Units.UnitOperators;
import com.WUSE.Time.Zeit_Abstract;
import com.WUSE.Distance.Distance_Abstract;

public class Speed extends Unit<Speed>{

	
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
	public Speed(Distance_Abstract<?> distanceAbstract, Zeit_Abstract<?> time) throws Exception {
		
		super(distanceAbstract, time, UnitOperators.DIVIDE);
	}
	
	
	/**
	 * creates an empty object of the type speed
	 */
	public Speed() {
		
		super(UnitOperators.DIVIDE);
	}





}
