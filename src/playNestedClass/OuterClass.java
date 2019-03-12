package playNestedClass;

public class OuterClass {

	
	private int outerVariable=10;
	public int outerPublicVariable=20;
	protected int outerProtectedVariable=30;
	int outerDefaultVariable=40;
	private static int staticOuterVariable=200;
	
	int x=60;
	
	private String name="John";
	
	
	public void greetInEnglish(){
		
		/*
		 * The member interface Hello can only be defined inside a top-level class or interface or in a static context
		 * interface Hello{
			
		}*/
		
		
		class SayHello{
			
			/*
			 * The field mesg cannot be declared static in a non-static inner type,
			 *  unless initialized with a constant expression
			 *  
			 *  we cant declare static variable without using "Final" in local class
			 */
			public static final String mesg="welcome say hello";
			
			public void greet(){
				
				System.out.println(mesg); 
			}
		}
		
		SayHello sayHello=new SayHello();
		sayHello.greet();
		
		
	}
	
	public void display(final String param){
		
		final String localVar="Local Variable";
		
		class LocalClass{ 
			
			String message="welcome";
			
			public void displayMessage(){
				
				System.out.println("message =="+message+" "+name);
				
				System.out.println("localVar =="+localVar);
				
				System.out.println("param =="+param);
				
			}
			
		}
		
		LocalClass localClass=new LocalClass();
		localClass.displayMessage();
		
		
	}
	
	public void outerDisplay(){
		System.out.println("outer class display methods");
	}
	
	static public void staticOuterDisplay(){
		System.out.println("static outer class display methods");
	}
	
	/*
	 * static nested class dont have access to other members of enclosing class
	 */
	static class StaticNestedClass{
		
		int staticInnerVariable=2000;
		
		public void nestedStaticDisplay(){
			
			System.out.println("static nested display method");
			System.out.println("staticInnerVariable :"+staticInnerVariable);
			System.out.println("staticOuterVariable :"+staticOuterVariable);
			staticOuterDisplay();
			/*
			 * we can only access static members of enclosing class
			 */
			//outerDisplay(); //=>Cannot make a static reference to the non-static method outerDisplay() from the type OuterClass
			
		}
		
	}
	
	/*
	 * inner class can access outer class instance members => static or non-static (variables n methods) 
	 * cant define static members , becoz it is associated with instance 
	 * 
	 */
	
	class InnerClass{
		
		int innerVariable=300;
		
		int x=600;
		
		public void innerDisplayParamterize(){
			
			System.out.println("inner display paramterize method");
			
			System.out.println("x: "+x);
			System.out.println("this ="+this);
			System.out.println("this.x = "+this.x);
			System.out.println("OuterClass.this = "+OuterClass.this);
			System.out.println("OuterClass.this.x = "+OuterClass.this.x);
			
			
		}
		
		public void innerDisplay(){
			
			System.out.println("inner display method");
			System.out.println("innerVariable :"+innerVariable);
			
			System.out.println("===== Outer Non-Static =====");
			
			System.out.println("outerVarible :"+outerVariable);
			System.out.println("outerPublicVarible :"+outerPublicVariable);
			System.out.println("outerProtectedVarible :"+outerProtectedVariable);
			System.out.println("outerDefaultVarible :"+outerDefaultVariable);
			outerDisplay();
			
			System.out.println("===== Outer Static =====");
			
			System.out.println("staticOuterVariable :"+staticOuterVariable);
			staticOuterDisplay();
		}
		
	}
	
}
