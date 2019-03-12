package playCloning;

public class DepartmentDeepClone implements Cloneable
{
    private int id;
    private String name;
 
    public DepartmentDeepClone(int id, String name)
    {
        this.id = id;
        this.name = name;
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

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
    
    //Accessor/mutators methods will go there
}