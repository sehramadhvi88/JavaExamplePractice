package playIO.externailzation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeClass implements Externalizable {

	private int id;
	private String name;
	private int age;
	
	public EmployeeClass(){
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "EmployeeClass [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("inside readExternal"); 
		
		id=in.readInt();
		name=(String)in.readObject();
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("inside writeExternal");
		out.writeInt(id);
		out.writeObject(name); 
		
		
	}
	
}
