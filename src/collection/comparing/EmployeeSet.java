package collection.comparing;

import java.util.*;

class Employee1 {

	String name;
	String id;

	Employee1(String name,String id) {
		this.name = name;
		this.id=id;
	}	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("hashcode="+result); 
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class EmployeeSet {

	public static void main(String ar[]) {

		Employee1 e1 = new Employee1("madhvi","1");
		Employee1 e2 = new Employee1("madhvi","1");

		Set<Employee1> emp = new HashSet<Employee1>();
		emp.add(e1);
		emp.add(e2);

		System.out.println(emp);
		
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"one");
		map.put(2,"two");
		
		for(Map.Entry<Integer, String> entry:map.entrySet()){
			
			System.out.println(entry.getKey()+":"+entry.getValue()); 
			
			
		}
		

	}

}
