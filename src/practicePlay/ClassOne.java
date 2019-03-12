
package practicePlay;

class ClassOne
{
    static int i = 111;
     
    int j = 222;
     
    {
        i = i++ - ++j;
    }
    
    public static void main(String[] args) {
		
    	@SuppressWarnings("unused")
		ClassTwo1 clsTwo=new ClassTwo1();
	}
}
 
class ClassTwo1 extends ClassOne
{
    {
        j = i-- + --j;
    }
}