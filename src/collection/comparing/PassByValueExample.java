package collection.comparing;

import java.util.ArrayList;
import java.util.List;

public class PassByValueExample {

	 static public void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3;
		
		List<String> list=new ArrayList<>();
		
		list.add("test1");
		list.add("test 2");
		
		System.out.println("list=="+list); 
		
		PassByValueExample pp=new PassByValueExample();
		
		System.out.println("a="+a);
		pp.updatePrimitive(a);
		System.out.println("a=="+a); 
		pp.update(list);
		
		System.out.println("list=="+list); 
		
	}
	
	private void updatePrimitive(int a) {
		// TODO Auto-generated method stub
		a=5;
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void update(List list){
			
		list.add("test 4");
		list.add("test 3");
		
		list=null;
		System.out.println("in list=="+list);
	}

}

/*final abstract class xyz{  // The class xyz can be either abstract or final, not both
	
}*/
