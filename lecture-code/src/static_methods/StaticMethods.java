void main() {
    sumAndPrint(15, 98);
}

void sumAndPrint(int a, int b) {
    int summe = calcSum(a, b);
    System.out.println("Die Summe ist: " + summe);
}

int calcSum(int x, int y) {
    return x + y;
}