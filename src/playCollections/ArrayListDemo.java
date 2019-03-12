package playCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

class ArrayListDemo
{
    public static void main(String[] args)
    {
    	ArrayList<Object> listObj = new ArrayList<>();
    	
    	listObj.add("obj1");
    	
    	listObj.add(new StudentClass(1));
    	
    	listObj.add(new Integer(1)); 
    	
    	for(Object obj:listObj){
    		System.out.println(obj); 
    	}
    	
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
        
        list.add("TWO");
 
        System.out.println(list);     //Output : [ZERO, TWO, FOUR]
        System.out.println(list.size());     //Output : 3
 
        //Inserting some more elements
        list.add("FOUR");
 
        list.add("FIVE");
 
        System.out.println(list); 
        System.out.println(list.size());    //Output : 5
 
        //Removing an element
        list.remove("TWO");
        
        System.out.println(list); 
        System.out.println(list.size());    //Output : 4
        
        list.add(2, "THREE");       //Inserting an element at index 2
        
        System.out.println(list);
        System.out.println(list.size());
        
        list.add(1, "ZERO");     //Inserting an element at index 1
 
        System.out.println(list);    //Output : [ZERO, ONE, TWO, THREE, FOUR]
        
        list.add(null);
        
        list.add(null);
        
        list.set(5, "Four");
        
        System.out.println(list);
        
        System.out.println("****************** bulk operation **********************");
        
        ArrayList<String> list2 = new ArrayList<String>();
        
        list2.add("Eight");
 
        list2.add("nine");
 
        list2.add("ten");
 
        list2.add("SIX");
        
        System.out.println(list2);     //Output : [THREE, FOUR, FIVE, SIX]
        
        list.addAll(list2);   //Appends list2 at the end of list1
 
        System.out.println(list);
        
        list.removeAll(list2);    //Removes the elements of list1 which are also elements of list2
        
        System.out.println(list);
        
        list.addAll(2, list2);    //Inserts all elements of list2 into list1 at position 2
        
        System.out.println(list); 
        
        /*
         * iteration can be done using 
         * 1. Iterator
         * 2. ListIterator
         * 3. For loop
         * 4. Enhanced For Loop
         * 
         */
        System.out.println("****************** Using list iterator **********************");
        
        //Iterator it=list.listIterator(); // ref type is of Iterator , so it does not provide hasPrevious method
        
        ListIterator<String> it=list.listIterator();
        
        System.out.println("****** in forward direction  **********");
        
        while(it.hasNext()){
        	
        	//String aa=it.next(); // Type mismatch: cannot convert from Object to String , if dont apply conversion
        	System.out.println(it.nextIndex()+" : "+it.next()); 
        	it.add("jhjhjh");
        	
        } 
        
        System.out.println("****** in backward irection , using same interator object for previous **********");
        
        //ListIterator<String> it1=list.listIterator();
        
        while(it.hasPrevious()){
        	
        	String aa1=it.previous(); // no Type mismatch: becoz list iterator is defined to iterate over strings
        	if(aa1 == null){
        		it.remove();
        	}
        	System.out.println(aa1);
        }
        
        System.out.println("****** in backward irection , using new interator object for previous **********");
        ListIterator<String> it1=list.listIterator();

        while(it1.hasPrevious()){
        	
        	String aa1=it1.previous(); // no Type mismatch: becoz list iterator is defined to iterate over strings 
        	System.out.println(aa1);
        }
        
        System.out.println("****************** Generic Example **********************");
        
        
        ArrayList list1 = new ArrayList();     //ArrayList without generics
        
        list1.add("ZERO");    //adding string type object
 
        list1.add(1);        //adding primitive int type
 
        list1.add(20.24);    //adding primitive double type
 
        list1.add(new Float(23.56));   //Adding Float wrapper type object
 
        list1.add(new Long(25));      //Adding Long wrapper type object
 
        System.out.println(list1);     //Output : [ZERO, 1, 20.24, 23.56, 25]
        
 
        // can achive thread safety in list also 
        
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        
        Collections.synchronizedList(list3);
 
        //It returns Synchronized list backed by original list.
        
        
    }
}