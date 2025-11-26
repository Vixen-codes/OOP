package ProblemSet_5c;

public class Customer {
    private String name;
    private String surname;
    
    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    @Override
    public String toString() {
        return name.charAt(0) + ". " + surname;
    }
}