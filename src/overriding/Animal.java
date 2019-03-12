package overriding;

public class Animal {

	public void run(int a) throws ArithmeticException{
		System.out.println("animal is running"); 
	}
	
}

class Tiger extends Animal{
	
	/*public static void run(){ This static method cannot hide the instance method from Animal
		System.out.println("tiger is running"); 
	}*/
	
	/*public void run() throws Exception { // compile error
		System.out.println("tiger is running"); 
	}*/
	
	//@Override
	public void run() throws ArithmeticException{
		System.out.println("tiger is running"); 
	}
	
	/*public void run(){  //works fines 
		System.out.println("tiger is running"); 
	}*/
}

class Dog extends Animal{
	
	
	public void run() throws ArithmeticException{
		System.out.println("dog is running"); 
	}
	
	public void voice(){
		System.out.println("bark");
	}
	
}
