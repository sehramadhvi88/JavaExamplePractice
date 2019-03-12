package overriding;

public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestOverloading over=new TestOverloading();
		
		over.add(10,10);
		over.add(10.0,10.0);
		over.add(10f,10f);
		over.add(10.0, 20); 
		
	}
	
	
	void add(int a,int b){
		System.out.println(" int a+b= "+(a+b));  
	}
	
	void add(double a,int b){
		System.out.println(" double n int a+b= "+(a+b));  
	}
	
	void add(double a,double b){
		System.out.println(" double n double a+b= "+(a+b));  
	}
}
