package com.WUSE.Units;


@SuppressWarnings("rawtypes")
public abstract class Unit<F extends Unit>  { //implements Plus<F>
	
	private baseUnit<?> a;
	private baseUnit<?> b;
	
	private UnitOperators o;
	
	
	/**
	 *
	 * How do we get a Proper Unit? We have to divide a by b and and b by b
	 * Units are always in (X baseUnit / 1 baseUnit)
	 * 
	 * lengt = lenth / time
	 * time = time / time
	 * 
	 * For example: If we take 5 Meters and 3 Seconds the speed would be 5/3 m/s
	 * 
	 */
	protected Unit(baseUnit<?> a, baseUnit<?> b,UnitOperators o) {
		this.a = a;
		this.b = b;
		this.o = o;
		
		//Units are always in (X baseUnit / 1 baseUnit)
		if(o == UnitOperators.DIVIDE) {
			a.setValue(a.getValue() / b.getValue());
			b.setValue(1f);//always 1			
			
		}
	}

	
	/**
	 * returns an Empty unit
	 * @param o The desired Operator for the unit
	 */
	protected Unit(UnitOperators o) {
		//return an empty Unit
		this.o = o;
	}


	//@SuppressWarnings("unchecked")
	public F plus(F toAdd) {
		
		
		try {
			F result = (F) this.getClass().newInstance(); //new empty instance
			
			result.setA(this.getA().getCopy());//put copy of a and b into result
			result.setB(this.getB().getCopy());//b should be "1"
			
			
			if(o == UnitOperators.DIVIDE) {
				//do the addition
				
				//Explanation
				//Example:
				//this km/h + toAdd cm/s
				//= (this.A.value,this.A.baseRate) / (this.B.value,this.B.baseRate) + (toAdd.A.value,toAdd.A.baseRate) / (toAdd.B.value,toAdd.B.baseRate)
				//
				//calculation:
				//ar = this.A.baseRate
				//av = this.A.value
				//br = this.B.baseRate
				//bv = this.B.value --> is "1"
				//cr = toAdd.A.baseRate
				//cv = toAdd.A.value
				//dr = toAdd.B.baseRate
				//dv = toAdd.B.value --> is "1"
				//result = ( ( (dr / br) / (cr / ar) ) * cv ) + av
				//TODO: can be simplified: result = ( (dr * ar * cv) / (br * cr) ) + av
				
				result.getA().setValue(
						(
							(
								(toAdd.getB().getBaseRate() / this.getB().getBaseRate())
								/
								(toAdd.getA().getBaseRate() / this.getA().getBaseRate())
							)
							*
							toAdd.getA().getValue()
						)
						+
						this.getA().getValue()
						);
			}
			
			//now we have a finished Unit and can give it back
			
			return result;
			
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return String.valueOf(a.getValue() + " " +
				a.getClass().getSimpleName() +
				"/" +
				b.getClass().getSimpleName());
	}

	
	
	protected <F extends Unit> baseUnit<?> getA() {
		return a;
	}

	protected <F extends Unit> baseUnit<?> getB() {
		return b;
	}

	protected void setA(baseUnit<?> a) {
		this.a = a;
	}

	protected void setB(baseUnit<?> b) {
		this.b = b;
	}
	
	

}
