package playIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		DeSerializationDemo demo=new DeSerializationDemo();
		demo.readStudentObject();
		 
	}
	
	private void readStudentObject() throws FileNotFoundException,IOException, ClassNotFoundException{
		
		FileInputStream fileInputStream=null;
		ObjectInputStream objectInputStream=null;
		
		try{
			
			fileInputStream=new FileInputStream("student.txt");
			objectInputStream=new ObjectInputStream(fileInputStream);
			
			Student student=(Student) objectInputStream.readObject();
			System.out.println("successfully read student object");
			
			System.out.println(student); 
			System.out.println("Name:"+student.getName() +" Age:"+student.getAge()); 
			
		}finally{ 
			
			if(objectInputStream != null){
				objectInputStream.close();
			}
		}
		
		
	}
	
	
}
