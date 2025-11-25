package ProblemSet_5c;

public class Pizza {
      private String[] toppings;
      private double cost;
      
      public Pizza() {
    	  toppings = new String[10];
    	  cost = 0;
      }
      
      public void addToppings(String[] toppings) {
    	  for (int i = 0; i < toppings.length && i < this.toppings.length; i++) {
    		  this.toppings[i] = toppings[i];
    	  }
      }

      public String printToppings() {
    	        StringBuilder result = new StringBuilder();

    	        for (int i = 0; i < toppings.length; i++) {
    	            if (toppings[i] != null) {
    	                if (result.length() > 0) {
    	                    result.append(",");
    	                }
    	                result.append(toppings[i]);
    	            }
    	        }

    	        return result.toString();
          }
      public double calculateCost() {
          int count = getNumberOfToppings();

          switch (count) {
              case 0: cost = 0;
                  break;
              case 1: cost = 9.99;
                  break;
              case 2:
              case 3: cost = 10.99;
                  break;
              case 4:
              case 5: cost = 11.99;
                  break;
              case 6: cost = 12.99;
                  break;
              case 7: cost = 13.99;
                  break;
              case 8: cost = 14.99;
                  break;
              case 9: cost = 15.99;
                  break;
              case 10:cost = 14.99; // special offer
                  break;
          }
          return cost;
      }
    public int getNumberOfToppings() {
    	int count = 0;
    	for (String t : toppings) {
    		if (t!=null) {
    			count++;
    		}
    	}
    	return count;
    }
    public String[] getToppings() {
    	return toppings;
    }
    public double getCost() {
        return cost;
    }
}
