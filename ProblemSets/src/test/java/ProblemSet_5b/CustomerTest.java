package ProblemSet_5b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Customer" class.
 *
 * @author Stella Kazamia
 */
public class CustomerTest {

    Customer customer = new Customer("Bob", "Ross");

    @Test
    public void testCustomerConstruction() {
        assertEquals('B', customer.getName());
        assertEquals("Ross", customer.getSurname());
    }

    @Test
    public void testtoString() {
        customer = new Customer("Maria", "Zaid");
        assertEquals("M. Zaid", customer.toString());
    }

    @Test
    public void testNewtoString() {
        customer = new Customer("Shujun", "Li");
        assertEquals('S', customer.getName());
        assertEquals("Li", customer.getSurname());
    }

}
