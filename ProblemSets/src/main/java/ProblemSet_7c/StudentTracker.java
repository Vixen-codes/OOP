package ProblemSet_7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTracker {
   private List<Student> studentList;
   private Map<Integer, Student> moduleList;
   public StudentTracker() {
	   this.studentList = new ArrayList<>();
	   this.moduleList =new HashMap <>();
   }
   public void addStudent(Student student, List<Module> mList) {
       if (student == null || mList == null) {
           return;
       }
       for (Module module : mList) {
           student.addModuleList(module);
	   }
	   studentList.add(student);
	   initialiseMap();
   }
   private void initialiseMap() {
       // Clear the map and rebuild it from the student list
       moduleList.clear();   
       for (Student student : studentList) {
           moduleList.put(student.getUrn(), student);
       }
   }
   // Print all students in the student list
   public String printStudents() {
       if (studentList.isEmpty()) {
           return "";
       }
       StringBuilder result = new StringBuilder();
       for (int i = 0; i < studentList.size(); i++) {
           result.append(studentList.get(i).toString());
           if (i < studentList.size() - 1) {
               result.append("\n");
           }
       }
       return result.toString();
   }
   // Print all modules for a given URN
   public String printModules(int urn) {
       // Make sure the map is up to date
       initialiseMap();
       // Get student with this URN
       Student student = moduleList.get(urn);
       if (student == null) {
           return "URN " + urn + " not found";
       }
       // Format the output
       StringBuilder result = new StringBuilder();
       result.append("URN ").append(urn).append(" is enrolled in:\n\n");
       result.append(student.printModules());
       return result.toString();
}
}
