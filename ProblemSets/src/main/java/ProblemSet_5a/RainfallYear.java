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
		 if (data != null) {
		 for (int i = 0; i < rainfallMonths.length &&
				 i < data.length; i++) {
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
		for (double rainfall : rainfallMonths) { 
            if (rainfall > 0) {
            	sum += rainfall;
                count++;
            }
		}
		if (sum == 0) {
		return 0;
            }
		return sum / rainfallMonths.length;
		}
	 public double getRainfallMonth(String Month) {
		 switch (Month.toUpperCase()) {
		case "JANUARY":
			return rainfallMonths[0];
		case "FEBRUARY":
			return rainfallMonths[1];
		case "MARCH":
			return rainfallMonths[2];
		case "APRIL":
			return rainfallMonths[3];
		case "MAY":
			return rainfallMonths[4];
		case "JUNE":
			return rainfallMonths[5];
		case "JULY":
			return rainfallMonths[6];
		case "AUGUST":
			return rainfallMonths[7];
		case "SEPTEMBER":
			return rainfallMonths[8];
		case "OCTOBER":
			return rainfallMonths[9];
		case "NOVEMBER":
			return rainfallMonths[10];
		case "DECEMBER":
			return rainfallMonths[11];
	    default:
		 return 0;
	 }
	}
}

