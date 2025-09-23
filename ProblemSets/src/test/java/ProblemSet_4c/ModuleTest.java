package ProblemSet_4c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Module" class.
 *
 * @author Stella Kazamia
 */
public class ModuleTest {

    @Test
    public void testModuleFour() {
        Module com1027 = new Module("COM1028", 90);
        assertEquals(90, com1027.getAverage());
    }

    @Test
    public void testModuleOne() {
        Module com1027 = new Module("COM1027", 60);
        assertEquals("COM1027", com1027.getCode());
    }

}
