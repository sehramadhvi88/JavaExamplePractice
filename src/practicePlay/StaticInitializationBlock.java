package practicePlay;

class A1
{
    static int i;
 
    static
    {
        System.out.println(1);
 
        i = 100;
    }
    
    static int first;
    
    static String second;
 
    static
    {
        System.out.println(2);
 
        first = 100;
    }
 
    static
    {
        System.out.println(3);
 
        second = "SECOND";
    }
    
}
 
public class StaticInitializationBlock
{
    static
    {
        System.out.println(4);
    }
 
    public static void main(String[] args)
    {
        System.out.println(5);
 
        System.out.println(A1.i);
        
        System.out.println(A1.first);
        
        System.out.println(A1.second);
    }
}