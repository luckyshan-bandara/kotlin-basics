package core.javacode;

public class DummyClass {

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation!" : "I'm Working!";
    }

    public void printNumbers(int[] numbers) {
        for (int num: numbers) {
            System.out.println(num);
        }
    }
}
