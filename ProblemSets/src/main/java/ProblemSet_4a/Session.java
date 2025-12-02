package ProblemSet_4a;

public class Session {
	private String sessionName;
    private int startTime;
    private int endTime;

   public Session(String sessionName, int startTime, int endTime) {
	   this.sessionName = sessionName;
	     this.startTime = startTime;
	   this.endTime = endTime;
    }
   public String getSessionName() {
	return sessionName;
     }
   public int getStartTime() {
	return startTime;
     }
   public void setStartTime(int startTime) {
	   this.startTime = startTime;
     }
   public int getEndTime() {
	return endTime;
      }
   public void setEndTime(int endTime) {
	   this.endTime = endTime;
      }
}
