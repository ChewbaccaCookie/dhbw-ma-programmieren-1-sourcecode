void main() {
    int sum = 0;
    for (int i = 0; i < 10; ++i) {
        if ((i + 1) % 5 == 0) {
            continue;
        }
        sum += i;
        System.out.println("i = " + i);
    }
    System.out.println("sum = " + sum);
}

