package playCloning;

public class PointOne {
    private Integer x;
    private Integer y;
 
    public PointOne(PointOne point){
        this.x = point.x;
        this.y = point.y;
    }
 
	public PointOne(int i, int j) {
		// TODO Auto-generated constructor stub
		x=i;
		y=j;
	}
}