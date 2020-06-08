package com.WUSE.Time;

import com.WUSE.Units.BaseUnit;

public abstract class Zeit_Abstract<T extends Zeit_Abstract> extends BaseUnit<T, Zeit_Abstract> {
	
	/**
	 * Provides the functionality to create a Time
	 * 
	 * @param baseRate
	 * @param value
	 */
	protected Zeit_Abstract(float baseRate, float value) {
		super(baseRate,value);
	}
	

}
