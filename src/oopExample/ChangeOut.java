package oopExample;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ChangeOut {
	public static void main(String args[]) {
		
		Integer i1;
		Integer i2 = new Integer(2);
		
		i1=i2; // identity conversion
		
		i1 = (Integer) i2;
		
		try {
			System.setOut(new PrintStream(new FileOutputStream("log.txt")));
			System.out.println("Now the output is redirected!");
		} 
		catch (Exception e) {
		}
		
		byte a=1;
		byte b=2;
		//byte c=a+b; // Type mismatch: cannot convert from int to byte
		
		String a1=null;
		String b1="foo";
		
		String c=a1+b1;
		System.out.println("c="+c); 
		
		//String d=a1.concat(b1); //=> gives NPE
		
		String x="1"+2;
		//String y="1".concat(2); // =>The method concat(String) in the type String is not applicable for the arguments (int)
		
	}
}