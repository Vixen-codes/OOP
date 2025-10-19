package lab_2;

public class ClockDisplayTest {
   
	public static void main(String[] args) {
	
	ClockDisplay clock = new ClockDisplay();
    
    for (int i = 0; i < 100; i++) {
    	  // The next two lines of code will be executed 100 times.
    	  clock.timeTick();
    	  
    	  System.out.println(clock.toString());
    	  }
	}
}

	
	
