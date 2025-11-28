package ProblemSet_7b;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private String name;
  private String urn;
  private List<Module> moduleList;
  
  public Student(String name, String urn) {
	  this.name = formatName(name);
	  this.urn = validateUrn(urn);
	  this.moduleList = new ArrayList<>();
  }
  private String formatName(String name) {
	  if (name == null || name.trim().isEmpty()) {
		  return name;
	  }
	  String[] words = name.trim().split("\\s+");
      StringBuilder formatted = new StringBuilder();
      for (int i = 0; i < words.length; i++) {
          if (words[i].length() > 0) {
              // Capitalize first letter, lowercase the rest
              formatted.append(Character.toUpperCase(words[i].charAt(0)));
              formatted.append(words[i].substring(1).toLowerCase());
              if (i < words.length - 1) {
                  formatted.append(" ");
              }
          }
         }
      return formatted.toString();
  }
  // Validate URN - must be 5 digits, otherwise return "00000"
  private String validateUrn(String urn) {
      if (urn != null && urn.matches("\\d{5}")) {
          return urn;
      }
      return "00000";
  }
  // Getter for URN (returns as int)
  public int getUrn() {
      return Integer.parseInt(urn);
  }
  // Getter for name
  public String getName() {
      return name;
  }
  // Add module to the list (only if it doesn't already exist)
  public void addModuleList(Module module) {
      if (module == null) {
          return;
      }   
      // Check if module already exists
      if (!moduleExists(module)) {
          moduleList.add(module);
      }
  }
  // Private helper method to check if module already exists in the list
  private boolean moduleExists(Module module) {
      for (Module m : moduleList) {
          if (m.getName().equals(module.getName())) {
              return true;
          }
      }
      return false;
  }
  // Print all modules in the format: COM1025, COM1026, COM1027
  public String printModules() {
      if (moduleList.isEmpty()) {
          return "";
      }   
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < moduleList.size(); i++) {
          result.append(moduleList.get(i).getName());
          // Add comma and space if not the last element
          if (i < moduleList.size() - 1) {
              result.append(", ");
          }
      }
      return result.toString();
  }
}
