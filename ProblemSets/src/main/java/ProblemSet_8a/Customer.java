package ProblemSet_8a;

public class Customer {

	private String name;
	private String surname;
	public Customer(String name, String surname) {
		if (!validateInfo(name) || !validateInfo(surname)) {
			throw new IllegalArgumentException("Name and "
			+ "surname must"
	+ " start with a capital letter"
		+ " followed by lowercase letters only.");
		}
		this.name = name;
		this.surname = surname;
	}
	public char getName() {
		return name.charAt(0);
	}
	public String getSurname() {
	        return surname;
	    }
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public boolean validateInfo(String info) {
		if (info == null || info.isEmpty()) {
			return false;
		}
		return info.matches("[A-Z][a-z]*");
	}
	@Override
	public String toString() {
		return getName() + ". " + getSurname();
	}
}
