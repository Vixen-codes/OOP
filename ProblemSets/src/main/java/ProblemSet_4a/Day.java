package ProblemSet_4a;

public class Day {
     private String name;
     private Session[] sessions;
     //constructor
     public Day(String name) {
    	 this.name = name;
    	 this.sessions = new Session[9];	
     }
     public void addSession(int index, String sessionName, int startTime, int endTime) {
    	 sessions[index] = new Session(sessionName, startTime, endTime);
     }
     public String toString() {
    	 String result = "";
    	 for (Session session: sessions) {
    		 if (session != null) {
    			 result += session.getSessionName()+ ": " + session.getStartTime()
    			 + " - " + session.getEndTime() + " ";
    		 }
    	 }
    	 return result;}
     public void display() {
    	 System.out.println("Day: " + name + " Sessions: " + toString());
     }
}
