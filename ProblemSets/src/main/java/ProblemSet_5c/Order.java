package ProblemSet_5c;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Pizza> pizzas;

    // Parameterized constructor
    public Order(Customer customer) {
        this.customer = customer;
        this.pizzas = new ArrayList<>();
    }

    // Add pizza method
    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    // Calculate total method
    public double calculateTotal() {
        double total = 0.0;

        for (Pizza pizza : this.pizzas) {
            total += pizza.calculateCost();
        }

        return total;
    }

    // Print receipt method
    public String printReceipt() {
        return "Customer: " + customer.toString() + "\n"
               + "Number of Pizzas: " + pizzas.size() + "\n"
               + "Total Cost: " + String.format("%.2f", calculateTotal());
    }

    // Method to get the number of pizzas
    public int howManyPizzasInOrder() {
        return pizzas.size();
    }
}
