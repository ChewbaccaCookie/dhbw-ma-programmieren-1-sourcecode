void main() {
    int sum = 0;
    // for(<Init>; <Ausdruck>; <Update>) <AnweisungsBlock>
    for (int i = 0; i < 10; ++i) {
        sum += i;
        System.out.println("sum = " + sum);
    }
}
