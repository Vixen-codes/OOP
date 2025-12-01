package ProblemSet_9b;

public interface IGuest {
    void AddCharge(Service s, double c);
    double calculateTotalChargeWithoutVAT();
    double calculateTotalChargeIncVAT();
    double calculateVATChargeATRATE(VATRate r);
    String toString();
}
