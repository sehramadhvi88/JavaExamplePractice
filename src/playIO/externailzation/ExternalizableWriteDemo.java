package playIO.externailzation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizableWriteDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ExternalizableWriteDemo demo=new ExternalizableWriteDemo();
		demo.writeEmployeeObject();
		 
	}
	
	private void writeEmployeeObject() throws FileNotFoundException,IOException{
		
		FileOutputStream fileOutputStream=null;
		ObjectOutputStream objectOutputStream=null;
		
		try{
			
			fileOutputStream=new FileOutputStream("dogExt.txt");
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			Dog dog=new Dog();
			
			dog.setId(101);
			dog.setName("Peter"); 
			dog.setNoOfLegs(4); 
			dog.setAge(5);
			dog.setHeight(4.7d);
			dog.setWeight(60d);
			
			System.out.println("before serialization"); 
			System.out.println(dog); 
			
			objectOutputStream.writeObject(dog);  // this will call writeExternal method
			System.out.println("successfully written object to the file"); 
			
		}finally{
			
			if(objectOutputStream != null){
				objectOutputStream.close();
			}
		}
		
		
	}
	
	
}
