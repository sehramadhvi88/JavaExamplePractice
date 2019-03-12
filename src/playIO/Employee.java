package playIO;

import java.io.Serializable;

public class Employee implements Serializable {

	/** 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private int id;
	
	private transient int age;
	
	private Address address;
	
	private static String company_name="INFOSYS";
	
	public Employee(String name,int id){
		super();
		this.name=name;
		this.id=id;
	}

	public Employee(String name,int id,int age){
		super();
		this.name=name;
		this.id=id;
		this.setAge(age);
	}
	
	public Employee(String name,int id,Address address){
		super();
		this.name=name;
		this.id=id;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id +" age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
