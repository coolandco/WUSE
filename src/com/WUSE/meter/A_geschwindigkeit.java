package com.WUSE.meter;

import com.WUSE.Units.Unit;
import com.WUSE.Units.UnitOperators;
import com.WUSE.Units.baseUnit;
import com.WUSE.zeit.A_zeit;

public class A_geschwindigkeit extends Unit<A_geschwindigkeit>{

	

	public A_geschwindigkeit(baseUnit<A_meter> a, baseUnit<A_zeit> b) {
		
		super(a, b, UnitOperators.DIVIDE);
	}
	
	public A_geschwindigkeit() {
		
		super(null,null, UnitOperators.DIVIDE);
	}

}
