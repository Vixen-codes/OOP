package ProblemSet_2c;

public class Test {
    public static void main(String[] args) {
    	Assessment lab1 = new Assessment("Lab1", 90.0);
    	Assessment lab2 = new Assessment("Lab2", 68.0);
    	Assessment coursework = new Assessment("Coursework", 72.0);
    	
        Module module = new Module(lab1, lab2, coursework);
        System.out.println(module.toString());
    }
}
