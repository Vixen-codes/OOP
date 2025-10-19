package ProblemSet_2a;

public class Student {
   private String forename;
   private String lastname;
   private int age;
   
    public Student(String forename, String lastname, int age){
    	this.forename = forename();
    	this.lastname = lastname();
    	this.age = age();
    }

	private int age() {
		return 0;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String lastname() {
		return null;
	}

	private String forename() {
		return null;
	}
    
}
