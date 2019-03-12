package playInterface;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person st1=new Student("John");
		st1.walk();
		
		
		InterfaceA.InnerClass innerClass=new InterfaceA.InnerClass();
		innerClass.sayHi();
		
		InterfaceA mycLs=new MyClass();
		mycLs.sayWelcome();
		mycLs.sayBye();
		
	}

}
