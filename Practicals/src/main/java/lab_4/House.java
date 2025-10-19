package lab_4;

public class House {
    //fields
	private int numberOfHouses;
	private int numberOfBottles;
	  //constructor
	public House(int numberOfHouse,int numberOfBottles, int numberOfHouses) {
		this.numberOfHouses = numberOfHouses;
		this.numberOfBottles = numberOfBottles;
	}
	//getter
	public int getNumberOfHouses() {
		return numberOfHouses;
	}
	//getter 2
	public int getNumberOfBottles() {
		return numberOfBottles;
	}
	//tostring thingy
	public String toString() {
        return "House number: " + this.numberOfHouses + ", (" + this.numberOfBottles + " bottles)";

     // Create an array of fixed size.
     houses[0] = 3;
     houses[1] = 0;
     houses[2] = 4;
       
     System.out.println("How many bottles in house 1 is " + houses[0]);
     System.out.println("How many bottles in house 2 is " + houses[1]);
     System.out.println("How many bottles in house 3 is " + houses[2]);

    }
}
