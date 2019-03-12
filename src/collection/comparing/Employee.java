package collection.comparing;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	private String empName;
	private int empAge;
	
	public Employee(int empId,String empName,int empAge){
		
		this.empId=empId;
		this.empAge=empAge;
		this.empName=empName;		
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		System.out.println(this.empId+"  "+e1.empId);
		
		return this.empId-e1.empId;
	}
	
	
	

}
