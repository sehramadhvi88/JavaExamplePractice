package playCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModExceptionDemo {

	public static void main(String args[]) {

		List<String> listOfPhones = new ArrayList<String>(
				Arrays.asList("iPhone 6S", "iPhone 6", "iPhone 5", "Samsung Galaxy 4", "Lumia Nokia"));

		System.out.println("list of phones: " + listOfPhones); // Iterating and
																// removing
																// objects from
																// list

		// This is wrong way, will throw ConcurrentModificationException
		for (String phone : listOfPhones) {
			if (phone.startsWith("iPhone")) {
				//listOfPhones.remove(phone); // will throw exception

			}
		}

		// The Right way, iterating elements using Iterator's remove() method
		Iterator<String> itr = listOfPhones.iterator();
		
		//listOfPhones.remove(0);
		//listOfPhones.add("New Phone");
		System.out.println("list of phones: " + listOfPhones); 
		while (itr.hasNext()) {
			String phone = itr.next();
			if (phone.startsWith("iPhone")) {
				//listOfPhones.remove(phone); // wrong again
				itr.remove(); // right call
			}
		}
		System.out.println("list after removal: " + listOfPhones);
	}
}
