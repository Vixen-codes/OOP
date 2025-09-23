package ProblemSet_1a;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "HelloWorld" class.
 *
 * @author Stella Kazamia
 */
public class HelloTest {

    @Test
    public void testHello() {
	HelloWorld hello = new HelloWorld("Hello World");
	assertEquals("Hello World", hello.display());
    }

    @Test
    public void testName() {
	HelloWorld name = new HelloWorld("My name is Stella");
	assertEquals("My name is Stella", name.display());
    }
}
