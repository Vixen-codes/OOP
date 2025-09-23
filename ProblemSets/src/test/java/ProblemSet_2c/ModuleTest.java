/**
 * ModuleTest.java
 */

package ProblemSet_2c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Module" class.
 *
 * @author Stella Kazamia
 */
public class ModuleTest {

    @Test
    public void testAverage() {
	// Create a 'complex' module object called COM1027
	Module COM1027 = new Module(new Assessment("Labs1", 70.5), new Assessment("Labs2", 60.5),
		new Assessment("Coursework", 45.5));
	assertEquals(53.5, COM1027.calculateAverage(), 0);
    }

    /**
     * Main entry point for the "Module/Assessment" exercise.
     *
     */
    @Test
    public void testDisplayAverage() {
	// Create a 'complex' module object called COM1027
	Module COM1027 = new Module(new Assessment("Labs1", 80.0), new Assessment("Labs2", 70.0),
		new Assessment("Coursework", 70));
	assertEquals("COM1027 (72.0%)", COM1027.toString());
    }

    @Test
    public void testDisplayHighAverage() {
	// Create a 'complex' module object called COM1027
	Module COM1027 = new Module(new Assessment("Labs1", 90.0), new Assessment("Labs2", 100.0),
		new Assessment("Coursework", 95.0));
	assertEquals("COM1027 (95.0%)", COM1027.toString());
    }

    @Test
    public void testDisplayLowAverage() {
	// Create a 'complex' module object called COM1027
	Module COM1027 = new Module(new Assessment("Labs1", 50.0), new Assessment("Labs2", 50.0),
		new Assessment("Coursework", 30.0));
	assertEquals("COM1027 (38.0%)", COM1027.toString());
    }

    @Test
    public void testHighAverage() {
	// Create a 'complex' module object called COM1027
	Module COM1027 = new Module(new Assessment("Labs1", 85.0), new Assessment("Labs2", 90.0),
		new Assessment("Coursework", 70));
	assertEquals(77.0, COM1027.calculateAverage(), 0);
    }

    @Test
    public void testLowAverage() {
	// Create a 'complex' module object called COM1027
	Module COM1027 = new Module(new Assessment("Labs1", 50.0), new Assessment("Labs2", 50.0),
		new Assessment("Coursework", 30.0));
	assertEquals(38.0, COM1027.calculateAverage(), 0);
    }

    @Test
    public void testValues() {
	// Create an assessment object called labs
	Assessment labs = new Assessment("Labs", 92.5);
	assertEquals(92.5, labs.getMark(), 0);
	assertEquals("Labs", labs.getName());
    }

}
