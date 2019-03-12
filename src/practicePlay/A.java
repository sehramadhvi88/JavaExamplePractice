package practicePlay;
public class A
{
	static int staticField = 10;     //Static Field
	 
    //Instance Initialization Block - IIB
 
    {
        //using static field inside IIB
 
        System.out.println(staticField);
    }
	
    static
    {
        System.out.println(1);
    }
 
    static
    {
        System.out.println(2);
    }
 
    static
    {
        System.out.println(3);
    }
 
    static void staticMethod()
    {
        //nonStaticMethod();    //Compile time error : can't make static reference to non-static method
    }
 
    void nonStaticMethod()
    {
 
    }
    
    {
       // System.out.println(i); // Cannot reference a field before it is defined
    }
 
    int i = 10;
    
    public static void main(String[] args)
    {
        A a;
    }
}