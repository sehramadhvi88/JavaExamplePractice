package oopExample;

import java.util.Arrays;

class Base {
    static {
        System.out.println("Base static block");
    }
    {
        System.out.println("Base instance block");
    }

    public Base() {
        System.out.println("Base constructor");
    }
}

public class Derived extends Base {
    static {
        System.out.println("Derived static block");
    }
    {
        System.out.println("Derived instance block");
    }

    public Derived() {
        System.out.println("Derived constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Derived d = new Derived();
        System.out.println(Arrays.toString("\u0041".getBytes()));
        
        Base b=new Derived();
        
        Derived d1 = new Derived();
        Base b1=new Base();
        
        d1=(Derived) b1; 
        
        
       b=d;
        
        int i=10;
        System.out.println("i="+i); 
        Integer ii=i; // autoboxing
        System.out.println("ii="+ii); 
        int a=ii;  // unboxning
        System.out.println("a="+a); 
        
        
        
    }
}