package oopExample;

public class PolyMorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		example1 ex1=new example2(); // ref of type ex1 , object of type example2 at runtime
		example1 ex2=new example1(); // object of example1
		example2 ex3=new example2(); // object of example2
		example3 ex4=new example3(); // object of example2
		
		example1 exam3=new example3(); // ref of type ex1 , object of type example2 at runtime
		
		ex1.method1(); // execute inherited method in subclass
		ex1.methodExmaple1(); // execute example1 class method
		//ex2.methodExmaple2(); method undefined for ex2
		
		
		ex2.methodExmaple1();
		// sublcass can access super class methods
		ex3.methodExmaple1();
		ex4.methodExmaple1();
		
		exam3.methodParam1(ex4); 
		ex1.methodParam1(ex4); 
		
		
		
		
	}

}


class example1{
	
	public void method1(){
		System.out.println("method 1 example1");
	}
	
	public void methodExmaple1(){
		System.out.println("simple method example1");
	}
	
	public void methodParam1(example3 ex){
		System.out.println("param of example1");
	}
}


class example2 extends example1{
	
	public void method1(){
		System.out.println("method 1 example2");
	}
	
	public void methodExmaple2(){
		System.out.println("simple method example2");
	}
	
	public void methodParam1(example3 ex){
		System.out.println("param of example2");
	}
}

class example3 extends example1{
	
	public void method1(){
		System.out.println("method 1 example3");
	}
	
	public void methodExmaple3(){
		System.out.println("simple method example3");
	}
	
	public void methodParam1(example3 ex){
		System.out.println("param of example3");
	}
}