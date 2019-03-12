package playInterface;

interface Person {

	int numberOfLegs=2; // by default public static final
	
	void walk(); // by default public abstract
	
	/*
	 * Default methods are allowed only at source level 1.8 
	 or above
	 * default void sayHello(){ // if no definition student will give compile time error
		System.out.println("say hello..."); 
	}*/
	
	
}
