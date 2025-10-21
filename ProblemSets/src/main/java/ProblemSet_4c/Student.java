package ProblemSet_4c;

public class Student {
   private char initial;
   private String surname;
   private Module[] modules;
   //constructor(paramertised)
  public Student(char initial, String surname) { 
   this.initial = initial;
   this.surname = surname;
   this.modules = new Module[8];
   for (int i = 0; i < 8; i++) {
	   modules[i] = new Module("COM10" + (i + 25), 0.0);
     }
  }
  public int calculateYearAverage() {
	    double total = 0.0;
	    for (Module m : modules) {
	        total += m.getAverage();
	    }
	    return (int) (total / modules.length);
	}
  public String getStudentDetails() {
	    return initial + ". " + surname + " " + calculateYearAverage() + "%";
	}
  //get modules
  public Module getModules(int index) {
	  if (index >= 0 && index < modules.length) {
		  return modules[index];
	  }
	  return null;
  }
  //set modules
  public void setModules(int index, String inCode, double inAverage) {
	  if (index >= 0 && index < modules.length) {
		  modules[index] = new Module(inCode, inAverage);
	  }
  }
  public String displayArray() {
	    String result = "";
	    for (int i = 0; i < modules.length; i++) {
	        result += modules[i].toString() + "\n";
	    }
	    result += "Year Average: " + calculateYearAverage() + "%";
	    return result;
	}
  }

