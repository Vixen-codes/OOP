package ProblemSet_4a;

public class Test {

	public static void main(String[] args) {
		Day monday = new Day("Monday");
		monday.addSession(0,"COM1027",9, 10);
		monday.addSession(1,"COM1026",15, 17);
		monday.display();
		
		Day tuesday = new Day("Tuesday");
		tuesday.addSession(0, "COM1026", 13, 15);
		
	}

}
