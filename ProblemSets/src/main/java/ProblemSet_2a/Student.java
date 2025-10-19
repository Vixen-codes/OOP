package ProblemSet_2a;

public class Student {
	//instance variables
	private String forename;
	private String surname;
	private int age;
	//constructor
	public Student(String forename, String surname, int age) {
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}
    //getters for fullname and age
	public int getAge() {
		return age;
	}
	public String getFullname() {
		return forename + " " + surname;
	}
	//setter for firstname,lastname and age
    public void setAge(int age) {
    	this.age = age;
    }
    public void setForename(String forname) {
    	this.forename = forname;
    }
    public void setSurname(String surname) {
    	this.surname= surname;
    }
}
