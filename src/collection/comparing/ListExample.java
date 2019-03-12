package collection.comparing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> l1=new ArrayList(); 
		
		l1.add("o1");
		l1.add("o2");
		l1.add("o3");
		l1.add("o4");
		
		System.out.println("list="+l1); 
		
		System.out.println("chnage index 2 value");
		
		l1.add(1, "o5");
		
		System.out.println("list="+l1); 
		
		l1.add("o1");
		
		System.out.println("list="+l1);
		
		l1.remove("o1");
		
		System.out.println("list="+l1);
		
		List<String> l2=new ArrayList();
		
		l2.add("o2");
		l2.add("o4");
		
		System.out.println("list 2="+l2);
		
		l1.removeAll(l2);
		
		System.out.println("list="+l1);
		
		List<String> l3=new ArrayList();
		
		System.out.println("conatins ="+l1.containsAll(l3));
		l3.add("o5");
		l3.add("o1");
		
		System.out.println("list 3="+l3);
		
		Iterator<String> it=l1.iterator();
		
		
		
		System.out.println("conatins ="+l1.containsAll(l3));  
		
		
		
		System.out.println(l1.toArray());
		
		while(it.hasNext()){
			it.next(); // without this remove meothod will give illegalstateexception
			it.remove();
		}
		
		System.out.println("list="+l1);
	}
	
	
	
	
}
