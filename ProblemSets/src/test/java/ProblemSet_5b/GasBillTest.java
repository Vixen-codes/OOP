package ProblemSet_5b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "GasBill" class.
 *
 * @author Stella Kazamia
 */
public class GasBillTest {

	Customer customer = new Customer("Alice", "Wonderland");
	GasBill bill = new GasBill("G1234-5678-1234", 100, customer);

	@Test
	public void testGasBillConstruction() {
		assertEquals("G1234-5678-1234", bill.getAccountNumber());
		assertEquals("A. Wonderland", bill.getCustomer());
	}

	@Test
	public void testAccountDetails() {
		assertEquals(true, bill.checkAccountAccuracy(bill.getAccountNumber()));
		assertEquals("Gas Bill\n" + " Account Number:G1234-5678-1234\n" + " Customer:A. Wonderland\n"
				+ " Amount due:£100.00", bill.displayAccountDetails());

	}

	@Test
	public void testInvalidAccount() {
		bill = new GasBill("123456781234", 200, customer);
		assertEquals(false, bill.checkAccountAccuracy(bill.getAccountNumber()));
		assertEquals("Gas Bill\n" + " Account Number:Invalid Account\n" + " Customer:A. Wonderland\n"
				+ " Amount due:£200.00", bill.displayAccountDetails());
	}

}
