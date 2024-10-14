void main() {
    int month = 2;
    boolean leapYear = false;
    int days = 31;

    switch (month) {
        case 2: //case-Block
            days = leapYear ? 29 : 28; // Was bedeutet diese Anweisung?
        case 4:
        case 6:
        case 9:
        case 11:
            days = 30;
    }
    System.out.println("days = " + days);
}
