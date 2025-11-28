package ProblemSet_7c;

public class Module {

    // instance variable with default value
    private String name = null;

    // parameterised constructor
    public Module(String name) {
        if (name != null && name.matches("^COM[0-9]{4}$")) {
            this.name = name;
        } else {
            this.name = "Error";
        }
    }

    // accessor method
    public String getName() {
        return name;
    }
}
