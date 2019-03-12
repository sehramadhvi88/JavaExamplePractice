package playCloning;

public class EmployeeDeepClone implements Cloneable{
 
    private int empoyeeId;
    private String employeeName;
    private DepartmentDeepClone departmentDeepClone;
 
    public EmployeeDeepClone(int id, String name, DepartmentDeepClone departmentDeepClone)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.departmentDeepClone = departmentDeepClone;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
       EmployeeDeepClone cloned=(EmployeeDeepClone)super.clone();
       cloned.setDepartmentDeepClone((DepartmentDeepClone)cloned.getDepartmentDeepClone().clone()); 
       return cloned;
    }
    
	public int getEmpoyeeId() {
		return empoyeeId;
	}
	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public DepartmentDeepClone getDepartmentDeepClone() {
		return departmentDeepClone;
	}

	public void setDepartmentDeepClone(DepartmentDeepClone departmentDeepClone) {
		this.departmentDeepClone = departmentDeepClone;
	}

	
     
    //Accessor/mutators methods will go there
}