package control.statements;

public class ControlFlowStatement {
    public static void main(String[] args) {
        int number = 10;

        if (number > 15)
            System.out.println("10 is less than 15");

        System.out.println("I am not in if");

        if (number < 4 && number > 59) {
            System.out.println("I am out of interval");

        } else if (number == 15) {
            System.out.println("This is me");

        } else if (number >= 10) {
            System.out.println("This is partial me");
        } else if (number <= 10) {
            System.out.println("This is partial me");
        } else {
            System.out.println("Do what you want");
        }
    }

}
