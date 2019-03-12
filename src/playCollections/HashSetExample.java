package playCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample
{
    public static void main(String[] args)
    {
        //Creating HashSet object
 
        HashSet<String> set = new HashSet<String>();
 
        /*
         * hashset internally uses hashmap so 
         *  whenevr you create and object of hashset one hashmap is also created 
         *  elements as stored as Key and Value = PRESENT 
         */
        
        //Adding elements to HashSet
 
        set.add("JAVA");
 
        set.add("JSP");
 
        set.add("STRUTS");
 
        set.add("HIBERNATE");
 
        set.add("JSP");
 
        set.add("JAVA");
 
      //Adding 3 null elements to hashSet
        
        set.add(null);
 
        set.add(null);
 
        set.add(null);
 
        
        
        //Printing the elements of HashSet
 
        System.out.println(set);     //Output : [STRUTS, HIBERNATE, JSP, JAVA]
 
        //You can notice that duplicate elements are not added to HashSet
        
      //getting synchronized set
        
        Set<String> syncSet = Collections.synchronizedSet(set);
        
     // let's create an array of String 
        String[] nriAccounts = {"NRE", "NRO", "FCNR", "RFC", "NRE"};
        
        // let's convert this array to HashSet in Java 
        // if array contains any duplicate than that would be lost 
        HashSet<String> setOfAccounts = new HashSet<>(Arrays.asList(nriAccounts));
        
        System.out.println("Array contains: " + Arrays.toString(nriAccounts));
        System.out.println("HashSet contains: " + setOfAccounts); 
        
        // if array contains duplicate than HashSet will have fewer 
        // elements than array 
        System.out.println("length of array: " + nriAccounts.length);
        System.out.println("size of HashSet: " + setOfAccounts.size()); 
        
        // Elements order will not be preserved when you convert an 
        // array to HashSet in Java, as Set is an unordered collection.
        
        System.out.println("Iterating over array in Java");
        for(String account: nriAccounts)
        { 
        	System.out.println("array: " + account);
        }
        
        System.out.println("Iterating over HashSet in Java");
        
        for(String account: setOfAccounts)
        { 
        	System.out.println("hashset: " + account);
        }

        
        
    }
}