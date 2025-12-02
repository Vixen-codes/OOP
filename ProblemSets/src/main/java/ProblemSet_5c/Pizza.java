package ProblemSet_5c;

public class Pizza {
    private String[] toppings;
    public Pizza() {
        this.toppings = new String[10];
    }
    public void addToppings(String[] toppings) {
        this.toppings = new String[10];
        if (toppings != null) {
            for (int i = 0; i < toppings.length && i < 10; i++) {
                this.toppings[i] = toppings[i];
            }
        }
    }
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
    public double calculateCost() {
        int count = 0;
        for (int i = 0; i < this.toppings.length; i++) {
            if (this.toppings[i] != null) {
                count++;
            }
        }
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
