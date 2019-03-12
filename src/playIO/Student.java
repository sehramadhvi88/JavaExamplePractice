package playIO;

public class Student extends Person{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int rollNo;
	
	public Student(String name, int age,int rollNo) {
		super(name, age);
		this.rollNo=rollNo;
		// TODO Auto-generated constructor stub
	}
		
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	} 

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + "]";
	}
	
	
	
}
