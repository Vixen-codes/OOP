package ProblemSet_3b;

public class AnnualSalary {
    // Attributes
    private double salary;
    private final double Personal_Allowance = 12570.0;

    private final double personalAllowance = 12570.0;
    private final double basicRateLimit = 50270.0;
    private final double higherRateLimit = 125140.0;
    private final double basicRate = 0.20;
    private final double higherRate = 0.40;
    private final double additionalRate = 0.45;
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
        double taxableIncome = salary - Personal_Allowance;
        if (taxableIncome <= 0) {
            return 0.0;
        }
        double tax = 0.0;
        if (taxableIncome <= (basicRateLimit - Personal_Allowance)) {
            tax = taxableIncome * basicRate;
        } else if (taxableIncome <= (higherRateLimit - Personal_Allowance)) {
            tax = (basicRateLimit - Personal_Allowance) * basicRate
                   + (taxableIncome - (basicRateLimit - Personal_Allowance))
                   * higherRate;
        } else {
            tax = (basicRateLimit - Personal_Allowance) * basicRate               + (higherRateLimit - basicRateLimit) * higherRate 
                  + (taxableIncome - (higherRateLimit - Personal_Allowance))                  * Additional_Rate;
        }
          return tax;
    }
}
