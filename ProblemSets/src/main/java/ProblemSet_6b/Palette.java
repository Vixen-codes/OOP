package ProblemSet_6b;

public class Palette {
    private P_COLOUR[] primaryColours;

    public Palette() {
        this.primaryColours = new P_COLOUR[3];
    }
    public Palette(P_COLOUR[] colours) {
        this.primaryColours = new P_COLOUR[3];
        if (colours != null) {
            for (int i = 0; i < colours.length && i < 3; i++) {
                this.primaryColours[i] = colours[i];
            }
        }
    }
    public void addColour(P_COLOUR colour) {
        for (int i = 0; i < primaryColours.length; i++) {
            if (primaryColours[i] == colour) {
                return; 
                }
        }
        for (int i = 0; i < primaryColours.length; i++) {
            if (primaryColours[i] == null) {
                primaryColours[i] = colour;
                return;
            }
        }
        throw new IllegalStateException("Cannot add more than 3 colours");
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
        return "No colours added";
        }
        return result.toString();
    }
}
