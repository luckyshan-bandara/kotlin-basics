package core.javacode;

public class JavaEmployee2 {

    private final String firstName;
    private boolean fullTime;


    public JavaEmployee2(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public JavaEmployee2(String firstName, boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
}
