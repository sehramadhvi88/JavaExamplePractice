package playCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Customer> set = new LinkedHashSet<Customer>();
		
		set.add(new Customer("Jack", 021));
		 
		set.add(new Customer("Peter", 105));
		 
		set.add(new Customer("Ramesh", 415));    
		 
		set.add(new Customer("Julian", 814));
		 
		set.add(new Customer("Peter", 105));      //Duplicate Element
		 
		set.add(new Customer("Sapna", 879));
		 
		set.add(new Customer("John", 546));
		 
		set.add(new Customer("Moni", 254));
		 
		set.add(new Customer("Ravi", 105));        //Duplicate Element
		
		Iterator<Customer> it = set.iterator();
		 
		while (it.hasNext())
		{
		    Customer customer = (Customer) it.next();
		 
		    System.out.println(customer);
		}
		
	}

}

class Customer
{
    String name;
 
    int id;
 
    public Customer(String name, int id)
    {
        this.name = name;
 
        this.id = id;
    }
 /*
  * if we dont override equals and hashcode it will add
  * different objects with same value 
  *  17 : Jack
105 : Peter
415 : Ramesh
814 : Julian
105 : Peter
879 : Sapna
546 : John
254 : Moni
105 : Ravi
  *
  * 
  * */
    
    @Override
    public int hashCode() 
    {
        return id;
    }
 
    @Override
    public boolean equals(Object obj)
    {
        Customer customer = (Customer) obj;
 
        return (id == customer.id);
    }
 
    @Override
    public String toString()
    {
        return id+" : "+name;
    }
}