package com.WUSE.Units;



import com.WUSE.interfaces.Plus;

/**
 * This class does the work
 * 
 * We have to \@SuppressWarnings("rawtypes") because we need to make sure for F that we have access
 *  to the properties of baseUnit
 * 
 * @author Leo
 *
 * @param <F>
 * Every child of F can be added to any other child of F
 * 
 */

/*TODO: there is still a run time problem with the implementation of the base Unit. It is possible
 * to have a meter = centimeter.plus(meter) but java can't cast centimeter in meter
 */

@SuppressWarnings("rawtypes") 
public abstract class baseUnit <F extends baseUnit> implements Plus<F>  {
	
	private float baseRate;
	private float value;
	
	
	protected baseUnit(float baseRate, float value) {
				this.baseRate = baseRate;
				this.value = value;
	}
	
	
	@Override
	public <T extends F> T plus(F toAdd) {
		
			try {
				//generates a new class through reflection and casts it to the desired class
				T result = (T) this.getClass().newInstance();
				
				//calculation
				//ar = this.baserate
				//av = this.value
				//br = toAdd.baserate
				//bv = toAdd.value
				//(ar / br) * bv + av
				result.setValue(
						(
							(
								this.getBaseRate()
								/
								toAdd.getBaseRate()
							)
							*
							toAdd.getValue()
						)
						+
						this.getValue()
				);	
				
				return result;
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			
		
		return null;		
		
	}

	
	protected float getValue() {
		return value;
	}
	
	protected void setValue(float value) {
		this.value = value;
	}
	
	protected float getBaseRate() {
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
	public <T extends F> T getCopy() {
		
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
