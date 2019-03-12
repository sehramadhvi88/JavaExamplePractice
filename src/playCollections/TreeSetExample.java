package playCollections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        //Creating a TreeSet
 
        TreeSet<Integer> set = new TreeSet<Integer>();
 
        //Adding elements to TreeSet
 
        set.add(20);
 
        set.add(10);
 
        set.add(40);
 
        set.add(80);
 
        set.add(30);
 
        set.add(null);    //It will throw NullPointerException
        //Printing elements of TreeSet
 
        System.out.println(set);      //Output : [10, 20, 30, 40, 80]
 
        //Notice that elements are placed in the sorted order.
        
      //Creating a TreeSet
        
        TreeSet<Object> set1 = new TreeSet<Object>();
 
        //Adding elements to TreeSet
 
        set1.add("kkk");      //inserting String type element
 
        set1.add(10);        //inserting Integer type element
 
        set1.add(new Object());      //inserting Object type element
 
        set1.add(20.65);     //inserting Double type element
 
        //The elements inserted are not mutually comparable. So, it will throw ClassCastException.
 
      //Creating a TreeSet
        
        TreeSet<String> treeSet = new TreeSet<String>();
 
        //Getting a synchronized TreeSet
 
        Set<String> set2 = Collections.synchronizedSortedSet(treeSet);
        
        
    }
}