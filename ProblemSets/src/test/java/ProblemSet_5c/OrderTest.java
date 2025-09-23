package ProblemSet_5c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Order" class.
 *
 * @author Stella Kazamia
 */
public class OrderTest {

    Customer customer = new Customer("Joe", "Bloggs");
    Order order = new Order(customer);

    @Test
    public void testOrder() {
	assertEquals(0, order.calculateTotal(), 0);
    }

    @Test
    public void testAddPizza() {
	Pizza pizza = new Pizza();
	String[] toppings = new String[] { "mozzarella", "basil", "tomato" };
	pizza.addToppings(toppings);
	order.addPizza(pizza);
	assertEquals(10.99, order.calculateTotal(), 0);

    }

    @Test
    public void testCalculateTotal() {
	Pizza pizza = new Pizza();
	String[] toppings = new String[] { "mozzarella", "basil", "tomato" };
	pizza.addToppings(toppings);

	Pizza pizza2 = new Pizza();
	String[] toppings2 = new String[] { "chicken", "peppers", "tomato", "corn", "bacon", "chilli" };
	pizza2.addToppings(toppings2);

	order.addPizza(pizza);
	order.addPizza(pizza2);

	assertEquals(23.98, order.calculateTotal(), 0);
    }

    @Test
    public void testPrintReceipt() {
	Pizza pizza = new Pizza();
	String[] toppings = new String[] { "mozzarella", "basil", "tomato" };
	pizza.addToppings(toppings);

	Pizza pizza2 = new Pizza();
	String[] toppings2 = new String[] { "chicken", "peppers", "tomato", "corn", "bacon", "chilli" };
	pizza2.addToppings(toppings2);

	order.addPizza(pizza);
	order.addPizza(pizza);
	order.addPizza(pizza2);

	assertEquals("Customer: J. Bloggs\n" + "Number of Pizzas: 3\n" + "Total Cost: 34.97", order.printReceipt());
    }

    @Test
    public void testMultiplePizzas() {
	Pizza pizza = new Pizza();
	String[] toppings = new String[] { "bacon", "bell pepper", "sweetcorn", "cheese", "pepperoni", "tomato",
		"onion", "ham", "mushroom" };
	pizza.addToppings(toppings);
	order.addPizza(pizza);
	assertEquals(15.99, order.calculateTotal(), 0);

    }

    @Test
    public void testCalculateMultiplePizzas() {
	Pizza pizza = new Pizza();
	String[] toppings = new String[] { "mozzarella", "basil", "tomato" };
	pizza.addToppings(toppings);

	Pizza pizza2 = new Pizza();
	String[] toppings2 = new String[] { "chicken", "peppers", "tomato", "corn", "bacon", "chilli" };
	pizza2.addToppings(toppings2);

	Pizza pizza3 = new Pizza();
	String[] toppings3 = new String[] { "bacon", "bell pepper", "sweetcorn", "cheese", "pepperoni", "tomato",
		"onion", "ham", "mushroom" };
	pizza3.addToppings(toppings3);

	order.addPizza(pizza);
	order.addPizza(pizza2);
	order.addPizza(pizza3);

	assertEquals(39.97, order.calculateTotal(), 0);
    }

    @Test
    public void testPrintPizzas() {
	customer = new Customer("Maria", "Zaid");
	order = new Order(customer);

	Pizza pizza = new Pizza();
	String[] toppings = new String[] { "mozzarella", "basil", "tomato" };
	pizza.addToppings(toppings);

	Pizza pizza2 = new Pizza();
	String[] toppings2 = new String[] { "meatballs", "peppers", "tomato", "sweetcorn", "bacon", "chilli" };
	pizza2.addToppings(toppings2);

	order.addPizza(pizza);
	order.addPizza(pizza);
	order.addPizza(pizza2);
	order.addPizza(pizza2);

	assertEquals("Customer: M. Zaid\n" + "Number of Pizzas: 4\n" + "Total Cost: 47.96", order.printReceipt());
    }
}
