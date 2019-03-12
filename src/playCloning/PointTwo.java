package playCloning;

public class PointTwo extends PointOne{
    private Integer z;
 
    public PointTwo(PointTwo point){
        super(point); //Call Super class constructor here
        this.z = point.z;
    } 

	public PointTwo(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		super(i,j);
		z=k;
	}
}