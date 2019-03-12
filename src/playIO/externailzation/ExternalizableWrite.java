package playIO.externailzation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizableWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ExternalizableWrite demo=new ExternalizableWrite();
		demo.writeEmployeeObject();
		 
	}
	
	private void writeEmployeeObject() throws FileNotFoundException,IOException{
		
		FileOutputStream fileOutputStream=null;
		ObjectOutputStream objectOutputStream=null;
		
		try{
			
			fileOutputStream=new FileOutputStream("employeeExt.txt");
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			EmployeeClass empCls=new EmployeeClass();
			
			empCls.setId(101);
			empCls.setAge(28);
			empCls.setName("John"); 
			
			System.out.println(empCls); 
			
			objectOutputStream.writeObject(empCls);  // this will call writeExternal method
			System.out.println("successfully written object to the file"); 
			
		}finally{
			
			if(objectOutputStream != null){
				objectOutputStream.close();
			}
		}
		
		
	}
	
	
}
