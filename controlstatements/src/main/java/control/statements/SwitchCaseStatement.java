package control.statements;

public class SwitchCaseStatement {

    /**
     * Va intra pe cazul 2 si se va opri deoarece are break
     * Daca se sterge break va continua pana la final
     */
    public static void main(String args[]) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Case1: Value is: " + number);
            case 2:
                System.out.println("Case2: Value is: " + number);
                //  break;
            case 3:
                System.out.println("Case3: Value is: " + number);
            default:
                System.out.println("Default: Value is: " + number);
        }
    }
}
