package ProblemSet_5c;
import java.util.ArrayList;
public class Order {
   private Customer customer;
   private ArrayList<Pizza> pizzas;
   
   public Order(Customer customer) {
	   this.customer = customer;
	   pizzas= new ArrayList<>();
   }
   public void addPizza(Pizza pizza) {
	   pizzas.add(pizza);
	  }
   
   public double calculateTotal() {
	   double total = 0;
	   for (Pizza p : pizzas) {
		   total += p.getCost();
	   }
	   return total;
   }
   
   public String printReceipt() {
	   return "customer: " + customer.toString()
	          + "\nNumber of Pizzas: " + pizzas.size()
	          + "\nTotal Cost:" + String.format("%.2f", calculateTotal());
   }
}
