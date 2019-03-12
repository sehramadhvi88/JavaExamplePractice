package playCollections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleWithComparator
{
    public static void main(String[] args)
    {
    	MyComparatorNew comp=new MyComparatorNew();
    	
    	TreeSet<StudentRecord> set=new TreeSet<StudentRecord>(comp);
    	
    	set.add(new StudentRecord(121, "Santosh", 85));
    	 
    	set.add(new StudentRecord(231, "Cherry", 71));
    	 
    	set.add(new StudentRecord(417, "David", 82));
    	 
    	set.add(new StudentRecord(562, "Praveen", 91));
    	 
    	set.add(new StudentRecord(231, "Raj", 61));         //Duplicate element
    	 
    	set.add(new StudentRecord(458, "John", 76));
    	
    	set.add(new StudentRecord(231, "Raj", 61));       //Duplicate element
    	
    	set.add(new StudentRecord(874, "Peter", 83));
    	 
    	set.add(new StudentRecord(231, "Hari", 52));       //Duplicate element
    	 
    	set.add(new StudentRecord(568, "Daniel", 89));
    
    	
    	//Iterating through TreeSet
    	 
    	Iterator<StudentRecord> it = set.iterator();
    	 
    	while (it.hasNext())
    	{
    	    System.out.println(it.next());
    	}
    	
    	
    }
}

class StudentRecord{
	
	int id;
	 
    String name;
 
    int perc_Of_Marks_Obtained;
 
    public StudentRecord(int id, String name, int perc_Of_Marks_Obtained)
    {
        this.id = id;
 
        this.name = name;
 
        this.perc_Of_Marks_Obtained = perc_Of_Marks_Obtained;
    }
 
    /*
     * treeset dont use hashcode and equals method 
     * instead it uses compare or compareTO method 
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString()
    {
        return id+" : "+name+" : "+perc_Of_Marks_Obtained;
    }
}

class MyComparatorNew implements Comparator<StudentRecord>{

	@Override
	public int compare(StudentRecord o1, StudentRecord o2) {
		// TODO Auto-generated method stub
		if(o1.id == o2.id){
			return 0;
		}else{
			return o2.perc_Of_Marks_Obtained - o1.perc_Of_Marks_Obtained;
		}
	}
	
}
