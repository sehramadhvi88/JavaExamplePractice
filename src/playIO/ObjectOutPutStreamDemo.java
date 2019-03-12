package playIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutPutStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ObjectOutPutStreamDemo demo=new ObjectOutPutStreamDemo();
		demo.writeEmployeeObject();
		 
	}
	
	private void writeEmployeeObject() throws FileNotFoundException,IOException{
		
		FileOutputStream fileOutputStream=null;
		ObjectOutputStream objectOutputStream=null;
		
		try{
			
			fileOutputStream=new FileOutputStream("employee.txt");
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			Address address = new Address("112/3 vishnu garden","delhi","delhi");
			
			Employee emp=new Employee("Madhvi",11035694,address);
			
			Employee emp1=new Employee("Madhvi",11035694,28);
			
			System.out.println(emp1); 
			
			objectOutputStream.writeObject(emp); 
			System.out.println("successfully written object to the file"); 
			
		}finally{
			
			if(objectOutputStream != null){
				objectOutputStream.close();
			}
		}
		
		
	}
	
	
}
