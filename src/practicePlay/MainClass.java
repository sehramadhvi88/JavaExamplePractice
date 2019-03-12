package practicePlay;

import java.io.EOFException;
import java.io.IOException;

class Aa
{
    int i = 10;
}
 
class Bb extends Aa
{
    int i = 20;
}
 
class X
{
	//public X(){} 
	
	public X(int i)
    {
        System.out.println(1);
    }
	
    static void staticMethod() 
    {
        System.out.println("Class X");
    }
}
 
class Y extends X
{
	/*
	 * Class B doesn’t have any constructors written explicitly.
	 *  So, compiler will keep default constructor. 
	 *  In that default constructor, there will be a calling statement to super class constructor (super()). 
	 *  But, it is undefined in Class A.To remove the errors, either define A() 
	 *  constructor in class A or write B() constructor in class B and call super class constructor explicitly.
	 */
	
	public Y()  //Implicit super constructor X() is undefined. Must explicitly invoke another constructor
    {
		super(2);
        System.out.println(2);
    }
	
    static void staticMethod() 
    {
        System.out.println("Class Y");
    }
}


public class MainClass
{
    public static void main(String[] args)
    {
        Aa a = new Bb();
 
        Bb b =new Bb();
        
        System.out.println("using b refernce="+b.i);
        System.out.println("using a reference="+a.i);
    }
}