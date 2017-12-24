package com.WUSE.Interfaces;

/**
 *This interface has the right pattern for a Addition operation
 * 
 * @author Leo
 *
 * @param <F>
 * <F> Parameter specifies the class where all children are summable
 */
public interface Plus <F> extends Operator {
	
	
	/**
	 * Implement plus that:
	 * T is a child of F
	 * After you add some other child of F to T you want a new T as return object
	 * use 
	 * T result = (T) this.getClass().newInstance() to get a new child object of the same class
	 * 
	 * @param toAdd
	 * toAdd is a Child of F cast to F (another T or something from a parallel class)
	 * @return
	 * a new T with F added to the old T
	 */
	public <T extends F> T plus(F toAdd);

}
