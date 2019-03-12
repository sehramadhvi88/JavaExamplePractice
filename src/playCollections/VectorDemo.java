package playCollections;

import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        //Creating vector object with capacity of 3 and with default capacity increment i.e 0
 
        Vector<Integer> vector = new Vector<Integer>(3);
 
        //Printing Current Capacity of Vector
        System.out.println("size="+vector.size());
        System.out.println("capacity="+vector.capacity());      //Output : 3
 
        //Adding 4 elements (greater than the capacity) to vector
 
        vector.add(10);
 
        vector.add(20);
 
        vector.add(30);
 
        vector.add(40);
        
        vector.add(null); 
       
        System.out.println(vector);
 
        //again Printing Current Capacity of Vector
        System.out.println("size="+vector.size());
        System.out.println("capacity="+vector.capacity());     //Output : 6
        
      //Getting first element
        
        System.out.println("Getting first element="+vector.firstElement());     //Output : 10
 
        //Getting last element
 
        System.out.println("Getting last element="+vector.lastElement());      //Output : 40
        
        System.out.println("=======Using initial capacity======");
        
      //Creating Vector with default initial capacity of 10
        
        Vector<Integer> vector1 = new Vector<Integer>();
 
        //Adding elements to vector
 
        vector1.add(10);
 
        vector1.add(20);
 
        vector1.add(30);
 
        vector1.add(40);
        
        
 
        //Retrieving the current size of vector
 
        System.out.println(vector1.size());      //Output : 4
 
        //Setting the size of vector as 10.
 
        vector1.setSize(10);
 
        //Now retrieving the current size of vector
 
        System.out.println(vector1.size());    //Output : 10
 
        //Printing the elements of vector. notice that 6 null elements are inserted
 
        System.out.println(vector1);     //Output : [10, 20, 30, 40, null, null, null, null, null, null]
 
        //Again changing the size of vector to 3
 
        vector1.setSize(3);
 
        //Printing the elements of vector. notice that extra elements are removed.
 
        System.out.println(vector1);    //Output : [10, 20, 30]
        
        
        
        
    }
}