package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonTracker {
    private List<Person> peopleList;
    public PersonTracker() {
    	this.peopleList = new ArrayList<>();
    }
     public String readTextFile(String file) {
        StringBuilder content = new StringBuilder(); 
        
    	try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
    		String line;
    		while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");  
                breakLine(line);                    
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return content.toString();
    }
       private void breakLine(String line) {
        if (line == null || line.trim().isEmpty()) {
            return; 
            }
        String[] parts = line.trim().split("\\s+");
        if (parts.length >= 3) {
            String forename = parts[0];
            String surname = parts[1];
            try {
                int age = Integer.parseInt(parts[2]);
                addPerson(forename, surname, age);
            } catch (NumberFormatException e) {
                System.err.println("Invalid age format in line: " + line);
            }
        }
            }
    public void addPerson(String n, String s, int a) {
        Person person = new Person(n, s, a);
        peopleList.add(person);
    }
    public String displayList() {
        StringBuilder sb = new StringBuilder();
        for (Person p : peopleList) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    public String getPeopleList() {
        StringBuilder result = new StringBuilder();
        for (Person person : peopleList) {
            result.append(person.toString()).append("\n");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
           }
}
