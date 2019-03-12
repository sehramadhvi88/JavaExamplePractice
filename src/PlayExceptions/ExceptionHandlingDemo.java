package PlayExceptions;

public class ExceptionHandlingDemo
{
	public static void main(String[] args)
    {
        System.out.println("---- methodWithThrow ----");
		
		methodWithThrow();
        
		System.out.println("---- methodWithThrow1 ----");
		
        try
        {
        methodWithThrow1();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("NumberFormatException object thrown in methodWithThrow1() method will be handled here");
        }
        
        System.out.println("---- methodWithThrow2 ----");
        
       // methodWithThrow2(); -> throw exception 

        try
        {
        methodWithThrow2();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("NumberFormatException object thrown in methodWithThrow2() method will be handled here");
        }
        
        System.out.println("---- methodWithThrow3 ----");
        
        try
        {
            methodWithThrow3();
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException Re-thrown in methodWithThrow3() method will be handled here");
        }
        
        System.out.println("---- Throws method  ----");
        //methodWithThrows();

       try
        {
            methodWithThrows();
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException thrown by methodWithThrows() method will be caught here");
        }
       
       System.out.println("---- Throws method 1 ----");
       //methodWithThrows();

      try
       {
           methodWithThrows1();
       }
       catch(Exception ex)
       {
           System.out.println("This block can handle all types of exceptions");
       }
      
      System.out.println("---- Constructor throws ----");
      
    //  A a1 = new A("abc"); 
      
      try
      {
          A a = new A("abc");    //Object creation statement enclosed in try-catch block
      }
      catch (NumberFormatException ex)
      {
          System.out.println("NumberFormatException will be caught here");
      }
        
    }
 
    static void methodWithThrow()
    {
        try
        {
            NumberFormatException ex = new NumberFormatException();    //Creating an object to NumberFormatException explicitly
 
            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(NumberFormatException ex)
        {
            System.out.println("explicitly thrown NumberFormatException object will be caught here");
        }
    }
    
    static void methodWithThrow1()
    {
        try
        {
            NumberFormatException ex = new NumberFormatException("This is an object of NumberFormatException");
 
            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Explicitly thrown NumberFormatException object will not be caught here");
        }
    }
    
    static void methodWithThrow2()
    {
        NumberFormatException ex = new NumberFormatException("This is an object of NumberFormatException");
 
            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        
    }
    
    static void methodWithThrow3()
    {
        try
        {
            String s = null;
            System.out.println(s.length());   //This statement throws NullPointerException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException is caught here");
 
            throw ex;     //Re-throwing NullPointerException
        }
    }
    
    static void methodWithThrows() throws NullPointerException
    {
        String s = null;
        System.out.println(s.length());   //This statement throws NullPointerException
    }
    
    
    static void methodWithThrows1() throws NumberFormatException, NullPointerException
    {
        int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
 
        String s = null;
 
        System.out.println(s.length());    //This statement throws NullPointerException
    }
}

class A
{
    int i;
 
    public A(String s) throws NumberFormatException
    {
        i = Integer.parseInt(s);    //This statement throws NumberFormatException
    }
}
