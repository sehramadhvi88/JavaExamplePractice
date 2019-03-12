package playNestedClass;

public class ShadowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outer=new OuterClass();
		OuterClass.InnerClass inner=outer.new InnerClass();
		
		inner.innerDisplayParamterize();
		
	}

}
