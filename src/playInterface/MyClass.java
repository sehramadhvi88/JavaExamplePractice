package playInterface;

public class MyClass implements InterfaceA{

	@Override
	public void sayWelcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome..."); 
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Bye...");
	}

	@Override
	public void nestedMethod() {
		// TODO Auto-generated method stub
		System.out.println("Nested Method...");
	}

}
