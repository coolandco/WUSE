package helloWorld;

import com.WUSE.meter.A_geschwindigkeit;
import com.WUSE.meter.Centimeter;
import com.WUSE.meter.Decimeter;
import com.WUSE.meter.meter;
import com.WUSE.zeit.Hour;
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
		
		
		Decimeter dm = new Decimeter(5f);
		System.out.println("Testausgabe " + dm + " + " + m);
		dm = dm.plus(m);
		System.out.println(dm);
		
		
		second s = new second(1f);
		second s2 = new second(0.5f);
		System.out.println("Testausgabe " + s + " + " + s2);
		s = s.plus(s2);
		

		System.out.println(s);
		System.out.println();
		System.out.println();
		
		A_geschwindigkeit g;
		System.out.println(dm + "/" + s + "=");
		g = dm.dividedBy(s);
		System.out.println(g);
		
		System.out.println(c + "/" + s2+ "=");
		A_geschwindigkeit g2;
		g2 = c.dividedBy(s2);
		System.out.println(g2);
		
		System.out.println("Testausgabe " + g2 + " + " + g);
		g2 = g2.plus(g);
		
		
		System.out.println(g2);
		
		

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
