package ProblemSet_9a;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    public void testInvalidCase() {
	try {
	    new Service("news35652", "News", VATRate.STANDARD);

	    fail("Expected IllegalArgumentException was not thrown");
	} catch (IllegalArgumentException e) {
	}
    }

    @Test
    public void testInvalidCodeNull() {

	try {
	    new Service(null, "Room", VATRate.STANDARD);

	    fail("Expected NullPointerException was not thrown");
	} catch (NullPointerException e) {
	}
    }

    @Test
    public void testInvalidNameNull() {
	try {
	    new Service("ROOM1234", null, VATRate.STANDARD);

	    fail("Expected NullPointerException was not thrown");
	} catch (NullPointerException e) {
	}
    }

    @Test
    public void testInvalidNumCharacter() {
	try {
	    new Service("DRIN356", "Drinks", VATRate.STANDARD);

	    fail("Expected IllegalArgumentException was not thrown");
	} catch (IllegalArgumentException e) {
	}
    }

    @Test
    public void testValid() {
	Service service = new Service("ROOM12345", "Room", VATRate.STANDARD);

	assertEquals("ROOM12345", service.getCode());
	assertEquals("Room", service.getName());
	assertEquals(VATRate.STANDARD, service.getRate());
    }

}
