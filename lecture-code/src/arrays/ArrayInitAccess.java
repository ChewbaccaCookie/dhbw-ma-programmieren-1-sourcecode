void main() {
    int myArray[] = new int[10];

    //Array-Elemente schreiben
    for (int i = 0; i < 10; ++i) {
        myArray[i] = (i + 1);
    }

    //Array-Elemente lesen und ausgeben
    for (int i = 0; i < 10; ++i) {
        System.out.println("myArray[i] = " + myArray[i]);
    }
}