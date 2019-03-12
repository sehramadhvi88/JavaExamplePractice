package oopExample;

import java.util.EnumMap;
import java.util.Map;

public class TestEnumDemo { 
	  public static void main(String[] args) {
	    // Angle lookup
	    System.out.println(Direction1.NORTH.getAngle());
	    Direction1.NORTH.shout(); 
	   
	    Map enumMap=new EnumMap(Direction1.class);
	    
	    enumMap.put(Direction1.EAST, Direction1.EAST.getAngle());
	     enumMap.put(Direction1.WEST, Direction1.WEST.getAngle());
	     enumMap.put(Direction1.NORTH, Direction1.NORTH.getAngle());
	     enumMap.put(Direction1.SOUTH, Direction1.SOUTH.getAngle());
	    
	     System.out.println(Direction1.EAST.name());
	     System.out.println(Direction1.WEST);
	    
	  }
}

enum Direction {
   EAST,
   WEST,
   NORTH,
   SOUTH        //optionally can end with ";"
 }


class TestOuter{
	
	enum Direction{
		
		EAST,WEST,NORTH,SOUTH
	}
	
	// access a direction using TestOuter.Direction.NORTH
}

enum Direction1 {
	  // Enum types
	  EAST(0) {
		@Override
		public void shout() {
			// TODO Auto-generated method stub
			System.out.println("East");
		}
	  },
	  WEST(180) {
		@Override
		public void shout() {
			// TODO Auto-generated method stub
			System.out.println("West");
		}
	}, NORTH(90) {
		@Override
		public void shout() {
			// TODO Auto-generated method stub
			System.out.println("North");
		}
	}, SOUTH(270) {
		@Override
		public void shout() {
			// TODO Auto-generated method stub
			System.out.println("South");
		}
	};
	 
	  // Constructor
	  private Direction1(final int angle) {
	    this.angle = angle;
	  }
	 
	  // Internal state
	  private int angle;
	 
	  public int getAngle() {
	    return angle;
	  }
	  
	  public abstract void shout();
	  
	}