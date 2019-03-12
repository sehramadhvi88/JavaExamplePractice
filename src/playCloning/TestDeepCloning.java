package playCloning;

public class TestDeepCloning {
 
    public static void main(String[] args) throws CloneNotSupportedException
    {
    	DepartmentDeepClone hr = new DepartmentDeepClone(1, "Human Resource");
        EmployeeDeepClone original = new EmployeeDeepClone(1,"Admin", hr);
        EmployeeDeepClone cloned = (EmployeeDeepClone) original.clone();
 
        //Let change the department name in cloned object and we will verify in original object
        cloned.getDepartmentDeepClone().setName("Finance");
 
        System.out.println("original=="+original.getDepartmentDeepClone().getName());       
        System.out.println("cloned=="+cloned.getDepartmentDeepClone().getName());
    }
    
    
}