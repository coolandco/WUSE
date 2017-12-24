package com.WUSE.AbstractUnits;

import com.WUSE.Units.Unit;
import com.WUSE.Units.UnitOperators;
import com.WUSE.Time.A_Time;
import com.WUSE.Units.BaseUnit;
import com.WUSE.AbstractUnits.A_distance;

public class A_speed extends Unit<A_speed>{

	

	public A_speed(BaseUnit<A_distance> a, BaseUnit<A_Time> b) {
		
		super(a, b, UnitOperators.DIVIDE);
	}
	
	public A_speed() {
		
		super(UnitOperators.DIVIDE);
	}

}
