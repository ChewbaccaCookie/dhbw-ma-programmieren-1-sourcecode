int sum(int a, int b) {
    return a + b;
}

void sumAndPrint(int a, int b) {
    System.out.println("Die Summe ist: " + sum(a, b));
}

void main() {
    int a = 15;
    int b = 40;
    sumAndPrint(a, b);

    // Man kann auch den Klassennamen weglassen, wenn die Funktion aus der gleichen Klasse aufgerufen wird
    a = 35;
    b = 59;
    sumAndPrint(a, b);
}
