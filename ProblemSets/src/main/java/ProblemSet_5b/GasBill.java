package ProblemSet_5b;

public class GasBill {
    private String accountNumber;
    private double amount;
    private Customer customer;

    public GasBill(String accountNumber, double amount, Customer customer) {
        this.customer = customer;
        this.amount = amount;

        if (checkAccountAccuracy(accountNumber)) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = "Invalid Account";
        }
    }

    public boolean checkAccountAccuracy(String accountNumber) {
        return accountNumber.matches("^G\\d{4}-\\d{4}-\\d{4}$");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomer() {
        return customer.toString();
    }

    public String displayAmountDue() {
        return String.format("£%.2f", amount);
    }

    public String displayAccountDetails() {
        return "Gas Bill\n" +
               " Account Number:" + accountNumber + "\n" +
               " Customer:" + getCustomer() + "\n" +
               " Amount due:" + displayAmountDue();
    }
}
