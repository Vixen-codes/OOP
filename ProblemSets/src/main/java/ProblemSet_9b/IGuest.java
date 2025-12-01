package ProblemSet_9b;

public interface IGuest {
    void addCharge(Service s, double c);
    double calculateTotalChargeWithoutVAT();
    double calculateTotalChargeIncVAT();
    double calculateVATChargeATRATE(VATRate r);
    String toString();
}
