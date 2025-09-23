package ProblemSet_2a;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Student" class.
 *
 * @author Stella Kazamia
 */
public class StudentTest {
    @Test
    public void testStudentOne() {
        Student bob = new Student("Bob", "Ross", 60);
        assertEquals("Bob Ross", bob.getFullname());
    }

    @Test
    public void testStudentTwo() {
        Student bob = new Student("Bob", "Ross", 60);
        bob.setForename("Alice");
        bob.setSurname("Wonderland");
        assertEquals("Alice Wonderland", bob.getFullname());
    }
    
    @Test
    public void testStudentThree() {
        Student maria = new Student("Maria", "Zaid", 18);
        maria.setAge(20);
        assertEquals(20, maria.getAge());
    }
}
