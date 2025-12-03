package ProblemSet_5a;

public class Test {
    public static void main(String[] args) {
    	RainfallYear year = new RainfallYear(2024);
    	double[] data = {
    			10.0, 20.0, 30.0, 40.0,
    			50.0, 60.0, 70.0, 80.0,
    			90.0, 100.0, 110.0, 120.0
    	};
    	year.enterData(data);
    	System.out.println("Rainfall for January: " + year.getRainfallMonth("January"));
        System.out.println("Rainfall for December: " + year.getRainfallMonth("December"));
        System.out.println("Mean rainfall: " + year.calculateMeanRainfall());
        System.out.println("Highest rainfall: " + year.calculateHighestRainfall());
    }
}
