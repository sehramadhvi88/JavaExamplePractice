package playCollections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo{

	public static void main(String[] args)  throws CloneNotSupportedException{
		
		Map<StudentClass,Integer> student = new HashMap<>();
		
		StudentClass s1=new StudentClass(1);
		StudentClass s2=new StudentClass(1);
		
		StudentClass s4=new StudentClass();
		StudentClass s3=(StudentClass) s1.clone(); // The method clone() from the type Object is not visible
		
		System.out.println("hashcode s1="+s1.hashCode());
		System.out.println("hashcode s2="+s2.hashCode());
		
		System.out.println("are s1 n s2 equal uisng equals ="+s1.equals(s2));
		System.out.println("are s1 n s2 equal using (==)="+(s1 ==s2)); 
		
		student.put(s1, 1);
		student.put(s2,1);
		
		System.out.println("map szie="+student.size()); 
		
	}
	
	
}


class StudentClass implements Cloneable{
	
	int id;
	
	public StudentClass(){
		
	}
	
	public StudentClass(int id){
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
		@Override
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
	
	
	
}
