package ProblemSet_6a;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class SupplierTest {

    @Test
    public void testSupplierInvalid() {
	try {
	    new Supplier("Bloggs", "1483681234");
	    fail("Expected IllegalArgumentException was not thrown");
	} catch (IllegalArgumentException e) {
	}
    }

    @Test
    public void testSupplierValid() {
	Supplier supplier = new Supplier("Bloggs", "01483681234");

	assertEquals("Bloggs", supplier.getName());
	assertEquals("01483681234", supplier.getPhone());
    }
}
