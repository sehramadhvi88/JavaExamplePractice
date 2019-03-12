package oopExample;

public class InterfaceClassImpl{

	public static void main(String ar[]){
		
		TestInterface2 tt=new InterfaceClassImplement();
		
		TestInterface1 tt1=new InterfaceClassImplement();
		
		tt.testmethod();
		
		tt1.testmethod();
		
	}

}


class InterfaceClassImplement implements TestInterface2 {

	@Override
	public void testmethod() {
		// TODO Auto-generated method stub
		System.out.println("interface method");
	}

}
