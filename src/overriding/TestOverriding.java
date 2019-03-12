package overriding;

public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child=new Child();
		child.sayWelcome();
		
		Animal animal=new Tiger();
		//animal.run();
		
		animal=new Dog();
		//animal.run();
		//animal.voice(); // The method voice() is undefined for the type Animal
		
		Dog d1=new Dog();
		d1.voice();
		
		Object obj=new Object();
		
		obj=new String();
		System.out.println("obj as string=="+obj); 
		obj=new Integer(10);
		System.out.println("obj as integer=="+obj); 
		obj=new Float(5.6); 
		System.out.println("obj as float=="+obj); 
		
		Tiger t1=(Tiger) new Animal(); // => Type mismatch: cannot convert from Animal to Tiger
		t1.run(); /* on typecasting it wud not give compile time error but at run time 
		
		 *java.lang.ClassCastException: overriding.Animal cannot be cast to overriding.Tiger
		 */
		
		
		
		
	}

}
