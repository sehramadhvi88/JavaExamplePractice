package playCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
  
public class JavaHashMapExample 
{    
    public static void main(String[] args) 
    {
        //Defining the HashMap
         
        HashMap<String, Double> map = new HashMap<String, Double>();
         
        //Adding some elements to HashMap
         
        map.put("Ashwin", 87.55);
         
        map.put("Bharat", 95.65);
         
        map.put("Chetan", 68.13);
         
        map.put("Dhanjay", 74.23);
         
        map.put("Kartik", 65.42);
         
        //HashMap can have one null key and multiple null values
         
        map.put(null, null);
         
        map.put("Sandesh", null);
         
        //Getting the size of the map
         
        System.out.println("Size Of The Map : "+map.size());
         
        System.out.println("-----------------");
         
        //Displaying the elements
         
        System.out.println("The elements are :");
         
        Set set = map.keySet();
         
        Iterator keySetIterator = set.iterator();
         
        while (keySetIterator.hasNext()) 
        {
            Object key = keySetIterator.next();
             
            System.out.println(key+"  : "+map.get(key));
        }
         
        System.out.println("-----------------");
         
        //Checking the map for a particular key/value
         
        System.out.println("Does this map has Chetan as key? "+map.containsKey("Chetan"));
         
        System.out.println("Does this map has 74.23 as value? "+map.containsValue(74.23));
         
        System.out.println("-----------------");
         
        //Removing an element from the map
         
        System.out.println("Value removed from the map : "+map.remove("Kartik"));
        
        
        System.out.println("--------Creating a ConcurrentHashMap---------");
        
        //Creating a ConcurrentHashMap
        
        ConcurrentHashMap<String, Integer> mapc = new ConcurrentHashMap<String, Integer>();
         
        //Adding elements to map
         
        mapc.put("ONE", 1);
         
        mapc.put("TWO", 2);
 
        mapc.put("THREE", 3);
         
        mapc.put("FOUR", 4);
         
        //Getting an Iterator from map
         
        Iterator<String> it = mapc.keySet().iterator();
         
        while (it.hasNext())
        {
            String key = (String) it.next();
             
            System.out.println(key+" : "+mapc.get(key));
             
            mapc.put("FIVE", 5);     //This will not be reflected in the Iterator
        }
        
        
    }    
}