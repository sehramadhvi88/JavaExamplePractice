package playIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStreamDemo demo=new ObjectInputStreamDemo();
		demo.readEmployeeObject();
		 
	}
	
	private void readEmployeeObject() throws FileNotFoundException,IOException, ClassNotFoundException{
		
		FileInputStream fileInputStream=null;
		ObjectInputStream objectInputStream=null;
		
		try{
			
			fileInputStream=new FileInputStream("employee.txt");
			objectInputStream=new ObjectInputStream(fileInputStream);
			
			Employee emp=(Employee) objectInputStream.readObject();
			System.out.println("successfully read employee object");
			
			System.out.println(emp); 
			System.out.println(emp.getAddress());
			
		}finally{ 
			
			if(objectInputStream != null){
				objectInputStream.close();
			}
		}		
		
	}
	
	
}
