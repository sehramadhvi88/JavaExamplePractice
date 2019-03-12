package playGeneric;

import java.util.ArrayList;

public class GenericsInJava
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
 
        list.add("JAVA");
 
        list.add(123);
 
        for (Object object : list)
        {
            //Below statement throws ClassCastException at run time
 
            String str = (String) object;       //Type casting
 
            System.out.println(str);
        }
    }
    
    static void processElements(ArrayList<? extends Number> a)
    {
        for (Object element : a)
        {
            System.out.println(element);
        }
    }
    
    static void processElements1(ArrayList<?> a)
    {
        for (Object element : a)
        {
            System.out.println(element);
        }
    }
    
    static void processElements2(ArrayList<? super Integer> a)
    {
        for (Object element : a)
        {
            System.out.println(element);
        }
    }
}