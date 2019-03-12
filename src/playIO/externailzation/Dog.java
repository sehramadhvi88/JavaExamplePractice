package playIO.externailzation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Dog extends Animal implements Externalizable {

	private int id;
	private String name;
	private transient int noOfLegs;
	
	public Dog(){
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}		
	
	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	@Override
	public String toString() {
		return "Dog [getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getHeight()="
				+ getHeight() + ", getWeight()=" + getWeight() + " getNoOfLegs()=" + getNoOfLegs() +"]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println("inside readExternal");
		
		super.setAge(in.readInt());
		super.setHeight(in.readDouble());
		super.setWeight(in.readDouble());
		
		id=in.readInt();
		noOfLegs=in.readInt();
		name=(String)in.readObject(); 
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("inside writeExternal");
		
		/*(Animal class does not implements externalizable so 
		 * we need to seria)
		 * Animal class fields
		 */		
		out.writeInt(super.getAge());
		out.writeDouble(super.getHeight());
		out.writeDouble(super.getWeight());
		
		/*
		 * Dog class fields
		 */
		out.writeInt(id);
		out.writeInt(noOfLegs); 
		out.writeObject(name); 
		
	}

}
