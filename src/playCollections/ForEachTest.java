package playCollections;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachTest {
	public static void main(String args[]) {
		CustomCollection<String> myCollection = new CustomCollection<String>();

		myCollection.add("Java");
		myCollection.add("Scala");
		myCollection.add("Groovy"); // What does this code will do, print
									// language, throw exception or compile time
									// error 
		/*for(String language: myCollection) // Can only iterate over an array or an instance of java.lang.Iterable
		{
				System.out.println(language); 
		}*/ 
	}
}

class CustomCollection<T>  {
	private ArrayList<T> bucket;

	public CustomCollection() {
		bucket = new ArrayList();
	}

	public int size() {
		return bucket.size();
	}

	public boolean isEmpty() {
		return bucket.isEmpty();
	}
	
	public boolean contains(T o) {
		return bucket.contains(o);
	}

	public boolean add(T e) {
		return bucket.add(e);
	}

	public boolean remove(T o) {
		return bucket.remove(o);
	}
}
