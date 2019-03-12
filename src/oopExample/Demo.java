package oopExample;

class Test
{
      static
     {
        System.out.println("Why I am not executing ");
     }
   // public static final int param=20;
      public final int param=20;
      
      public int getParam(){
    	  return param; 
    	  }

      static void display(){
    	  System.out.println("Buggy Bread");
    	  }

}

public class Demo 
{
	int z;
    public static void main(String[] args) 
   {
     //System.out.println(Test.param);
    	//System.out.println(new Test().param);
    	
    	Test t=null;
    	t.display();
    	
    	
    	/*int x = 10; 
    	int y; 
    	if (x < 100) y = x / 0; 
    	if (x >= 100) y = x * 0; */
    	//System.out.println("The value of y is: " + y + new Demo().z);  //The local variable y may not have been initialized

    	StringBuffer s1=new StringBuffer("Buggy");

    	test(s1);

    	System.out.println(s1);
    	
    	String s2=new String("Buggy");

    	//test(s2); //The method test(StringBuffer) in the type Demo is not applicable for the arguments (String)

    	System.out.println(s2);


    	
   }
    
    private static void test(StringBuffer s){
    	//s.append("Bread");
    	s=new StringBuffer("Bread");
    	}
 
    
    
}
