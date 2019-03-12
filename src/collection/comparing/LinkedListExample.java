package collection.comparing;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		
		System.out.println("linked list="+list);
		
		list.addFirst(400);
		list.addLast(500);
		
				
		System.out.println("linked list="+list);
		
		Set<Integer> ss=new HashSet<>();
		
		ss.add(600);
		ss.add(700);
		
		list.addAll(ss);

		System.out.println("linked list="+list);
		
		list.add(1, 900);
		list.push(1000);
		list.push(1100); 
		System.out.println("linked list="+list);
		
		System.out.println("linked list first="+list.getFirst()+" linked list last="+list.getLast());
	}

}
