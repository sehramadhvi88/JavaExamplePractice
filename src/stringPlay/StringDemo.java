package stringPlay;

public class StringDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String hello="Hello";
		
		String s1="madhvi";
		String s2="sehra";
		
		char []helloArray=hello.toCharArray();
		
		System.out.println(String.format("hi i am %s my age is %d", "madhvi",28));
		
		Integer i=Integer.valueOf("100");
		int ii=Integer.parseInt("10");
		
		System.out.println("s1.charAt(3)="+s1.charAt(3));
		
		System.out.println("substring ="+s1.substring(1, 4));
		System.out.println("substring ="+s2.substring(2)); 
		
		CharSequence chrs=s1.subSequence(1, 4);
		
		System.out.println("subsequence ="+chrs);  
		
		String str="Welcome to india madhvi";
		
		String ss[]=str.split(" ");
		String ss1[]=str.split(" ",3);
		
		for(String sa:ss){
			System.out.println(sa); 
		}
		
		
		for(String sa:ss1){
			System.out.println(sa); 
		}
		
	}
	
}
