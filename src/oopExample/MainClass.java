package oopExample;

abstract class Calculate
{
    abstract int add(int a, int b);
}
 
public class MainClass
{
    public static void main(String[] args)
    {
     /*   int result = new Calculate()
        {    
            @Override
            int add(int a, int b)
            {
                return a+b;
            }
        }.add(11010, 022011);*/
    	
    	System.out.println("main program");  
    	
    	int a=10;
    	
    	Integer i=Integer.valueOf(a);
    	System.out.println();
    	
    	int b=i;
    	
    }
    
    public static void main(int[] aa){
    	System.out.println("main overloaded");  
    }
}