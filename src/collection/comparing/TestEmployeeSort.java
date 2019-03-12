package collection.comparing;

import java.util.Collections;
import java.util.List;

public class TestEmployeeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> coll = Util.getEmployees();
		Collections.sort(coll); // sort method
		printList(coll);
		
		Collections.sort(coll, new EmpSortByName());
		printList(coll); 
	}
	
	private static void printList(List<Employee> list) {
		System.out.println("EmpId\tName\tAge");
		for (Employee e: list) {
		System.out.println(e.getEmpId() + "\t" + e.getEmpName()+ "\t" + e.getEmpAge());
		}
	}

}
