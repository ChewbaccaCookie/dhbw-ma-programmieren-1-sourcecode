package statements;

public class IfElse {

    public static void main() {
        int month = 2;
        boolean leapYear = false;
        int days = 31;

        if (month == 2 && leapYear) {
            days = 29;
        } else if (month == 2) {
            days = 28;
        } else if (month == 4) {
            days = 30;
        }
        //...

        System.out.println("days=" + days);
    }
}
