package ProblemSet_2b;

public class Test {
   public static void main(String[] arga) {
	   //objects
	   Food bltSandwich = new Food("BLT Sandwich", 4.7);
	   Food darkChocolate = new Food("dark Chocolate",48);
	   //meal
	   Meal myMeal = new Meal(bltSandwich, darkChocolate);
	    //Print
	   System.out.println(myMeal.toString());
	   System.out.println("Total amount of sugar: " + myMeal.calculateTotalSugarLevel() + "g");
   }
}
