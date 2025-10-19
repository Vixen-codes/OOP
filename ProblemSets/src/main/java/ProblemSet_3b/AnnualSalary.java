package ProblemSet_3b;

public class AnnualSalary {
    // Attributes
    private double salary;
    private final double PERSONAL_ALLOWANCE = 12570.0;

    private final double BASIC_RATE_LIMIT = 50270.0;
    private final double HIGHER_RATE_LIMIT = 125140.0;
    private final double BASIC_RATE = 0.20;
    private final double HIGHER_RATE = 0.40;
    private final double ADDITIONAL_RATE = 0.45;
    //
    public AnnualSalary() {
        this.salary = 0.0;
    }
    public AnnualSalary(double salary) {
        this.salary = salary;
    }
        public double getSalary() {
         return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculateTax() {
        double taxableIncome = salary - PERSONAL_ALLOWANCE;
        if (taxableIncome <= 0) {
            return 0.0;
        }
        double tax = 0.0;
        if (taxableIncome <= (BASIC_RATE_LIMIT - PERSONAL_ALLOWANCE)) {
            tax = taxableIncome * BASIC_RATE;
        } else if (taxableIncome <= (HIGHER_RATE_LIMIT - PERSONAL_ALLOWANCE)) {
            tax = (BASIC_RATE_LIMIT - PERSONAL_ALLOWANCE) * BASIC_RATE +
                    (taxableIncome - (BASIC_RATE_LIMIT - PERSONAL_ALLOWANCE)) * HIGHER_RATE;
        } else {
            tax = (BASIC_RATE_LIMIT - PERSONAL_ALLOWANCE) * BASIC_RATE +
                    (HIGHER_RATE_LIMIT - BASIC_RATE_LIMIT) * HIGHER_RATE +
                    (taxableIncome - (HIGHER_RATE_LIMIT - PERSONAL_ALLOWANCE)) * ADDITIONAL_RATE;
        }
        return tax;
    }
}
