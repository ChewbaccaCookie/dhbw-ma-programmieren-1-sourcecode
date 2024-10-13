void main() {
    int x = 5;
    int y = 2;
    int a = x == 5 ? x : y;
    int b = x / 2 == y ? y + 1 : y + 2;
    boolean c = (x == (y / 2)) ? y == 1 : y == 2;

    // Bedingungsoperator
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}