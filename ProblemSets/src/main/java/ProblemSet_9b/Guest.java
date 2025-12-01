package ProblemSet_9b;

import java.util.ArrayList;
import java.util.List;

public class Guest {
  private String surname;
  private String forename;
  private String address;
  private String telephone;
  private List<Charge> charges;
  public Guest(String forename, String surname,
		  String address, String telephone) {
	  this.surname = surname;
	  this.forename = forename;
	  this.address = address;
	  this.telephone = telephone;
	  this.charges = new ArrayList<>();
  }
   public String getSurname() {
	   return surname;
   }
   public String getForename() {
	   return forename;
   }
   public String getAddress() {
      return address;
}
   public String getTelephone() {
	   return telephone;
   }
   public List<Charge> getCharges() {
	   return charges;
   }
    public void addCharge(Service s, double c) {
	   Charge charge = newCharge(s, c);
	   charges.add(charge);
   }
   private Charge newCharge(Service s, double c) {
		return new Charge(s, c);
	}
   public double calculateTotalChargeWithoutVAT() {
	   double total = 0.0;
	   for (Charge charge : charges) {
		   total += charge.getCharge();
	   }
	   return total;
   }
   public double calculateTotalChargeIncVat() {
	   double total = 0.0;
	   for (Charge charge : charges) {
		   total += charge.getCharge() + charge.calculateVAT();
	   }
	   return total;
   }
   public double calculateVATChargeAtRate(VATRate r) {
	   double totalVAT = 0.0;
	   for (Charge charge : charges) {
		   if (charge.getService().getRate() == r) {
			   totalVAT += charge.calculateVAT();
		   }
	   }
	   return totalVAT;
   }
   @Override
   public String toString() {
	   return forename + " " + surname + ", " + address + ", " + telephone;
   }
   }
