package ProblemSet_4a;

/**
 * A simple class used to test the "Day" class.
 *
 * @author Stella Kazamia
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DayTest {

	@Test
	public void testObject() {
		Day d2 = new Day("Tuesday");
		assertEquals("Tuesday", d2.getName());

	}

	@Test
	public void testSessionObject() {
		Day d = new Day("Monday");
		d.setSession(0, "COM1027", 10, 12);

		assertEquals("COM1027", d.getSessions(0).getSessionName());
		assertEquals(10, d.getSessions(0).getStartTime());
		assertEquals(12, d.getSessions(0).getEndTime());

	}

	@Test
	public void testSessionObjectComplex() {
		Day d3 = new Day("Wednesday");
		Session s1 = new Session("COM1027", 9, 11);
		Session s2 = new Session("COM1025", 12, 13);
		Session s3 = new Session("COM1026", 15, 17);

		d3.setSession(0, s1.getSessionName(), s1.getStartTime(), s1.getEndTime());
		d3.setSession(1, s2.getSessionName(), s2.getStartTime(), s2.getEndTime());
		d3.setSession(2, s3.getSessionName(), s3.getStartTime(), s3.getEndTime());

		assertEquals("COM1025", d3.getSessions(1).getSessionName());
		assertEquals(12, d3.getSessions(1).getStartTime());
		assertEquals(13, d3.getSessions(1).getEndTime());

		assertEquals("COM1027: 9 - 11\n" + "COM1025: 12 - 13\n" + "COM1026: 15 - 17\n", d3.toString());
	}

	@Test
	public void testSetSessionExample() {
		Day d = new Day("Monday");
		d.setSession(0, "COM1027", 9, 10);

		assertEquals("COM1027: 9 - 10\n", d.toString());

	}

	@Test
	public void testSetSessionPicture() {
		Day d = new Day("Monday");
		d.setSession(0, "COM1027", 9, 10);
		d.setSession(1, "COM1025", 15, 17);

		assertEquals("COM1027: 9 - 10\n" + "COM1025: 15 - 17\n", d.toString());

		Day d2 = new Day("Tuesday");
		d2.setSession(0, "COM1026", 13, 15);

		assertEquals("COM1026: 13 - 15\n", d2.toString());

	}

	@Test
	public void testSessionUpdate() {
		Day d3 = new Day("Wednesday");
		Session s1 = new Session("COM1027", 9, 11);
		Session s2 = new Session("COM1025", 12, 13);
		Session s3 = new Session("COM1026", 15, 17);

		s2.setStartTime(13);
		s2.setEndTime(14);

		d3.setSession(0, s1.getSessionName(), s1.getStartTime(), s1.getEndTime());
		d3.setSession(1, s2.getSessionName(), s2.getStartTime(), s2.getEndTime());
		d3.setSession(2, s3.getSessionName(), s3.getStartTime(), s3.getEndTime());

		assertEquals("COM1025", d3.getSessions(1).getSessionName());
		assertEquals(13, d3.getSessions(1).getStartTime());
		assertEquals(14, d3.getSessions(1).getEndTime());

		assertEquals("COM1027: 9 - 11\n" + "COM1025: 13 - 14\n" + "COM1026: 15 - 17\n", d3.toString());
	}

}
