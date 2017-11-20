package com.WUSE.zeit;

public class second extends A_zeit {

	
	public second(float value){
		super(1f,value);	//calls super constructor to set the baseRate
	}
	
	public second(){
		this(0f);	//generates a new meter object with value 0
	}

}
