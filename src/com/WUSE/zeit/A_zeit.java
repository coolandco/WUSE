package com.WUSE.zeit;

import com.WUSE.interfaces.Addition;

public abstract class A_zeit implements Addition<A_zeit> {
	
	private float baseRate;
	
	private float value;
	
	
	protected A_zeit(float baseRate) {
				this.baseRate = baseRate;
	}
	
	public void add(A_zeit t) {
		
		value = value + baseRate * t.getValue();
		
		
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
