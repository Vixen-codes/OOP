package ProblemSet_3b;

public class Test {
    public static void main(String[] args) {
        System.out.println("My role within is: Student");
        AnnualSalary annualSalary = new AnnualSalary(13579.0);
        System.out.println("Salary: " + annualSalary.getSalary());
        double tax = annualSalary.calculateTax();
        System.out.println("Calculated tax: " + tax);
    }
}
