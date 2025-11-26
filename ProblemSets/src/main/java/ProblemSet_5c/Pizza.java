package ProblemSet_5c;

public class Pizza {
    private String[] toppings;
    // Default constructor
    public Pizza() {
        this.toppings = new String[10];
    } 
    // Add toppings method
    public void addToppings(String[] toppings) {
        // Reset the array first
        this.toppings = new String[10];
        // Copy toppings, ensuring we don't exceed the limit of 10
        if (toppings != null) {
            for (int i = 0; i < toppings.length && i < 10; i++) {
                this.toppings[i] = toppings[i];
            }
        }
    }
    // Print toppings method
    public String printToppings() {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < this.toppings.length; i++) {
            if (this.toppings[i] != null) {
                if (!first) {
                    result.append(",");
                }
                result.append(this.toppings[i]);
                first = false;
            }
        }
        return result.toString();
    }
    // Calculate cost method
    public double calculateCost() {
        int count = 0;
        // Count non-null toppings
        for (int i = 0; i < this.toppings.length; i++) {
            if (this.toppings[i] != null) {
                count++;
            }
        }
        // Calculate cost based on number of toppings
        switch (count) {
            case 0:
                return 0.00;
            case 1:
                return 9.99;
            case 2:
            case 3:
                return 10.99;
            case 4:
            case 5:
                return 11.99;
            case 6:
                return 12.99;
            case 7:
                return 13.99;
            case 8:
                return 14.99;
            case 9:
                return 15.99;
            case 10:
                return 14.99; // special offer
            default:
                return 0.00;
        }
    }
}