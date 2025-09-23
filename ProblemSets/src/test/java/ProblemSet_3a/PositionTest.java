package ProblemSet_3a;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Position" class.
 *
 * @author Stella Kazamia
 */

public class PositionTest {

	/**
	 * Test accessors and mutators for a job role.
	 */
	@Test
	public void testAccessorsMutators() {
		// Create a job companyPosition object.
		Position companyPosition = new Position();

		// Test setting and getting the company position.
		companyPosition.setRoleName("Senior Lecturer");
		assertEquals("Senior Lecturer", companyPosition.getRoleName());

	}

}
