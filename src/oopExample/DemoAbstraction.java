package oopExample;

public class DemoAbstraction {

	public static void main(String[] args) {
		
		//Person p=new Person(); =>Cannot instantiate the type Person
		System.out.println(Person.abc);
		Person.abcMethod();

		System.out.println("using person refernce====");
		Person p1=new Student();
		
		
		p1.eat();
		p1.walk();
		p1.abcMethod();
		System.out.println(p1.abc);
		//p1.talk(); =>The method talk() is undefined for the type Person
	
		System.out.println("using student refernce====");
		Student s1=new Student();
		
		s1.eat();
		s1.walk();
		s1.talk();
		
	}
	
}


abstract class Person{
	
	public static int abc=20;
	
	String name;
	
	public Person(String name){
		this.name=name;
	}
	
	Person(){
		System.out.println("abstract class constructor");
	}
	
	public static void abcMethod(){
		System.out.println("abstract class static method");
	}
	
	abstract public void walk();
	
	public void eat(){
		System.out.println("eating pizza");
	}
}

class Student extends Person{   
	/*
	 *  it wud give compile time error if we dont define constructor ,
	 *  but if we define default constructor in parent class then its fine 
	 */

	/*public Student(String name){
		super(name);
	}*/
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walkinggg...");
	}
	
	public void talk(){
		
		System.out.println("talking...");  
		
	}
	
}