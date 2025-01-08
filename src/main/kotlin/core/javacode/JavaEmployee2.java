package core.javacode;

public class JavaEmployee2 {

    private final String firstName;
    private final boolean fullTime;


    public JavaEmployee2(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public JavaEmployee2(String firstName, boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }
}
