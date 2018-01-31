package com.WUSE.Units;


/**
 * 
 * 
 * @author Leo
 *
 *This Class does the Management of two baseUnits
 *
 * @param <F> Every child <F> of Unit can be connected to any other child of Unit with an operator
 */
@SuppressWarnings("rawtypes")
public abstract class Unit<F extends Unit>  { 
	
	private BaseUnit<?,?> a;
	private BaseUnit<?,?> b;
	
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
	 * @param a Base Unit a
	 * @param b Base Unit b
	 * @param o Type of Operator
	 * @throws Exception 
	 * 
	 * 
	 */
	protected Unit(BaseUnit<?,?> a, BaseUnit<?,?> b,UnitOperators o) throws Exception {
		this.a = a;
		this.b = b;
		this.o = o;
		
		//Units are always in (X baseUnit / 1 baseUnit)
		if(o == UnitOperators.DIVIDE) {
			a.setValue(a.getValue() / b.getValue());
			b.setValue(1f);//always 1			
			
		}else if(o == UnitOperators.MULTIPLY) {
			throw new Exception("not yet Implemented");
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

	
	/**
	 * Adds two Units together, depending on the relation of the both units.
	 * A relation can be Divide or Multiply.
	 * Depending on that the correct Addition prozedure will be choosen. 
	 * 
	 * @param toAdd has to be the same unit kind like <this>
	 * @return Returns a new instance of <F>
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public F plus(F toAdd) throws Exception {
		
		
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
			}else if(o == UnitOperators.MULTIPLY) {
				throw new Exception("not yet Implemented");
			}
			
			//now we have a finished Unit and can give it back
			
			return result;
			
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * returns the value of unit a and  class name of unit a / class name of unit b
	 */
	@Override
	public String toString() {
		return String.valueOf(a.getValue() + " " +
				a.getClass().getSimpleName() +
				"/" +
				b.getClass().getSimpleName());
	}

	
	
	protected BaseUnit<?,?> getA() {
		return a;
	}

	protected BaseUnit<?,?> getB() {
		return b;
	}

	protected void setA(BaseUnit<?,?> a) {
		this.a = a;
	}

	protected void setB(BaseUnit<?,?> b) {
		this.b = b;
	}
	
	

}
