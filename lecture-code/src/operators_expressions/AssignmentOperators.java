void main() {
    int x = 5;
    int y = 0;
    int z = 0;

    // Zuweisungsoperator
    x = x + 1;
    z = (y = (x + 1));
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    // Verbundoperator
    x += (y + z);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
}

