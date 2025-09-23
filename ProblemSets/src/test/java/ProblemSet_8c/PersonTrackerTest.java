package ProblemSet_8c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTrackerTest {

    PersonTracker pTracker = new PersonTracker();

    @Test
    public void testAddOnePerson() {
	pTracker.addPerson("Mariyah", "Zaid", 20);
	assertEquals("[Mariyah Zaid (20)]", pTracker.getPeopleList());
    }

    @Test
    public void testAddTwoPersonObjects() {
	pTracker.addPerson("Mariyah", "Zaid", 25);
	pTracker.addPerson("Antonio", "Panko", 100);

	assertEquals("Mariyah Zaid (25)\nAntonio Panko (100)\n", pTracker.displayList());
    }

    @Test
    public void testGetterMethod() {
	assertEquals("[]", pTracker.getPeopleList());
    }

    @Test
    public void testReadSecondTextFile() {
	pTracker.readTextFile("party.txt");
	assertEquals("Joe Bloggs (18)\n" + "Sid James (54)\n" + "Bobby Ewing (93)\n" + "Incredible Hulk (65)\n"
		+ "Bart Simpson (18)\n" + "Stella Kazamia (40)\n" + "Zhenhua Feng (38)\n" + "Bob Ross (25)\n"
		+ "Alice Wonderland (31)\n" + "", pTracker.displayList());
    }

    @Test
    public void testReadTextFile() {
	pTracker.readTextFile("names.txt");
	assertEquals("Joe Bloggs (18)\n" + "Sid James (45)\n" + "Bobby Ewing (93)\n" + "Incredible Hulk (65)\n"
		+ "Bart Simpson (13)\n" + "", pTracker.displayList());
    }

    @Test
    public void testTextFileAndList() {
	pTracker.readTextFile("party.txt");
	pTracker.addPerson("Mariyah", "Zaid", 25);
	pTracker.addPerson("Antonio", "Panko", 100);

	assertEquals(
		"Joe Bloggs (18)\nSid James (54)\nBobby Ewing (93)\nIncredible Hulk (65)\nBart Simpson (18)\nStella Kazamia (40)\nZhenhua Feng (38)\nBob Ross (25)\nAlice Wonderland (31)\nMariyah Zaid (25)\nAntonio Panko (100)\n",
		pTracker.displayList());
    }
}
