package ProblemSet_4c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Student" class.
 *
 * @author Stella Kazamia
 */
public class StudentTest {

    @Test
    public void testEnterAllNewValues() {
	Student alice = new Student('A', "Wonderland");
	alice.setModules(0, "COM1025", 50);
	alice.setModules(1, "COM1026", 65);
	alice.setModules(2, "COM1027", 68);
	alice.setModules(3, "COM1031", 55);
	alice.setModules(4, "COM1028", 40);
	alice.setModules(5, "COM1029", 40);
	alice.setModules(6, "COM1032", 70);
	alice.setModules(7, "COM1033", 67);
	assertEquals(
		"COM1025: 50.0\n" + "COM1026: 65.0\n" + "COM1027: 68.0\n" + "COM1031: 55.0\n" + "COM1028: 40.0\n"
			+ "COM1029: 40.0\n" + "COM1032: 70.0\n" + "COM1033: 67.0\n" + "Year Average: 56%",
		alice.displayArray());

    }

    @Test
    public void testEnterNewValues() {
	Student bob = new Student('B', "Ross");
	bob.setModules(0, "COM1025", 40);
	bob.setModules(1, "COM1026", 55);
	bob.setModules(2, "COM1027", 67);
	bob.setModules(3, "COM1031", 85);
	bob.setModules(4, "COM1028", 60);
	bob.setModules(5, "COM1029", 70);
	bob.setModules(6, "COM1032", 60);
	bob.setModules(7, "COM1033", 57);
	assertEquals(
		"COM1025: 40.0\n" + "COM1026: 55.0\n" + "COM1027: 67.0\n" + "COM1031: 85.0\n" + "COM1028: 60.0\n"
			+ "COM1029: 70.0\n" + "COM1032: 60.0\n" + "COM1033: 57.0\n" + "Year Average: 61%",
		bob.displayArray());
    }

    @Test
    public void testGetter() {
	Student joe = new Student('J', "Bloggs");
	joe.setModules(2, "COM1027", 85);
	String testModule = new Module("COM1027", 85).toString();
	assertEquals(testModule, joe.getModules(2).toString());
    }

    @Test
    public void testHighAverage() {
	Student shujun = new Student('S', "Li");
	shujun.setModules(0, "COM1025", 70);
	shujun.setModules(1, "COM1026", 85);
	shujun.setModules(2, "COM1027", 68);
	shujun.setModules(3, "COM1031", 85);
	shujun.setModules(4, "COM1028", 70);
	shujun.setModules(5, "COM1029", 80);
	shujun.setModules(6, "COM1032", 60);
	shujun.setModules(7, "COM1033", 77);
	assertEquals(74, shujun.calculateYearAverage(), 0);

    }

    @Test
    public void testLowAverage() {
	Student maria = new Student('M', "Zaid");
	maria.setModules(0, "COM1025", 40);
	maria.setModules(1, "COM1026", 45);
	maria.setModules(2, "COM1027", 48);
	maria.setModules(3, "COM1031", 45);
	maria.setModules(4, "COM1028", 40);
	maria.setModules(5, "COM1029", 40);
	maria.setModules(6, "COM1032", 40);
	maria.setModules(7, "COM1033", 47);
	assertEquals(43, maria.calculateYearAverage(), 0);
    }

    @Test
    public void testObject() {
	Student anthony = new Student('A', "Hobbs");

	anthony.setModules(1, "COM1026", 68);
	assertEquals(68, anthony.getModules(1).getAverage(), 0);
	assertEquals("COM1026", anthony.getModules(1).getCode());
    }

    @Test
    public void testSetter() {
	Student joe = new Student('J', "Bloggs");
	joe.setModules(0, "COM1025", 70);
	String testModule = new Module("COM1025", 70).toString();
	assertEquals(testModule, joe.getModules(0).toString());
    }

    @Test
    public void testStudentOne() {
	Student bob = new Student('B', "Ross");
	Module emptyModule = new Module("empty", 0);
	bob.setModules(0, emptyModule.getCode(), emptyModule.getAverage());
	bob.setModules(1, emptyModule.getCode(), emptyModule.getAverage());
	bob.setModules(2, emptyModule.getCode(), emptyModule.getAverage());
	bob.setModules(3, emptyModule.getCode(), emptyModule.getAverage());
	bob.setModules(4, emptyModule.getCode(), emptyModule.getAverage());
	bob.setModules(5, emptyModule.getCode(), emptyModule.getAverage());
	bob.setModules(6, emptyModule.getCode(), emptyModule.getAverage());
	bob.setModules(7, emptyModule.getCode(), emptyModule.getAverage());
	assertEquals("B. Ross 0%", bob.getStudentDetails());
    }

    @Test
    public void testStudentTwo() {
	Student alice = new Student('A', "Wonderland");
	alice.setModules(0, "COM1025", 60);
	alice.setModules(1, "COM1026", 85);
	alice.setModules(2, "COM1027", 78);
	alice.setModules(3, "COM1031", 65);
	alice.setModules(4, "COM1028", 40);
	alice.setModules(5, "COM1029", 40);
	alice.setModules(6, "COM1032", 50);
	alice.setModules(7, "COM1033", 57);
	assertEquals("A. Wonderland 59%", alice.getStudentDetails());
    }

}
