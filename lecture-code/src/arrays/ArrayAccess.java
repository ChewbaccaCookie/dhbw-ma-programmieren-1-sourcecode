void main() {
    //Deklaration und Initialisierung mit new
    int daysPerMonth[] = new int[12];

    //Arrayzugriff: Zuweisung
    daysPerMonth[0] = 31;
    daysPerMonth[1] = 28;
    daysPerMonth[2] = 31;

    //…
    daysPerMonth[9] = 31;
    daysPerMonth[10] = 30;
    daysPerMonth[11] = 31;

    //Arrayzugriff: Auslesen
    System.out.println("daysPerMonth[1] = " + daysPerMonth[1]);
}