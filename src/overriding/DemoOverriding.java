package overriding;

import java.io.IOException;

public class DemoOverriding {

	public static void main(String[] args) {
		
		Base b=new Derive();
		
		try {
			b.test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception");
		}
		
		/*
		 * - Unhandled exception type IOException
	- The static method test() from the type Base should be accessed in a 
	 static way
		 */
	}
	
}
