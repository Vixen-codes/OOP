package ProblemSet_6c;
public class Palette {
	    private P_COLOUR[] primaryColours;

	    public Palette() {
	        this.primaryColours = new P_COLOUR[3];
	    }
	    public Palette(P_COLOUR[] colours) {
	        this.primaryColours = new P_COLOUR[3];
	        if (colours != null) {
	        	int count = 0;
	        	for (int i = 0; i < colours.length; i++) {
	        		if (colours[i] != null) {
	        			count++;
	        		}
	        	}
	       if (count > 2) {
	        	throw new IllegalArgumentException("Cannot "
	        	+ "initialise, more than 2 colours");
	        	}
	            for (int i = 0; i < colours.length && i < 3; i++) {
	                this.primaryColours[i] = colours[i];
	            }
	        }
	    }
	    public void addColour(P_COLOUR colour) {
	        for (int i = 0; i < primaryColours.length; i++) {
	            if (primaryColours[i] == colour) {
	               throw new IllegalArgumentException("Colour "
	               		+ "already exists in palette");
	            }
	        }
	   for (int i = 0; i < primaryColours.length; i++) {
	            if (primaryColours[i] == null) {
	                primaryColours[i] = colour;
	                return;
	          }
	    }
	      throw new IllegalArgumentException("Cannot "
	        		+ "add more than 3 colours");
	    }
	    public String getColours() {
	    StringBuilder result = new StringBuilder();
	    boolean hasColours = false;
	     for (int i = 0; i < primaryColours.length; i++) {
	     if (primaryColours[i] != null) {
	     if (hasColours) {
	     result.append(", ");
	     }
	     result.append(primaryColours[i]);
	         hasColours = true;
	     }
	     }
	      if (!hasColours) {
	        return "";
	        }
	        return result.toString();
	    }
	    public String mixColours() {
	    	int count = 0;
	    	boolean hasRed = false;
	    	 boolean hasYellow = false;
	    	boolean hasBlue = false;
	        for (int i = 0; i < primaryColours.length; i++) {
	        	if (primaryColours[i] != null) {
	        		count++;
	        		if (primaryColours[i] == P_COLOUR.RED) {
	        			hasRed = true;
	        		} else if (primaryColours[i]
	        				== P_COLOUR.YELLOW) {
	        			hasYellow = true;
	        		} else if (primaryColours[i]
	        				== P_COLOUR.BLUE) {
	        			hasBlue = true;
	        		}
	        	}
	        }
	        if (count == 0) {
	        	return "";
	        }
	        if (count == 3) {
	        	return "BLACK";
	        }
	        if (count == 1) {
	        	if (hasRed) return "RED";
	            if (hasYellow) return "YELLOW";
	            if (hasBlue) return "BLUE";
	        }
	        if (count == 2) {
	            if (hasRed && hasYellow) {
	                return "ORANGE";
	            }
	            if (hasBlue && hasYellow) {
	                return "GREEN";
	            }
	            if (hasRed && hasBlue) {
	                return "PURPLE";
	            }
	        }
	        return "";
	    }
	    public String display() {
	        StringBuilder result = new StringBuilder();
	       	        String coloursString = getColours();
	        String mixedColour = mixColours();
	        result.append(coloursString);
	        result.append(" = ");
	        result.append(mixedColour);
	        return result.toString();
	    }
	 }


