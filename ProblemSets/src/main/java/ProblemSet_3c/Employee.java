package ProblemSet_3c;

public class Employee {
    private int id;
    private String forename;
    private String surname;
    private AnnualSalary salary;
    private Position companyPosition;
   //constructor
   public Employee (int id, String forename, String surname
		   , AnnualSalary salary, Position companyPosition) {
	   this.id = id;
	   this.forename = forename;
	   this.surname = surname;
	   this.salary = salary;
	   this.companyPosition = companyPosition;
   }
   public int getId() {
	return id;
   }
   public void setId(int id) {
	this.id = id;
   }
   public String getForename() {
	return forename;
   }
   public void setForename(String forename) {
	this.forename = forename;
   }
   public String getSurname() {
	return surname;
   }
   public void setSurname(String surname) {
	this.surname = surname;
   }
   public AnnualSalary getSalary() {
	return salary;
   }
   public void setSalary(AnnualSalary salary) {
	this.salary = salary;
   }
   public Position getCompanyPosition() {
	return companyPosition;
   }
   public void setCompanyPosition(Position companyPosition) {
	this.companyPosition = companyPosition;
   }
   //displaying the employeee name
   public void displayEmployeeName() {
	   System.out.println(forename + " " + surname);
   }
   //to check if the person is not too rich for a bonus
   //Ps: nobody is that rich, everyone loves a little bonus
   //its boolean too
   public boolean eligibleForBonus() {
	   return salary.getSalary() > 40000.0;
   }
   @Override
   public String toString() {
	String bonusStatus = eligibleForBonus() ? "is eligible for bonus"
			: "is not eligible for bonus";
	return surname + ", " + forename + " (" + id + "): "
			+ companyPosition.getRoleName() +
            " at £" + String.format("%.1f", salary.getSalary())
            + " (£" + String.format("%.1f", salary.calculateTax()) + " tax) and "
            + bonusStatus;
   }
} 
