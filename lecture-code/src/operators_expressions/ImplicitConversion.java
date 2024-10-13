void main() {
    int i = 10;
    float f = i / 3;
    System.out.println(f);

    byte b1 = 8;
    byte b2 = 7;

    // byte b3 = b1 + b2 ist nicht möglich
    // byte wird implizit in int konvertiert
    // Siehe letzte Slide Punkt 2
    // Somit ist das Ergebnis ein int
    int b3 = b1 + b2;
    System.out.println(b3);
}
