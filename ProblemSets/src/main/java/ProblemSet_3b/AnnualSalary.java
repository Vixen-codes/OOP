package ProblemSet_3b;

public class AnnualSalary {
    // Attributes
    private double salary;
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
        double taxableIncome = salary - personalAllowance;
        if (taxableIncome <= 0) {
            return 0.0;
        }
        double tax = 0.0;
        if (taxableIncome <= (basicRateLimit - personalAllowance)) {
            tax = taxableIncome * basicRate;
        } else if (taxableIncome <= (higherRateLimit - personalAllowance)) {
            tax = (basicRateLimit - personalAllowance) * basicRate
                   + (taxableIncome - (basicRateLimit - personalAllowance))
                   * higherRate;
        } else {
            tax = (basicRateLimit - personalAllowance) * basicRate 
            		+ (higherRateLimit - basicRateLimit) * higherRate 
                  + (taxableIncome - 
                		  (higherRateLimit - personalAllowance)) 
                  * additionalRate;
       }
        return tax;
    }
}
