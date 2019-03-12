package practicePlay;
class ClassOne1
{
    {
        System.out.println(1); // 3
    }
 
    static
    {
        System.out.println(2); // 2
    }
 
    public ClassOne1(int i)
    {
        System.out.println(3);
    }
 
    public ClassOne1()
    {
        System.out.println(4); // 4
    }
}
 
public class ClassTwo
{
    {
        System.out.println(5);
    }
 
    public static void main(String[] args)
    {
        System.out.println(6); // 1
 
        ClassOne one = new ClassOne();
 
        ClassOne1 two = new ClassOne1(10);
    }
    
    
}