package PlayThreads.producerconsumerexample;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerPattern {

    public static void main(String args[]){
  
     //Creating shared object
     BlockingQueue<Integer> sharedBlockingQueue = new LinkedBlockingQueue<Integer>();
 
     //Creating Producer and Consumer Thread
     Thread prodThread = new Thread(new Producer1(sharedBlockingQueue));
     Thread consThread = new Thread(new Consumer1(sharedBlockingQueue));

     //Starting producer and Consumer thread
     prodThread.start();
     consThread.start();
    }
 
}

//Producer Class in java
class Producer1 implements Runnable {

    private final BlockingQueue<Integer> sharedBlockingQueue;

    public Producer1(BlockingQueue<Integer> sharedBlockingQueue) {
        this.sharedBlockingQueue = sharedBlockingQueue;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println("Produced: " + i);
                sharedBlockingQueue.put(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

//Consumer Class in Java
class Consumer1 implements Runnable{

    private final BlockingQueue<Integer> sharedBlockingQueue;

    public Consumer1(BlockingQueue<Integer> sharedBlockingQueue) {
        this.sharedBlockingQueue = sharedBlockingQueue;
    }
  
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Consumed: "+ sharedBlockingQueue.take());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  
  
}