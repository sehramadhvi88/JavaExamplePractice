package playCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExamples {

	public static void main(String[] args) {

		/* 3 ways to create arrayList
		 * a) ArrayList() —> It creates an empty ArrayList with initial capacity
		 * of 10.
		 * 
		 * b) ArrayList(int initialCapacity) —> It creates an empty ArrayList
		 * with supplied initial capacity.
		 * 
		 * c) ArrayList(Collection c) —> It creates an ArrayList containing the
		 * elements of the supplied collection.
		 */
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		ArrayList<Integer> list2=new ArrayList<Integer>(20);
		
		ArrayList<Integer> list3=new ArrayList<Integer>(list);
	
		/*
		 * increase or decrease capacity 		 * 
		 */
		
		ArrayList<String> list4 = new ArrayList<String>();
		 
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list4.ensureCapacity(20);
        System.out.println("list4="+list4); 
        //Now 'list' can hold 20 elements.
		
        ArrayList<String> list5 = new ArrayList<String>();
        
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list5.ensureCapacity(20);
 
        //Now 'list' can hold 20 elements.
 
        list5.add("ONE");
 
        list5.add("TWO");
 
        list5.add("THREE");
 
        list5.add("FOUR");
 
        //reducing the current capacity to current size of an ArrayList.
 
        list5.trimToSize();
        System.out.println("list5="+list5); 
		
        ArrayList<String> list6 = new ArrayList<String>();
        
        list6.add("JAVA");
 
        list6.add("J2EE");
 
        list6.add("JSP");
 
        list6.add("SERVLETS");
 
        list6.add("STRUTS");
        
        list6.contains("JAVA");
 
        System.out.println(list6);      //Output : [JAVA, J2EE, JSP, SERVLETS, STRUTS]
 
        Object[] arr=list6.toArray();
        
        for (Object object : arr)
        {	
        	System.out.println(object);
        }
        
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        
        ArrayList<String> list7 = new ArrayList<String>(Arrays.asList(array)); 
        
        System.out.println(list7);
        
        
        String[] array1 = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        
        ArrayList<String> list8 = new ArrayList<String>();
         
        Collections.addAll(list8, array1);
         
        System.out.println(list8);
        
        
	}

}
