package ProblemSet_2b;

public class Food {
   //instancing the variables ig
	private String name;
	private double amountOfSugar;
	//constructor
	public Food(String name, double amountOfSugar) {
		this.name = name;
		this.amountOfSugar = amountOfSugar;
	}
	  //getters for the method
	public String getName() {
		return name;
	}
	public double getAmountOfSugar() {
		return amountOfSugar;
	}
}
