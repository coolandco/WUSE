package com.WUSE.Distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_distanceTest {

	final String resultWrong = "Result Wrong";

	@Test
	public void testAdditionOfDistances() {
		
		//generates distances with some length
		Centimeter c = new Centimeter(2);
		
		Decimeter d = new Decimeter(4);
		
		Meter m = new Meter(1);
		
		
		//generates distancecs with lengh 0
		Centimeter c0 = new Centimeter();
		
		Decimeter d0 = new Decimeter();
		
		Meter m0 = new Meter();
		
		if(c.plus(d).getValue() != 42f)
			fail(resultWrong);
		
		if(d.plus(c).getValue() != 4.2f)
			fail(resultWrong);
		
		if(d.plus(m).getValue() != 14f)
			fail(resultWrong);
		
		if(m.plus(d).getValue() != 1.4f)
			fail(resultWrong);
		
		if(c.plus(m).getValue() != 102f)
			fail(resultWrong);
		
		if(m.plus(c).getValue() != 1.02f)
			fail(resultWrong);
		
		if(m.getValue() != m.plus(m0).getValue())
			fail(resultWrong);
		
		if(d.getValue() != d.plus(d0).getValue())
			fail(resultWrong);
		
		if(c.getValue() != c0.plus(c).getValue())
			fail(resultWrong);
		
	}


}
