package com.WUSE.meter;

import com.WUSE.interfaces.Addition;

public abstract class A_meter implements Addition<A_meter> {
	
	private float baseRate;
	
	private float value;
	
	
	protected A_meter(float baseRate) {
				this.baseRate = baseRate;
	}
	
	public void add(A_meter m) {
		
		value = value + baseRate * m.getValue();
	}

	
	private float getValue() {
		return value;
	}

	
	protected void setValue(float value) {
		this.value = value;
		
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
	

}
