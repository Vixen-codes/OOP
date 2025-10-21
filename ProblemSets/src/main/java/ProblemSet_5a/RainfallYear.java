package ProblemSet_5a;

public class RainfallYear {
     private int year;
     private double[] rainfallMonths;
     //parametrised constructor
     public RainfallYear(int year) {
    	 this.year = year;
    	 this.rainfallMonths = new double[12];
     }
     public int getYear() {
    	 return this.year;
     }
	 public void enterData(double[] data) {
		// TODO Auto-generated method stub
		 if (data != null && data.length == rainfallMonths.length) {
		 for (int i = 0; i < rainfallMonths.length && i < data.length; i++) {
              rainfallMonths[i]	= data[i];		 
		 }
	 }
	 }
	 public double calculateHighestRainfall() {
		double highest = 0;
		
		for (double rainfall : rainfallMonths) {
			if (rainfall > highest) {
				highest = rainfall;
			}
		}
		return highest;
	 }
	 public double calculateMeanRainfall() {
		double sum = 0;
		int count = 0;
		for (double rainfall : rainfallMonths) {  //enhanced for loop,learnt from youtube, what can i say?
            sum += rainfall; //i know, fancy...
            if (rainfall > 0) {
                count++;
            }
		}
		if (sum == 0) {
		return 0;
            }
		return sum / rainfallMonths.length;
		}
	 public double getRainfallMonth(String Month) {
		switch(Month.toUpperCase()) {
		case "January":
			return rainfallMonths[0];
		case "Febuary":
			return rainfallMonths[1];
		case "March":
			return rainfallMonths[2];
		case "April":
			return rainfallMonths[3];
		case "May":
			return rainfallMonths[4];
		case "June":
			return rainfallMonths[5];
		case "July":
			return rainfallMonths[6];
		case "August":
			return rainfallMonths[7];
		case "September":
			return rainfallMonths[8];
		case "October":
			return rainfallMonths[9];
		case "November":
			return rainfallMonths[10];
		case "December":
			return rainfallMonths[11];
	    default:
		 return 0;
	 }
	}
}

