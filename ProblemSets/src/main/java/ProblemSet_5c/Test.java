package ProblemSet_5c;

public class Test {
    public static void main(String[] args) {
    	Customer customer = new Customer("Richie", "Smith");
    	Order order = new Order(customer);
    	Pizza pizza1 = new Pizza();
    	pizza1.addToppings(new String[] {"pepperoni"});
    	Pizza pizza2 = new Pizza();
    	pizza2.addToppings(new String[]{"cheese", "ham"});
    	order.addPizza(pizza2);
    	order.addPizza(pizza1);
    	System.out.println(order.printReceipt());
    }
}
