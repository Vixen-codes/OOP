package ProblemSet_8c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person = null;

    @Test
    public void testGetAge() {
	person = new Person("Adam", "House", 20);
	assertEquals(20, person.getAge());
    }

    @Test
    public void testGetForename() {
	person = new Person("Alice", "Wonderland", 41);
	assertEquals("Alice", person.getForename());
    }

    @Test
    public void testGetSurname() {
	person = new Person("Bart", "Simpson", 25);
	assertEquals("Simpson", person.getSurname());
    }

    @Test
    public void testPerson() {
	person = new Person("Adam", "Hills", 16);
    }

    @Test
    public void testToString() {
	person = new Person("Hassan", "Khan", 20);
	assertEquals("Hassan Khan (20)", person.toString());
    }

}
