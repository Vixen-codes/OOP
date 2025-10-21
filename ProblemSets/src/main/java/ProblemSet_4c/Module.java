package ProblemSet_4c;

public class Module {
	private String code;
	private double average;

  public Module(String code, double average) {
	  this.code = code;
	  this.average = average;
  }
  public String getStudentDetails() {
	  return code + ": " + average;
  }
  public double getAverage() {
	  return average;
  }
  public void setAverage(double average) {
	  this.average = average;
  }
  public String getCode() {
	return code;
  }
  public void setCode(String code) {
	this.code = code;
  }
  @Override
  public String toString() {
      return code + ": " + average;
  }
}
