package playIO.externailzation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableReadDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ExternalizableReadDemo demo=new ExternalizableReadDemo();
		demo.readEmployeeObject();
		  
	}
	
	private void readEmployeeObject() throws FileNotFoundException,IOException, ClassNotFoundException{
		
		FileInputStream fileInputStream=null;
		ObjectInputStream objectInputStream=null;
		
		try{
			
			fileInputStream=new FileInputStream("dogExt.txt");
			objectInputStream=new ObjectInputStream(fileInputStream);
			
			Dog dog=(Dog)objectInputStream.readObject();
			
			System.out.println(dog); 		 
			
			System.out.println("successfully read dog object from file"); 
			
		}finally{
			
			if(objectInputStream != null){
				objectInputStream.close();
			}
		}
		
		
	}
	
	
}
