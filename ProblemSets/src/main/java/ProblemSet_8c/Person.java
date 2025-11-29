package ProblemSet_8c;

public class Person {
   private String forename;
   private String surname;
   private int age;

   public Person(String forename, String surname, int age) {
	   this.forename = forename;
	   this.surname = surname;
	   this.age = age;
   }
   public String getForename() {
	return forename;
   }
   public String getSurname() {
	return surname;
   }
   public int getAge() {
	return age;
   }
   @Override
   public String toString() {
	   return forename + " " + surname + " (" + age + ")";
   }
}
