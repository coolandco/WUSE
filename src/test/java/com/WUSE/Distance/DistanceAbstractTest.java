package com.WUSE.Distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceAbstractTest {

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
		
		
		float expected = 42f;
		float result = c.plus(d).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = 4.2f;
		result = d.plus(c).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = 14f;
		result = d.plus(m).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = 1.4f;
		result = m.plus(d).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = 102f;
		result = c.plus(m).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = 1.02f;
		result = m.plus(c).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = m.getValue();
		result = m.plus(m0).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = d.getValue();
		result = d.plus(d0).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = c.getValue();
		result = c0.plus(c).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
	}
	
	public void testSubtractionOfDistances() {
		
		//generates distances with some length
		Centimeter c = new Centimeter(2);
		
		Decimeter d = new Decimeter(4);
		
		Meter m = new Meter(1);
		
		
		//generates distancecs with lengh 0
		Centimeter c0 = new Centimeter();
		
		Decimeter d0 = new Decimeter();
		
		Meter m0 = new Meter();
		
		
		if(c.minus(d).getValue() != -38f)
			fail(resultWrong);
		
		if(m.minus(m0).getValue() != m0.getValue())
			fail(resultWrong);
		
		if(c0.minus(d0).getValue() != 0f)
			fail(resultWrong);
		
		if(m.minus(d).getValue() != 0.6f)
			fail(resultWrong);
	}


}
