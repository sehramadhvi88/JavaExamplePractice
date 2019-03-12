package playIO.externailzation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ExternalizableRead demo=new ExternalizableRead();
		demo.readEmployeeObject();
		  
	}
	
	private void readEmployeeObject() throws FileNotFoundException,IOException, ClassNotFoundException{
		
		FileInputStream fileInputStream=null;
		ObjectInputStream objectInputStream=null;
		
		try{
			
			fileInputStream=new FileInputStream("employeeExt.txt");
			objectInputStream=new ObjectInputStream(fileInputStream);
			
			EmployeeClass empCls=(EmployeeClass)objectInputStream.readObject();
			
			System.out.println(empCls); 		 
			
			System.out.println("successfully read employeeClass object from file"); 
			
		}finally{
			
			if(objectInputStream != null){
				objectInputStream.close();
			}
		}
		
		
	}
	
	
}
