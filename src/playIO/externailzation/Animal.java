package playIO.externailzation;

public class Animal {

	private int age;
	private double height;
	private double weight;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double d) {
		this.height = d;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Animal [age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
