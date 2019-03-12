package playNestedClass;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person=new Person(){
			void walk(){
				System.out.println("walking fast"); 
			}
		};
		
		person.walk();
	}

}
