package playNestedClass;

import java.util.Iterator;

public class DataStructure {

	private static final int SIZE=10;
	private int[] arrayOfInts=new int[SIZE];
	
	public DataStructure(){
		
		for(int i=0;i<SIZE;i++){
			arrayOfInts[i]=i;
		}
		
	}
	
	public void printOdd(){
		
		DataStructureIterator dsi=new OddIterator();
		
		while(dsi.hasNext()){
			
			System.out.println("next odd value ="+dsi.next()); 
		}
		
		
	}
	
	interface DataStructureIterator extends Iterator<Integer>{
		
	}
	
	private class OddIterator implements DataStructureIterator{

		private int nextIndex=1;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			// check if the current element is the last element in array
			return (nextIndex <= SIZE-1);
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			
			Integer nextInt=Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex+=2;
			return nextInt;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
