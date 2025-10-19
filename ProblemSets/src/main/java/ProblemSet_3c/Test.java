package ProblemSet_3c;

public class Test {
    public static void main(String[]args) {
    	AnnualSalary salary = new AnnualSalary(45000.0);
    	Position position = new Position("Systems engineer");
    	Employee employee = new Employee(217, "Mannat", "Chauhan",
    			salary, position);
    	System.out.println("Employee Name: ");
    	employee.displayEmployeeName();
    	System.out.println("Eligible for bonus:" 
    	+ employee.eligibleForBonus());
    	System.out.println(employee.toString());
    }
}
