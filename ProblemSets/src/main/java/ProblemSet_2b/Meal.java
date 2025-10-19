package ProblemSet_2b;

public class Meal {
   private Food mainCourse;
   private Food dessert;
   //constructor
   public Meal(Food mainCourse, Food dessert) {
	   this.mainCourse = mainCourse;
	   this.dessert = dessert;
   }
   //total sugar calcuator method
   public double calculateTotalSugarLevel() {
	   return mainCourse.getAmountOfSugar() + dessert.getAmountOfSugar();
   }
   @Override
   public String toString() {
	   return "Meal [mainCourse =" + mainCourse.getName() +
			   ", dessert =" + dessert.getName() + "]";
   }
}

