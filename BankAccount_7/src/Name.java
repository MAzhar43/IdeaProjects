public class Name {

    //Variable Declarations
    private String fName;
    private String lName;

    //Copy Constructors
    public Name(Name name) {
        fName = name.getfName();
        lName = name.getlName();
    }

    //Constructor
    public Name(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    //Getters and Setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public  String toString() {
        return String.format("%s %s", fName, lName);
    }
}
