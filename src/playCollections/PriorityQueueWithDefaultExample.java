package playCollections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueWithDefaultExample
{
    public static void main(String[] args)
    {
        //Creating a PriorityQueue with default Comparator.
 
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
 
        System.out.println("=== Inserting elements into pQueue. ==");
        //Inserting elements into pQueue.
              
        pQueue.offer(21);
 
        pQueue.offer(17);
 
        pQueue.offer(37);
 
        pQueue.offer(41);
 
        pQueue.offer(9);
 
        pQueue.offer(67);
 
        pQueue.offer(31);
 
        System.out.println(pQueue); 
        
        System.out.println("=== Removing the head elements ==");
        //Removing the head elements
 
        System.out.println(pQueue.poll());     //Output : 9
 
        System.out.println(pQueue.poll());     //Output : 17
 
        System.out.println(pQueue.poll());     //Output : 21
 
        System.out.println(pQueue.poll());     //Output : 31
 
        System.out.println(pQueue.poll());     //Output : 37
 
        System.out.println(pQueue.poll());     //Output : 41
 
        System.out.println(pQueue.poll());     //Output : 67
        
        
        //========================================
        
        Queue<Item> items = new PriorityQueue<Item>();
        items.add(new Item("IPone", 900));
        items.add(new Item("IPad", 1200));
        items.add(new Item("Xbox", 300));
        items.add(new Item("Watch", 200));

        System.out.println("Order of items in PriorityQueue");
        System.out.println(items);
      
        System.out.println("Element consumed from head of the PriorityQueue : " + items.poll());
        System.out.println(items);
      
        System.out.println("Element consumed from head of the PriorityQueue : " + items.poll());
        System.out.println(items);
      
        System.out.println("Element consumed from head of the PriorityQueue : " + items.poll());
        System.out.println(items);



        
        
    }
    
    private static class Item implements Comparable<Item>{
    	
    	private String name;
    	private int price;
		
    	public Item(String name,int price){
    		this.name=name;
    		this.price=price;
    	}
    	
    	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			return true;
		}
		
		@Override
		public String toString() {
			return "Item [name=" + name + ", price=" + price + "]";
		}

		@Override
		public int compareTo(Item i) {
			// TODO Auto-generated method stub
			 if (this.price == i.price) {
	                return this.name.compareTo(i.name);
	            }

	            return this.price - i.price;

		}
    	
    	
    	
    	
    	
    }


}