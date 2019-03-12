package oopExample;

public class StaticExample {

	static{
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		StaticClass s1=new StaticClass();
		s1.showData();
		
		StaticClass s2=new StaticClass();
		s2.showData();
	}

}


class StaticClass{
	
	
	int a;
	static int b;
	
	public StaticClass(){
		b++;
	}
	
	public void showData(){
		System.out.println("value of a="+a);
		System.out.println("value of b="+b); 
	}
	
	/*public static void increment(){
		a++;  Cannot make a static reference to the non-static field a
	}*/
	
	
}