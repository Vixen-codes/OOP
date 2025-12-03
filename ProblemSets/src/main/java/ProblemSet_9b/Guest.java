package ProblemSet_9b;

import java.util.ArrayList;
import java.util.List;

public class Guest {
	//for guest's surname
  private String surname;
  //for guest's forenanme
  private String forename;
  //for address
  private String address;
  //for telephone
  private String telephone;
  //for all charges by the guest
  private List<Charge> charges;
  //constructor (parameterised)
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
   //when the guest uses and different and new service the charge is added
    public void addCharge(Service s, double c) {
	   Charge charge = newCharge(s, c);
	   charges.add(charge);
   }
    //makes and returns new charge object
   private Charge newCharge(Service s, double c) {
		return new Charge(s, c);
	}
   //calcs the total charge excluding VAT
   public double calculateTotalChargeWithoutVAT() {
	   double total = 0.0;
	   for (Charge charge : charges) {
		   total += charge.getCharge();
	   }
	   return total;
   }
   //same as the last one just now includes the vat
   public double calculateTotalChargeIncVat() {
	   double total = 0.0;
	   for (Charge charge : charges) {
		   total += charge.getCharge() + charge.calculateVAT();
	   }
	   return total;
   }
   //cals total VAT charged to the specific rate
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
