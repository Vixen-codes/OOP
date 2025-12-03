package ProblemSet_4b;

public class Student {
     private char initial;
     private String surname;
     //constructor
     public Student(char initial, String surname) {
    	 this.initial = initial;
    	 this.surname = surname;
     }
     //method to get student details.....
     public String getStudentDetails() {
    	 return initial + ". " + surname;
     }
}
