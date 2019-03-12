package PlayThreads;

public class JoinExample
{
   public static void main(String[] args) throws InterruptedException
   {
      Thread t = new Thread(new Runnable()
         {
            public void run()
            {
               System.out.println("First task started");
               System.out.println("Sleeping for 2 seconds");
               try
               {
                  Thread.sleep(2000);
               } catch (InterruptedException e)
               {
                  e.printStackTrace();
               }
               System.out.println("First task completed");
            }
         });
      Thread t1 = new Thread(new Runnable()
         {
            public void run()
            {
            	for(int i=0;i<3;i++){
               System.out.println("Second task completed= "+i);
            	}
            }
         });
      
      Thread t2 = new Thread(new Runnable()
      {
         public void run()
         {
        		for(int i=0;i<3;i++){
                    System.out.println("Third task completed= "+i);
                 	}
         }
      });
      t.start(); // Line 15
      t.join(); // Line 16
      t2.start();
      t2.join();
      t1.start();
      
     
   }
}