package statements;

public class IfElse2 {

    // gleiche Semantik wie Beispiel 1
    public static void main(String[] args) {
        int month = 3;
        boolean leapYear = true;
        int days = 31;

        if (month == 2 && leapYear) {
            days = 29;
        } else {
            if (month == 2) {
                days = 28;
            } else {
                if (month == 4) {
                    days = 30;
                } else {
                    //…
                }
            }
        }
        System.out.println("days=" + days);
    }
}
