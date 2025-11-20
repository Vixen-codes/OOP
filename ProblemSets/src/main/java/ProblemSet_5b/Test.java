package ProblemSet_5b;

public class Test {
  public static void main(String[] args) {
	  
	  Customer c1= new Customer("Salmon", "Fish");
	  GasBill bill1 = new GasBill("G1213-4567-1234", 21.21, c1);
	  
  System.out.println(bill1.displayAccountDetails());
  }
}
