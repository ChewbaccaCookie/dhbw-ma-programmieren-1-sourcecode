void main() {
    int month = 3; // März
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
