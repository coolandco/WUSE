package helloWorld;

import com.WUSE.meter.meter;
import com.WUSE.zeit.seconds;

public class HelloWorld {


	/**
	 * Main function of helloWorld Project
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hello world");
		
		HelloWorld h = new HelloWorld();
		h.test("this is Sparta");
		
		
		meter m = new meter(1f);
		meter m2 = new meter(0.5f);
		System.out.println("Testausgabe " + m + " + " + m2);
		m.add(m2);

		System.out.println(m);
		
		seconds s = new seconds(1f);
		seconds s2 = new seconds(0.5f);
		
		System.out.println("Testausgabe " + s + " + " + s2);
		s.add(s2);

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
