package ProblemSet_3b;

public class AnnualSalary {
    // Attributes
    private double salary;
    private final double Personal_Allowance = 12570.0;

    private final double Basic_Rate_Limit = 50270.0;
    private final double Higher_Rate_Limit = 125140.0;
    private final double Basic_Rate = 0.20;
    private final double Higher_Rate = 0.40;
    private final double Additional_Rate = 0.45;
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
        if (taxableIncome <= (Basic_Rate_Limit - Personal_Allowance)) {
            tax = taxableIncome * Basic_Rate;
        } else if (taxableIncome <= (Higher_Rate_Limit - Personal_Allowance)) {
            tax = (Basic_Rate_Limit - Personal_Allowance) * Basic_Rate 
                   + (taxableIncome - (Basic_Rate_Limit - Personal_Allowance)) 
                   * Higher_Rate;
        } else {
            tax = (Basic_Rate_Limit - Personal_Allowance) * Basic_Rate 
                    + (Higher_Rate_Limit - Basic_Rate_Limit) * Higher_Rate 
                  + (taxableIncome - (Higher_Rate_Limit - Personal_Allowance)) 
                  * Additional_Rate;
        }
        return tax;
    }
}
