package ProblemSet_4b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A simple class used to test the "Classroom" class.
 *
 * @author Stella Kazamia
 */
public class ClassroomTest {

	@Test
	public void testConstruction() {
		Classroom lectureTheatre = new Classroom("AP3");
		assertEquals("AP3", lectureTheatre.getRoom());
		assertEquals(20, lectureTheatre.getCapacity());
		assertEquals("No students added", lectureTheatre.getSummary());
	}

	@Test
	public void testAddStudents() {
		Classroom lectureTheatre = new Classroom("01AC01");
		assertEquals("01AC01", lectureTheatre.getRoom());
		assertEquals(20, lectureTheatre.getCapacity());

		lectureTheatre.addStudents(0, 'A', "Cooper");
		assertEquals("A. Cooper\n", lectureTheatre.getSummary());
	}

	@Test
	public void testAddMultipleStudents() {
		Classroom lectureTheatre = new Classroom("01AC01");

		lectureTheatre.addStudents(0, 'A', "Cooper");
		lectureTheatre.addStudents(1, 'S', "Kazamia");
		lectureTheatre.addStudents(2, 'J', "Bloggs");
		lectureTheatre.addStudents(3, 'B', "Ross");
		lectureTheatre.addStudents(4, 'E', "Zaid");
		lectureTheatre.addStudents(5, 'S', "Feng");

		assertEquals("A. Cooper\n" + "S. Kazamia\n" + "J. Bloggs\n" + "B. Ross\n" + "E. Zaid\n" + "S. Feng\n",
				lectureTheatre.getSummary());
	}

	@Test
	public void testNumberOfStudents() {
		Classroom lectureTheatre = new Classroom("01AC01");

		lectureTheatre.addStudents(0, 'A', "Cooper");
		lectureTheatre.addStudents(1, 'S', "Kazamia");
		lectureTheatre.addStudents(2, 'J', "Bloggs");
		lectureTheatre.addStudents(3, 'B', "Ross");
		lectureTheatre.addStudents(4, 'E', "Zaid");
		lectureTheatre.addStudents(5, 'S', "Feng");

		assertEquals(6, lectureTheatre.howManyStudents());
	}

}
