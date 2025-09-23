package ProblemSet_5c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Pizza" class.
 *
 * @author Stella Kazamia
 */
public class PizzaTest {

    Pizza pizza = new Pizza();

    @Test
    public void testPizzaConstruction() {
	assertEquals(0, pizza.calculateCost(), 0);
    }

    @Test
    public void testCalculatePizzaCost() {
	String[] toppings = new String[] { "cheese", "pepperoni", "tomato" };
	pizza.addToppings(toppings);
	assertEquals(10.99, pizza.calculateCost(), 0);
	// reset
	toppings = new String[] { "mushroom" };
	pizza.addToppings(toppings);
	assertEquals(9.99, pizza.calculateCost(), 0);

    }

    @Test
    public void testPrintPizza() {
	String[] toppings = new String[] { "cheese", "pepperoni", "tomato" };
	pizza.addToppings(toppings);
	assertEquals("cheese,pepperoni,tomato", pizza.printToppings());
    }

    @Test
    public void testCalculateExpensive() {
	String[] toppings = new String[] { "bacon", "bell pepper", "sweetcorn", "cheese", "pepperoni", "tomato",
		"onion", "ham", "mushroom" };
	pizza.addToppings(toppings);
	assertEquals(15.99, pizza.calculateCost(), 0);
    }

    @Test
    public void testPrintExpensive() {
	String[] toppings = new String[] { "vegal basil pesto", "olive", "tomato", "artichoke", "red onion", "mushroom",
		"bell pepper", "spinach", "roasted broccolini" };
	pizza.addToppings(toppings);
	assertEquals(
		"vegal basil pesto,olive,tomato,artichoke,red onion,mushroom,bell pepper,spinach,roasted broccolini",
		pizza.printToppings());
    }

    @Test
    public void testPrintExpensivePizza() {
	String[] toppings = new String[] { "olive", "tomato", "artichoke", "red onion", "mushroom", "bell pepper",
		"spinach", "roasted broccolini" };
	pizza.addToppings(toppings);
	assertEquals(14.99, pizza.calculateCost(), 0);
    }
}
