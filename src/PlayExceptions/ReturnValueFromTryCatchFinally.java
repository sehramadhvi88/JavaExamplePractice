package PlayExceptions;

public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
        System.out.println(methodReturningValue1());
        System.out.println(methodReturningValue2());
        System.out.println(methodReturningValue3());
        System.out.println(methodReturningValue4());
        System.out.println(methodReturningValue5());
        System.out.println(methodReturningValue6());
        System.out.println(methodReturningValue7());
    }
 
    static int methodReturningValue()
    {
    	System.out.println("---- methodReturningValue ----");
        try
        {
            //This block may or may not return a value as finally block is returning a value
        }
        catch (Exception e)
        {
            //This block may or may not return a value as finally block is returning a value
        }
        finally
        {
            return 20;
        }
    }
    
    static int methodReturningValue1()
    {
    	System.out.println("---- methodReturningValue1 ----");
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            //Now, This block may or may not return a value
            //as both try and catch blocks are returning a value
        }
    }
    
    static int methodReturningValue2()
    {
    	System.out.println("---- methodReturningValue2 ----");
    	 try
         {
             return 1;
         }
         catch (Exception e)
         {
             return 2;
         }
         finally
         {
             return 3;
         }
  
        // System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
    }
    
    static int methodReturningValue3()
    {
    	System.out.println("---- methodReturningValue3 ----");
        try
        {
        	int i=10/0;
            return 50;    //control will not be passed to main() method here
        }
        catch (Exception e)
        {
            return 20;    //Control will not be passed to main() method here
        }
        finally
        {
            System.out.println("finally block is always executed"); 
            //Control will be passed to main() method after executing this block
         //   return 100; //-> this statement override return from catch even if exception ocuurs 
        }
    }
    
    static String methodReturningValue4()
    {
    	System.out.println("---- methodReturningValue4 ----");
        String s = null;
        try
        {
            s = "return value from try block";
            return s;
        }
        catch (Exception e)
        {
            s = s + "return value from catch block";
            return s;
        }
        finally
        {
            s = s + " return value from finally block";
            System.out.println("value of s="+s);
        }
    }
    
    static int methodReturningValue5()
    {
    	System.out.println("---- methodReturningValue5 ----");
        int i = 0;
 
        try
        {
            i = 1;
           //int j=10/0;// - if  exception occurs then this return wud not execute 
            return i;
        }
        catch (Exception e)
        {
            i = 2;
           //return i;
        }
        finally
        {
            i = 3;
            //System.out.println("finally print");
            //return i;
        }
        
        System.out.println("check this");
        return i; // becomes Unreachable code (if either catch or finally return), if we remove return from catch works fine
    }
    
    static int methodReturningValue6()
    {
    	System.out.println("---- methodReturningValue6 ----");
        try
        {
            int i = Integer.parseInt("123");
            return 20;
        }
        finally
        {
            return 50;
        }
        
      //  System.out.println("check this now"); // Unreachable code
    }
    
    static int methodReturningValue7()
    {
    	System.out.println("---- methodReturningValue7 ----");
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
            System.out.println("some statement");
            return 20;
        }
        finally
        {
           return 50;
        	/*
        	 * if we comment this return then it will 
        	 * throw exception at run time
        	 */
        }
    }
    
}
