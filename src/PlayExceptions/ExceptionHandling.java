package PlayExceptions;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
       // Integer I = new Integer("abc");  //This statement throws NumberFormatException
        /*
         *  now apply try catch block around above statement
         * 
         */
        
        try
        {
            Integer I = new Integer("abc");  //This statement throws NumberFormatException
        }
        catch (Exception e)
        {
            System.out.println("exception caught="+e);
        }
        
 
        System.out.println("This statement will be executed");
        
        System.out.println("--------------------");
        
        try{
        
        	int i = 1000/0;    //This statement throws ArithmaticException : / by zero
        	System.out.println("This statement will not be executed");
        }catch(Exception e)
        {
            System.out.println("This block is executed immediately after an exception is thrown="+e);
        }
        finally
        {
            System.out.println("This block is always executed");
        }
        
        System.out.println("--------------------");
        
        System.out.println("This statement will be executed");
        
        String[] s = {"abc", "123", "xyz", "456"};   //String Array containing valid and invalid numeric values
        
        for (int i = 0; i < s.length; i++)
        {
            try
            {	
                int intValue = Integer.parseInt(s[i]); //This statement may throw NumberFormatException
            }
            catch(NumberFormatException ex)
            {
                System.out.println("The thrown NumberFormatException will be caught here");
            }
            finally
            {
                System.out.println("This block is always executed");
            }
        }
        
        System.out.println("----------Multiple Catch----------");
        
        String[] s1 = {"abc", "123", null, "xyz"};   //String array containing one null object
        
        for (int i = 0; i < 6; i++)
        {
            try
            {
                int a = s1[i].length() + Integer.parseInt(s1[i]);       
 
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
 
            }
 
            /*catch(NumberFormatException ex)
            {
                System.out.println("NumberFormatException will be caught here");
            }
 
            catch (ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("ArrayIndexOutOfBoundsException will be caught here");
            }
 
            catch (NullPointerException ex)
            {
                System.out.println("NullPointerException will be caught here");
            }
            
            we can handle multiple exceptions using pipe (|) in java 7
 */
            catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex){
            	
            	System.out.println(ex); 
            	 System.out.println("Now, this block handles NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException");
            }
            
            System.out.println("After executing respective catch block, this statement will be executed");
        }
        
        System.out.println("----------Nested Try-Catch----------");
        /*
         *  if exception specified in inner try-catch block is not handled then
         *  it will come to outer try catch block
         */
        
        String[] s2 = {"abc", "123", null, "xyz"};   //String array containing one null object
        
        for (int i = 0; i < s2.length; i++)
        {
            //First Level try-catch block
            try
            {
                int a = s2[i].length();    //This statement may throw NullPointerException
 
                //second level try-catch block
                try
                {
                    System.out.println(s2[i+1]);   //This statement may throw ArrayIndexOutOfBoundsException
 
                    //third level try-catch block
                    try
                    {
                        a = Integer.parseInt(s2[i]);    //This statement may throw NumberFormatException
                    }
                    catch (NullPointerException e)
                    {
                        System.out.println("NullPointerException will not be caught here");
                    }
                }
                catch (NumberFormatException ex)
                {
                    System.out.println("NumberFormatException will be caught here");
                }
            }
            catch(Exception ex)
            {
                System.out.println("This block catches all types of exceptions");
            }
        }
        
        
        
    }
}