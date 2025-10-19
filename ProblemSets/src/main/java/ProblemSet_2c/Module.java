package ProblemSet_2c;

public class Module {
   //constant
	public static final String MODULE_NAME = "COM1027";
	//intancing variable ig
	private Assessment assessment1;
	private Assessment assessment2;
	private Assessment assessment3;
	
	//contructor (bob the builder hay!)
	public Module(Assessment assessment1, Assessment assessment2, 
			       Assessment assessment3) {
		this.assessment1 = assessment1;
		this.assessment2 = assessment2;
		this.assessment3 = assessment3;
	   }
	//all the maths cals of  tge average thing
	public double calculateAverage() {
		return assessment1.getMark() * 0.2 +
			   assessment2.getMark() * 0.2 +
			   assessment3.getMark() * 0.6;
	   }
	@Override
	public String toString() {
		return MODULE_NAME + " ("
				+ String.format("%.1f", calculateAverage()) + "%)";
	}
}
