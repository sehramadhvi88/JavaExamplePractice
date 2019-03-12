package PlayExceptions;

public class ExceptionHandlingDemo2
{
	public static void main(String[] args)
    {
			
		 try
	        {
	            methodThrowingUncheckedException();
	        }
	        catch(NumberFormatException ex)
	        {
	            System.out.println("NumberFormatException will be caught here");
	        }
	 
	        try
	        {
	            methodThrowingCheckedException();
	        }
	        catch (ClassNotFoundException e)
	        {
	            System.out.println("ClassNotFoundException will be caught here");
	        }
        
    }
 
	//method throwing Unchecked Exception declared without throws clause
	 
    static void methodThrowingUncheckedException()
    {
        int i = Integer.parseInt("abc");   
 
        //Above statement throws NumberFormatException which is unchecked type of exception
    }
 
    //method throwing checked Exception declared with throws clause
 
    static void methodThrowingCheckedException() throws ClassNotFoundException
    {
        Class.forName("AnyClassName");
 
        //Above statement throws ClassNotFoundException which is checked type of exception
    }
	
	
	
}

