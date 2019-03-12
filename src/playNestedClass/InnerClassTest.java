package playNestedClass;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outerClass=new OuterClass();
		
		/*
		 * if inner class is private then it is not visible in other class => The type OuterClass.InnerClass is 
	 not visible
		 */
		
		OuterClass.InnerClass innerClass=outerClass.new InnerClass();
		
		innerClass.innerDisplay();
		
		
		DataStructure ds=new DataStructure();
		ds.printOdd();
		
	}

}
