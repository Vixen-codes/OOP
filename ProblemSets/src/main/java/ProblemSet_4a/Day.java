package ProblemSet_4a;

public class Day {
     private String name;
     private Session[] sessions;
     //constructor
     public Day(String name) {
    	 this.name = name;
    	 this.sessions = new Session[4];	
     }
     public void addSession(int index, String moduleName, int startTime, int endTime) {
    	 sessions[index] = new Session(moduleName, startTime, endTime);
     }
     public Session getSessions(int index) {
    	 return sessions[index];
     }
     public String getName() {
    	 return name;
     }
     public String toString() {
    	 String result = "";
    	 for (Session session: sessions) {
    		 if (session != null) {
    			 result += session.getSessionName()+ ": " + session.getStartTime()
    			 + " - " + session.getEndTime() + " ";
    		 }
    	 }
    	 return result;
    	 }
     public void display() {
    	 System.out.println("Day: " + name + " Sessions: " + toString());
     }
}
