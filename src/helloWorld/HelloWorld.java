package helloWorld;

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
