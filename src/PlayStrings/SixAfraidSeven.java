package PlayStrings;

public class SixAfraidSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s = "1234567789";
		
		String s1[]={"67","76","789"};
		
		String s2="";
		
		if(s.contains(s1[0])){
			s2=s.replace(s1[0], "7");
			s=s2;
			System.out.println("s2="+s2);
		}
		if(s.contains(s1[1])){
			s2=s.replace(s1[1], "7");
			s=s2;
			System.out.println("s2="+s2);
		}
		if(s.contains(s1[2])){
			s2=s.replace(s1[2], "7");
		}
		
		System.out.println("s2="+s2);
		
	
		String s3 = "1234567789";
		
		String s4=s3.replaceAll("[67|76|789]", "7");
		System.out.println("s4=="+s4); 
		
	}

}
