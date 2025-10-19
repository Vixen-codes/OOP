package ProblemSet_2c;

public class Assessment {
     private String name;
     private double mark;
   //constructor
   public Assessment(String name, double mark) {
	   this.name = name;
	   this.mark = mark;
   }
   public String getName() {
	return name;
   }
  public void setName(String name) {
	this.name = name;
   }
  public double getMark() {
	return mark;
   }
  public void setMark(double mark) {
	this.mark = mark;
   }
}
