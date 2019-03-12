package playCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample
{
    public static void main(String[] args)
    {
        //Creating LinkedHashSet
 
        LinkedHashSet<String> set = new LinkedHashSet<String>();
 
        //Adding elements to LinkedHashSet
 
        set.add("JAVA");
 
        set.add("J2EE");
 
        set.add("STRUTS");
 
        set.add("JSP");
 
        set.add("JDBC");
 
        set.add("HIBERNATE");
 
      //Adding two null elements
        
        set.add(null);
 
        set.add(null);
        
        //Printing elements of LinkedHashSet
 
        System.out.println(set);     
 
        //Output : [JAVA, J2EE, STRUTS, JSP, JDBC, HIBERNATE]
 
        //Notice the order of elements. They are placed according to their insertion order.
        
      //Getting Iterator object
        
        Iterator<String> it = set.iterator();
 
        //Modifying the LinkedHashSet after the Iterator is created
 
        set.add("JSF");
 
        while (it.hasNext())
        {
            //This statement will throw ConcurrentModificationException
 
            System.out.println(it.next());
        }
        
    }
}