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
  public String getStudentDetails() {
	  return initial + ". " + surname;
  }
  public void setModules(int index, String inCode, double inAverage) {
	  if (index >= 0 && index < modules.length) {
		  modules[index] = new Module(inCode, inAverage);
	  }
  }
	 public String displayArray() {
		 String result = "";
		 double totalAverage = 0.0;
		 for (int i = 0; i < modules.length; i++) {
				 result = result + modules[i].getStudentDetails()
				 + "\n";
				 totalAverage = totalAverage + modules[i].getAverage();
		    }
		 int yearAverage = (int) (totalAverage / modules.length);
		    result = result + "Year Average: " + yearAverage + "%";
		   return result;
	 }
  }

