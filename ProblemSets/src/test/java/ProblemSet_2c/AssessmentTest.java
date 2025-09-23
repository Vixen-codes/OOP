/**
 * ModuleTest.java
 */

package ProblemSet_2c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Assessment" class.
 *
 * @author Stella Kazamia
 */
public class AssessmentTest {

    /**
     * Main entry point for the "Module/Assessment" exercise.
     *
     */
    @Test
    public void testAssessmentOne() {
	Assessment classTest = new Assessment("Class Test", 45.0);
	assertEquals("Class Test", classTest.getName());
    }

    @Test
    public void testAssessmentTwo() {
	Assessment assignment = new Assessment("Assignment (Report)", 68.0);
	assertEquals("Assignment (Report)", assignment.getName());
	assertEquals(68, assignment.getMark(), 0);
    }

}
