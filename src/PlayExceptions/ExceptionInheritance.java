package PlayExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//==============Super class with no exception==========================

class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("Super class method is not throwing any exceptions");
    }
}
 
class SubClass extends SuperClass
{
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("can be overrided with any unchecked Exception");
    }
}
 
class SubClassOne extends SuperClass
{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
    {
        System.out.println("Can be overrided with any number of Unchecked Exceptions");
    }
}
 
/*class SubClassTwo extends SuperClass
{
    @Override
    void methodOfSuperClass() throws SQLException
    {
        //Compile time error
        //Can not be overrided with checked exception
    }
}*/


//========================Super class with unchecked exception================================


class SuperClass1
{
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Super class method is throwing Unchecked exception");
    }
}
 
class SubClass1 extends SuperClass1
{
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("Can be Overrided with same unchecked exception");
    }
}
 
class SubClassOne1 extends SuperClass1
{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
    {
        System.out.println("Can be overrided with any other Unchecked Exceptions");
    }
}
 
/*class SubClassTwo1 extends SuperClass1
{
    @Override
    void methodOfSuperClass() throws IOException
    {
        //Compile time error
        //Can not be overrided with checked exception
    }
}*/


// ===================Super class throwing checked exception====================================

class SuperClass2
{
    void methodOfSuperClass() throws IOException
    {
        System.out.println("Super class method is throwing checked exception");
    }
}
 
class SubClass2 extends SuperClass2
{
    @Override
    void methodOfSuperClass() throws IOException
    {
        System.out.println("Can be Overrided with same checked exception");
    }
}
 
class SubClassOne2 extends SuperClass2
{
    @Override
    void methodOfSuperClass()  throws FileNotFoundException
    {
        System.out.println("Can be overrided with checked Exception with lesser scope");
    }
}
 
class SubClassTwo2 extends SuperClass2
{
    @Override
    void methodOfSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException,FileNotFoundException
    {
        System.out.println("Can be overrided with any unchecked exceptions and checked exception with lesser scope");
    }
    
    final void methodOfSuperClass1()
    {
        System.out.println("final Method");
    }
}

/* 	- Cannot override the final method from SubClassTwo2
 * class SubClassxx extends SubClassTwo2
{
    void methodOfSuperClass1()
    {
        //Compile time error, final method can not be overridden.
    }
}*/

 
/*class SubClassThree2 extends SuperClass2
{
    @Override
    void methodOfSuperClass() throws Exception
    {
        //Compile time error
        //Can not be overrided with checked exception with higher scope
    }
}*/
