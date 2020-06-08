package com.WUSE.Distance;


import com.WUSE.DerivedUnits.Speed;
import com.WUSE.Time.Zeit_Abstract;
import com.WUSE.Units.BaseUnit;



public abstract class Distance_Abstract<T extends Distance_Abstract> extends BaseUnit<T, Distance_Abstract>{
	
	
	/**
	 * Provides the functionality to create a distance
	 * 
	 * @param baseRate base
	 * @param value
	 */
	protected Distance_Abstract(float baseRate, float value) {
				super(baseRate,value);
	}
	
	
	/**
	 * Provides the functionality to generate a speed from time
	 * the baseUnits of speed will maintain the original baserates
	 * 
	 * @param time a "time" object
	 * @return a speed object
	 */
	public Speed dividedBy(Zeit_Abstract time) {
		
		//returns a new Speed
		
		try {
			return new Speed(this, time);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;
		}
	}	

}
