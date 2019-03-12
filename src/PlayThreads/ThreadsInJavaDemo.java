package PlayThreads;

public class ThreadsInJavaDemo
{
	//Main Thread
	public static void main(String[] args)
	{
		MyThreadnew thread = new MyThreadnew("My Thread");
		
		MyThreadnew thread1 = new MyThreadnew("My Thread1");
		 
        thread.start(); 
		
		System.out.println("before sleeping");
		
		try {
			thread.sleep(5000); // here main thread is sleep not mythread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		thread.method1();
		thread1.method2();
		
		System.out.println("After Sleeping"); 
		
	}
}

class MyThreadnew extends Thread
{
    public MyThreadnew(String name)
    {
        super(name);
    }
 
    @Override
    public void run()
    {
        for(int i = 0; i <= 1000; i++)
        {
            System.out.println(i);
            
            try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    
    synchronized public void method1(){
    	System.out.println("method1");
    }
    
    synchronized public void method2(){
    	System.out.println("method2");
    }
}