package ProblemSet_4b;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Classroom classroom1 = new Classroom("Room LTD");
   //summary
   System.out.println(classroom1.getSummary());
   classroom1.addStudents(0, 'M', "Chauhan");
   classroom1.addStudents(1, 'T', "Shelbey");
   classroom1.addStudents(2, 'C', "Twinkle");
   System.out.println(classroom1.getSummary());
   System.out.println("number of students: "
                       + classroom1.howManyStudents());
	}

}
