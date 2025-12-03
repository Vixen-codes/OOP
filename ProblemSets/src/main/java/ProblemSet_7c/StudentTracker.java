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
	   this.moduleList = new HashMap<>();
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
       moduleList.clear();
       for (Student student : studentList) {
           moduleList.put(student.getUrn(), student);
       }
   }
   public String printStudents() {
	    if (studentList.isEmpty()) {
	        return "";
	    }
	    StringBuilder result = new StringBuilder();
	    for (Student student : studentList) {
	        result.append(student.toString()).append("\n");
	    }
	    return result.toString();
	}
   public String printModules(int urn) {
       initialiseMap();
       Student student = moduleList.get(urn);
       if (student == null) {
           return "URN " + urn + " not found";
         }
       StringBuilder result = new StringBuilder();
       result.append("URN ").append(urn).append(" is enrolled in:\n");
       result.append(student.printModules());
       return result.toString();
}
}
