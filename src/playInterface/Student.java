package playInterface;

// implements followed by extends
public class Student implements Person , Person1 {

	private String name;

	public Student(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(name+ " is walking slow "+ numberOfLegs+ " legs");
	}
	
}
