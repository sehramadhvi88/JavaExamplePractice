package overriding;

import java.io.IOException;

class Base {
	
	public Base(){
		System.out.println("default base");
	}
	

	public static void test() throws IOException{
		
		System.out.println("test parent");
	}
	
	
}

class Derive extends Base {

	/*public static void test() throws Exception{   // Exception Exception is not compatible with throws clause in Base.test()
		
		System.out.println("test derive");
	}*/
	
public Derive(){
		
		this("madhvi");
		System.out.println("default derive");
		
	}
	
	private Derive(String name){
		System.out.println(name); 
	}
	
public static void test() throws ArithmeticException {   // Exception Exception is not compatible with throws clause in Base.test()
		
		System.out.println("test derive");
	}
	
}