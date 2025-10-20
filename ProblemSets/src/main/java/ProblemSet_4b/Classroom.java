package ProblemSet_4b;

public class Classroom {
  //max amount of kids is 20 so constant is needed here
	private static final int CAPACITY = 20;
	private String room;
	private Student[] maxStudents;
	//contructor shall construct!!!
	public Classroom(String room) {
		this.room = room;
		this.maxStudents = new Student[CAPACITY];
	}
	public String getRoom() {
        return room;
    }
    public int getCapacity() {
        return CAPACITY;
    }
    public void addStudents(int index, char initial, String surname) {
        if (index >= 0 && index < CAPACITY) {
			maxStudents[index] = new Student(initial, surname);
		} else {
			System.out.println ("index out of range, "
					+ "please put a value between 0-19");}
		      }
		public String getSummary() {
		    String summary = "";
		    int count = 0;

		    for (int i = 0; i < CAPACITY; i++) {
		        if (maxStudents[i] != null) {
		            summary = summary + maxStudents[i].getStudentDetails() + "\n";
		            count = count + 1;
		        }
		    }
		    if (count == 0) {
		        return "No students added";
		    } else {
		        return summary;
		    }
		}	
     //number of students surrently
		public int howManyStudents() {
			int count = 0;
			for (Student s : maxStudents) {
				if (s != null) {
					count++;
				}
			}
			return count;
		}
	}

