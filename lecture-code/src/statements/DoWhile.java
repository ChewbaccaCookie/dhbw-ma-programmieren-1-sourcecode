void main() {
    int sum = 0;
    int i = 0;

    // do <AnweisungsBlock> while (<Ausdruck>);
    do {
        sum += i;
        System.out.println("sum = " + sum);
        ++i;
    } while (i < 10);
}
