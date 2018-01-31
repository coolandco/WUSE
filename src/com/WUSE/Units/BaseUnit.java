package com.WUSE.Units;



import com.WUSE.Interfaces.Minus;
import com.WUSE.Interfaces.Plus;

/**
 * This class does baseUnit management
 * 
 * @author Leo
 *
 * @param <F> Every child of F can be operated with any other child of F
 * 
 */

/*TODO: there is still a run time problem with the implementation of the base Unit. It is possible
 * to have a meter = centimeter.plus(meter) where java can't cast centimeter in meter
 * 
 * We have to \@SuppressWarnings("rawtypes") because we need to make sure for F that we have access
 * to the properties of baseUnit
 */

//@SuppressWarnings("rawtypes") 
public abstract class BaseUnit <T extends F, F extends BaseUnit>  implements Plus<T,F>,Minus<T,F>{
	
	private float baseRate;
	private float value;
	
	/**
	 * A BaseUnit contains always a baseRate and a value.
	 * 
	 * 
	 * @param baseRate
	 * @param value
	 */
	protected BaseUnit(float baseRate, float value) {
				this.baseRate = baseRate;
				this.value = value;
	}
	
	

	
	@SuppressWarnings("unchecked")
	//@Override
	public T plus(F toAdd) {
		
			try {
				//generates a new class through reflection and casts it to the desired class
				T result = (T) this.getClass().newInstance();
				
				//calculation
				//ar = this.baserate
				//av = this.value
				//br = toAdd.baserate
				//bv = toAdd.value
				//(ar / br) * bv + av
				result.setValue( 	getValueConvertedToSame(this.getBaseRate(), toAdd.getBaseRate(), toAdd.getValue())
									+
									this.getValue()
				);	
				
				return result;
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			
		
		return null;		
		
	}
	
	@SuppressWarnings("unchecked")
	public T minus(F toSubtract) {
		
		try {
			//generates a new class through reflection and casts it to the desired class
			T result = (T) this.getClass().newInstance();
			
			//calculation
			//ar = this.baserate
			//av = this.value
			//br = toAdd.baserate
			//bv = toAdd.value
			//(ar / br) * bv - av
			result.setValue( 	getValueConvertedToSame(this.getBaseRate(), toSubtract.getBaseRate(), toSubtract.getValue())
								-
								this.getValue()
			);	
			
			
			return result;
			
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
		return null;		
	}
	
	/**
	 * converts a value to the base rate of another base unit
	 * 
	 * @param baseRateOrginal the base rate, where the toConvert-Value has to be convertet to
	 * @param baseRateToConvert 
	 * @param ValueToConvert
	 * @return a float of the convertet value
	 */
	private float getValueConvertedToSame(float baseRateOrginal, float baseRateToConvert, float ValueToConvert) {
		
		return 	(
					baseRateOrginal
					/
					baseRateToConvert
				)
				*
				ValueToConvert;
		
	}
	

	/**
	 * 
	 * @return returns the Value
	 */
	public float getValue() {
		return value;
	}
	
	/**
	 * 
	 * @param value Sets the value
	 */
	public void setValue(float value) {
		this.value = value;
	}
	
	
	/**
	 * 
	 * @return returns the baseRate
	 */
	public float getBaseRate() {
		return baseRate;
	}
	
	
	@Override
	public String toString() {
		return String.valueOf(value + " " + getClass().getSimpleName());
	}
	
	
	/**
	 * Generates a copy of <T> with the same value and baseRate
	 * 
	 * @return <T> or null if there was an exeption
	 */
	@SuppressWarnings("unchecked")
	public T getCopy() {
		
		try {
			
			
			T result = (T) this.getClass().newInstance();//this copys the instance with the same base rate
			result.setValue(this.getValue()); // this copys the value to the new instance
			
			
			return result;
			
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
