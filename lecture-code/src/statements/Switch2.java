package statements;

public class Switch2 {

    public static void main(String[] args) {
        int month = 5;
        boolean leapYear = true;
        int days = 0;

        switch (month) {
            case 2: // case-Block
                days = leapYear ? 29 : 28; // Was bedeutet diese Anweisung?
                break;
            case 4: //...
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        System.out.println("days=" + days);
    }
}
