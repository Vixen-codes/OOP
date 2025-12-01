package ProblemSet_9c;

public interface IGuest {
    void addCharge(Service s, double c);
    double calculateTotalChargeWithoutVAT();
    double calculateTotalChargeIncVat();
    double calculateVATChargeAtRate(VATRate r);
    String toString();
}
