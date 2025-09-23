package ProblemSet_8b;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CountingTest {

    Counting c = null;

    @Test
    public void testCountConstruction() {
	c = new Counting();
	assertEquals(
		"the cat sat on the mat : 1\n" + "the sat mat on the cat : 2\n" + "the mat cat on the sat : 3\n" + "",
		c.readTextFile("words.txt"));

    }

    @Test
    public void testCountConstruction2() {
	c = new Counting();
	assertEquals(
		"Joe Bloggs 18 : 1\nSid James 54 : 2\nBobby Ewing 93 : 3\nIncredible Hulk 65 : 4\nBart Simpson 18 : 5\nStella Kazamia 40 : 6\nZhenhua Feng 38 : 7\n"
			+ "Bob Ross 25 : 8\nAlice Wonderland 31 : 9\n",
		c.readTextFile("party.txt"));

    }

    @Test
    public void testInvalidConstruction() {
	try {
	    c = new Counting();
	    assertEquals("", c.readTextFile(null));
	    fail("Expected NullPointerException was not thrown");
	} catch (NullPointerException e) {
	}
    }

}
