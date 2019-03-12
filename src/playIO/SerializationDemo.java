package playIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		SerializationDemo demo=new SerializationDemo();
		demo.writeStudentObject();
		 
	}
	
	private void writeStudentObject() throws FileNotFoundException,IOException{
		
		FileOutputStream fileOutputStream=null;
		ObjectOutputStream objectOutputStream=null;
		
		try{
			
			fileOutputStream=new FileOutputStream("student.txt");
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			Student student=new Student("Madhvi",28,11035694);
			System.out.println(student); 
			
			objectOutputStream.writeObject(student); 
			System.out.println("successfully written object to the file"); 
			
		}finally{
			
			if(objectOutputStream != null){
				objectOutputStream.close();
			}
		}
		
		
	}
	
	
}
