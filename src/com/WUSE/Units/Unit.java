package com.WUSE.Units;


@SuppressWarnings("rawtypes")
public abstract class Unit<F extends Unit>  { //implements Plus<F>
	
	private baseUnit<?> a;
	private baseUnit<?> b;
	
	private UnitOperators o;
	
	
	/**
	 *
	 * How do we get a Proper Unit? We have to divide a by b and and b by b
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


	@SuppressWarnings("unchecked")
	public F plus(F toAdd) {
		
		
		try {
			F result = (F) this.getClass().newInstance(); //new empty instance
			
			result.setA(this.getA().getCopy());//put copy of a and b into result
			result.setB(this.getB().getCopy());//b should be "1"
			
			
			if(o == UnitOperators.DIVIDE) {
				//do the addition
				
				//TODO: Bringe b auf gleiche einheiten nenner wie a
				//TODO: addiere Zähler
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
		return String.valueOf(a.getValue() + 
				a.getClass().getSimpleName() +
				"/" +
				b.getClass().getSimpleName());
	}

	
	
	protected baseUnit<?> getA() {
		return a;
	}

	protected baseUnit<?> getB() {
		return b;
	}

	protected void setA(baseUnit<?> a) {
		this.a = a;
	}

	protected void setB(baseUnit<?> b) {
		this.b = b;
	}
	
	

}
