package helloWorld;

import com.WUSE.AbstractUnits.A_speed;
import com.WUSE.Distance.Centimeter;
import com.WUSE.Distance.Decimeter;
import com.WUSE.Distance.Meter;
import com.WUSE.Time.Hour;
import com.WUSE.Time.Minute;
import com.WUSE.Time.Second;

public class HelloWorld {


	/**
	 * Main function of helloWorld Project
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Meter m = new Meter(1f);
		Meter m2 = new Meter(0.5f);
		System.out.println("Testausgabe " + m + " + " + m2);
		
		Meter m3 = m.plus(m2);
		System.out.println(m3);
		
		
		Centimeter c = new Centimeter(1f);
		System.out.println("Testausgabe " + c + " + " + m);
		c = c.plus(m);
		System.out.println(c);
		
		
		Decimeter dm = new Decimeter(5f);
		System.out.println("Testausgabe " + dm + " + " + m);
		dm = dm.plus(m);
		System.out.println(dm);
		
		
		Second s = new Second(1f);
		Second s2 = new Second(0.5f);
		System.out.println("Testausgabe " + s + " + " + s2);
		s = s.plus(s2);
		

		System.out.println(s);
		System.out.println();
		System.out.println();
		
		A_speed g;
		System.out.println(dm + "/" + s + "=");
		g = dm.dividedBy(s);
		System.out.println(g);
		
		System.out.println(c + "/" + s2+ "=");
		A_speed g2;
		g2 = c.dividedBy(s2);
		System.out.println(g2);
		
		System.out.println("Testausgabe " + g2 + " + " + g);
		g2 = g2.plus(g);
		
		
		System.out.println(g2);
		
		
		//generates time with some value
		Hour h = new Hour(1);
		
		Minute mi = new Minute(3);

		Second se = new Second(3);
		
		
		System.out.println(se.plus(mi));
			
		
		

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
