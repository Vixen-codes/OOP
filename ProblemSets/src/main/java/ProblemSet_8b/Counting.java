package ProblemSet_8b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counting {
   public Counting() {
   }
  public String readTextFile(String file) {
	        StringBuilder result = new StringBuilder();
	        int counter = 0;
   try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
       String line;
       while ((line = reader.readLine()) != null) {
           counter++;
           result.append(displayLine(line, counter));
           if (reader.ready()) {
               result.append("\n");
	   }
   }
   } catch(IOException e) {
	   System.err.println("Error reading file: " + e.getMessage());
}
   return result.toString();
}
  public String displayLine(String line, int counter) {
	  return line + " : " + counter;
  }
}
