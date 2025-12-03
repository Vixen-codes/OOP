package ProblemSet_9c;

import java.util.ArrayList;

public class Hotel {
	//name of the hotel
   private String name;
   //list of guest staying over
   private ArrayList<IGuest> guests;
   //constructor (parameterised)
   public Hotel(String name) {
	   this.name = name;
	   this.guests = new ArrayList<IGuest>();
   }
   public String getName() {
       return name;
   }
       public ArrayList<IGuest> getGuests() {
       return guests;
   }
     public void addGuest(IGuest guest) {
	   if (guest != null) {
           guests.add(guest);
           }
   }
     //prints the list of guests using thier str representations
   public String printGuestList() {
	   StringBuilder output = new StringBuilder();
	   output.append(name).append(" Hotel\n");
	   output.append("Guest List\n");
	   for (IGuest guest : guests) {
		   output.append(guest.toString()).append("\n");
	   }
	   return output.toString();
   }
}
