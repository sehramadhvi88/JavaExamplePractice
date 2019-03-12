package playInterface;

public interface InterfaceA extends InterfaceB, InterfaceB.NestedInterface{

	void sayWelcome();

	class InnerClass{
		
		public void sayHi(){
			System.out.println("say hii...");
		}
	}
	
}
