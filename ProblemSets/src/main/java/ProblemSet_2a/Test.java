package ProblemSet_2a;

public class Test {
  public static void main(String[] args) {
	  //Creating a student object using the constructor we maid earlier
	  Student student1= new Student("Mannat", "Chauhan", 17);
        //now displaying values
	  System.out.println("Fullname:" +student1.getFullname());
	  System.out.println("Age:" +student1.getAge());
  }
}
