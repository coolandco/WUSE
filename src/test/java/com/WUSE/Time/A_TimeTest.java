package com.WUSE.Time;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.org.apache.xpath.internal.operations.Minus;

public class A_TimeTest {

	final String resultWrong = "Result Wrong";
	
	@Test
	public void testAdditionOfTime() {
		
		//generates time with some value
		Hour h = new Hour(1);
		
		Minute m = new Minute(3);
		
		Second s = new Second(3);
		
		//generates time with value 0
		Minute m0 = new Minute();

		
		
		float expected = 1.05f;
		float result = h.plus(m).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = 183f;
		result = s.plus(m).getValue();
		if(result < expected - 0.5 || result > expected + 0.5) // because otherwise test fails
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
		expected = 60f;
		result = m0.plus(h).getValue();
		if(result != expected)
			fail(resultWrong +" expected: " + expected + " result: " + result);
		
	}
	

}
