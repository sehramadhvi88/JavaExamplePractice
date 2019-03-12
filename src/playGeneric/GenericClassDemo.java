package playGeneric;

public class GenericClassDemo {

	public static void main(String[] args) {
		
		GenericClass rawType = new GenericClass("jj"); 
		
		GenericClass<String> gen1=new GenericClass<String>("it must be string");
		
		gen1.setT("value changed");
		
		String s=gen1.getT();
		
		//gen1.setT(new Integer(123)); // compile time error You can't pass Integer type to setT() method now
		
		GenericClass<Integer> gen2 = new GenericClass<Integer>(new Integer(123));
		 
        gen2.setT(456);             //Passing Integer type to setT() method
 
        Integer I = gen2.getT();      //getT() method returning Integer type
	
       // gen2.setT(new String("123"));      //Compile time error. You can't pass String type to setT() method now
        
		//GenericClass<int> gen3=new GenericClass<int>(3); //Error, can't use primitive type
        
      //  gen1 = gen2; // =>Type mismatch: cannot convert from GenericClass<Integer> to GenericClass<String>

        
        //========================================== generic class with two parameters
        
        
        GenericClassTwo<String,Integer> genT1=new GenericClassTwo<String,Integer>("value of t1",new Integer(123));
        
        GenericClassTwo<Integer, String> genT2 = new GenericClassTwo<Integer, String>(new Integer(123), "Value of t2");
        
        System.out.println(genT1.getT1());       //Output : Value of t1
 
        System.out.println(genT1.getT2());       //Output : 123
 
        System.out.println(genT2.getT1());       //Output : 123
 
        System.out.println(genT2.getT2());       //Output : Value of t2
        
        // ================================= generic method
        
        System.out.println("============ generic method ===============");
        
      //Creating object by passing Integer as an argument
        
        NonGenericClass nonGen1 = new NonGenericClass(1234); 
         
        //Creating object by passing String as an argument
         
        NonGenericClass nonGen2 = new NonGenericClass("abc");
         
        //Creating object by passing Double as an argument
         
        NonGenericClass nonGen3 = new NonGenericClass(25.69);
        
        
        NonGenericClass.genericMethod(new Integer(123));     //Passing Integer type as an argument 
        
        NonGenericClass.genericMethod("I am string");        //Passing String type as an argument
         
        NonGenericClass.genericMethod(new Double(25.89));    //Passing Double type as an argument
        
	}
	
}


// generic class
// generic class can implement generic interface

class GenericClass<T> implements GenericInterface<T>{
	
	T t;
	
	public GenericClass(T t){
		this.t=t;
	}
	
	@Override
	public void setT(T t){
		this.t=t;
	}
	
	@Override
	public T getT(){
		return t;
	}
	
}


// normal class can implement generic interface if type is of type wrapper

class NormalClass implements GenericInterface<Integer>{

	@Override
	public Integer getT() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setT(Integer arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

/*
 * Class implementing generic interface at least must have same number and 
 * same type of parameters and at most can have any number and any type of parameters.
 */

class GenericClass2<T, V> implements GenericInterface<T>
{

	@Override
	public void setT(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getT() {
		// TODO Auto-generated method stub
		return null;
	}
    //Class with two type parameters
}

/*class GenericClass<T1, T2> implements GenericInterface<T>
{
    //Compile time error, class having different type of parameters
}*/


// generic class with two type

class GenericClassTwo<T1,T2>{
	
	T1 t1;
	T2 t2;
	
	public GenericClassTwo(T1 t1,T2 t2){
		this.t1=t1;
		this.t2=t2;
	}

	public T1 getT1() {
		return t1;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}

	public T2 getT2() {
		return t2;
	}

	public void setT2(T2 t2) {
		this.t2 = t2;
	}
	
}


// generic interface

interface GenericInterface<T>{
	
	void setT(T t);
	
	T getT();
	
}

//==================================

// generic method

class NonGenericClass{
	
	public <T> NonGenericClass(T t1)
    {
        T t2 = t1;
         
        System.out.println(t2);
    }
	
	
	static <T> void genericMethod(T t1){
		
		T t2=t1;
		
		System.out.println(t2); 
	}
	
	
}

// generic with bound

/*
 * Number =>Integer , Double , Float , Byte
 * 
 */

class GenericClassBound <T extends Number>{ // declared Number class as upper bound of T
	
	T t;
	
	public GenericClassBound(T t){
		this.t=t;
	}
	
	public T getT(){
		return t;
	}
}

/*class GenericClassBoundWithClassAndInterface<T extends AnyClass & Inferface1 & Interface2>{
	
}*/

class NormalClassBound{
	
	static <T extends Number>  void genericMethodBound(T[] t){
		
		for (int i = 0; i < t.length; i++)
        {
            System.out.println(t[i]);
        }
	}
	
	
}


// wild card 




