package playCollections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithCustomExample
{
    public static void main(String[] args)
    {
        MyComparator comp=new MyComparator();
        
        PriorityQueue<Employee> pQueue=new PriorityQueue<Employee>(7,comp);
 
        System.out.println("=== Inserting elements into pQueue. ==");
        //Inserting elements into pQueue.
       
        pQueue.offer(new Employee("AAA", 15000));
        
        pQueue.offer(new Employee("BBB", 12000));
         
        pQueue.offer(new Employee("CCC", 7500));
         
        pQueue.offer(new Employee("DDD", 17500));
         
        pQueue.offer(new Employee("EEE", 21500));
         
        pQueue.offer(new Employee("FFF", 29000));
         
        pQueue.offer(new Employee("GGG", 14300));
        
        System.out.println("=== Removing the head elements ==");
        //Removing the head elements
         
        System.out.println(pQueue.poll());       //Output --> CCC : 7500
        
        System.out.println(pQueue.poll());       //Output --> BBB : 12000
         
        System.out.println(pQueue.poll());       //Output --> GGG : 14300
         
        System.out.println(pQueue.poll());       //Output --> AAA : 15000
         
        System.out.println(pQueue.poll());       //Output --> DDD : 17500
         
        System.out.println(pQueue.poll());       //Output --> EEE : 21500
         
        System.out.println(pQueue.poll());       //Output --> FFF : 29000
        
    }
}

class Employee
{
    String name;
 
    int salary;
 
    //Constructor Of Employee
 
    public Employee(String name, int salary)
    {
        this.name = name;
 
        this.salary = salary;
    }
 
    @Override
    public String toString()
    {
        return name+" : "+salary;
    }
}

class MyComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.salary - e2.salary;
	}
	
	
	
}