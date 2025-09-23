package ProblemSet_7c;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StudentTrackerTest {
	StudentTracker st = new StudentTracker();

	@Test
	public void testAddStudent() {
		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");

		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(module1);
		moduleList.add(module2);
		moduleList.add(module3);

		Student student1 = new Student("Stella Kazamia", "12345");

		st.addStudent(student1, moduleList);
	}

	@Test
	public void testPrintingStudentModules() {
		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");
		Module module4 = new Module("COM1028");
		Module module5 = new Module("COM1029");
		Module module6 = new Module("COM1031");
		Module module7 = new Module("COM1032");

		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(module1);
		moduleList.add(module2);
		moduleList.add(module3);
		moduleList.add(module4);
		moduleList.add(module5);
		moduleList.add(module6);
		moduleList.add(module7);

		Student student1 = new Student("Stella Kazamia", "12345");
		Student student2 = new Student("Alice Wonderland", "23456");
		Student student3 = new Student("Joe Bloggs", "34567");
		Student student4 = new Student("Bugs Bunny", "56123");
		Student student5 = new Student("Mariyah Zaid", "98765");
		Student student6 = new Student("Shujun Feng", "94623");

		st.addStudent(student1, moduleList);

		moduleList.remove(1);
		st.addStudent(student2, moduleList);
		st.addStudent(student3, moduleList);
		moduleList.remove(1);
		st.addStudent(student4, moduleList);
		st.addStudent(student5, moduleList);
		moduleList.remove(0);
		moduleList.remove(1);
		st.addStudent(student6, moduleList);

		assertEquals("COM1027, COM1028, COM1029, COM1031, COM1032", student4.printModules());

		assertEquals("COM1027, COM1026, COM1028, COM1029, COM1031, COM1032", student3.printModules());

	}

	@Test
	public void testPrintManyStudents() {
		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");

		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(module1);
		moduleList.add(module2);
		moduleList.add(module3);

		Student student1 = new Student("Stella Kazamia", "12345");
		Student student2 = new Student("Alice Wonderland", "23456");
		Student student3 = new Student("Joe Bloggs", "34567");

		st.addStudent(student1, moduleList);
		st.addStudent(student2, moduleList);
		st.addStudent(student3, moduleList);

		assertEquals("Stella Kazamia(12345)\n" + "Alice Wonderland(23456)\n" + "Joe Bloggs(34567)\n",
				st.printStudents());
	}

	@Test
	public void testPrintModules() {
		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");

		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(module1);
		moduleList.add(module2);
		moduleList.add(module3);

		Student student1 = new Student("Stella Kazamia", "12345");
		Student student2 = new Student("Alice Wonderland", "23456");
		Student student3 = new Student("Joe Bloggs", "34567");

		st.addStudent(student1, moduleList);

		moduleList.remove(1);
		st.addStudent(student2, moduleList);
		st.addStudent(student3, moduleList);

		assertEquals("URN 23456 is enrolled in:\n" + "COM1027, COM1026", st.printModules(23456));
	}

	@Test
	public void testPrintStudent() {
		Module module1 = new Module("COM1027");
		Module module2 = new Module("COM1025");
		Module module3 = new Module("COM1026");

		List<Module> moduleList = new ArrayList<Module>();
		moduleList.add(module1);
		moduleList.add(module2);
		moduleList.add(module3);

		Student student1 = new Student("Stella Kazamia", "12345");

		st.addStudent(student1, moduleList);

		assertEquals("Stella Kazamia(12345)\n" + "", st.printStudents());
	}

}
