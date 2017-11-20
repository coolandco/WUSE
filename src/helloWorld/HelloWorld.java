package helloWorld;

import com.WUSE.meter.Centimeter;
import com.WUSE.meter.meter;
import com.WUSE.zeit.second;

public class HelloWorld {


	/**
	 * Main function of helloWorld Project
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		meter m = new meter(1f);
		meter m2 = new meter(0.5f);
		System.out.println("Testausgabe " + m + " + " + m2);
		
		meter m3 = m.plus(m2);
		System.out.println(m3);
		
		
		Centimeter c = new Centimeter(1f);
		System.out.println("Testausgabe " + c + " + " + m);
		c = c.plus(m);
		System.out.println(c);
		
		System.out.println("Testausgabe " + c + " + " + m);
		m = c.plus(m);
		System.out.println(c);
		
		
		second s = new second(1f);
		second s2 = new second(0.5f);
		System.out.println("Testausgabe " + s + " + " + s2);
		s = s.plus(s2);
		System.out.println(s);

	}
	
	/**
	 * Function will output a String to a console.
	 * 
	 * @param test 
	 * Output for console
	 */
	public void test(String test) {


		System.out.println(test);
	}

}
