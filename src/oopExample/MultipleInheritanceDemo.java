package oopExample;

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
	
		testDemo1 d1=new testClass();
		
		d1.testmethod1();
		
		testDemo2 d2=new testClass();
		
		d2.testmethod1();
		
		
	}
	
	
}


interface testDemo1{
	
	public void testmethod1();
	
}

interface testDemo2{
	
	public void testmethod1();
	
}

class testClass implements testDemo1 , testDemo2{

	@Override
	public void testmethod1() {
		// TODO Auto-generated method stub
	System.out.println("test method 1 of interface"); 	
	}
}

class testDemoChild extends testDemoClass1 {
	
	
}

class testDemoClass1{
	
	void testMethodDemo(){
		
		System.out.println("testMethodDemo 1"); 
	} 
	
}


class testDemoClass2{
	
	void testMethodDemo(){
		
		System.out.println("testMethodDemo 2"); 
	} 
	
}