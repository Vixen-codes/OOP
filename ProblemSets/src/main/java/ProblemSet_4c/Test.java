package ProblemSet_4c;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student student = new Student('J', "Doe");
    		student.setModules(0, "COM1025", 70.0);
    		student.setModules(1, "COM1026", 85.0);
    		student.setModules(2, "COM1027", 68.0);
    		student.setModules(3, "COM1031", 85.0);
    		student.setModules(4, "COM1028", 70.0);
    		student.setModules(5, "COM1029", 80.0);
    		student.setModules(6, "COM1032", 60.0);
    		student.setModules(7, "COM1033", 77.0);
    		System.out.println(student.displayArray());
	}

}
