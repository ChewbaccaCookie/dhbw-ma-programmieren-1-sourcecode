void modifyArray(int[] arr) {
    // Änderung des Array-Inhalts
    for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * 2;
    }
}

void main() {
    int[] numbers = {1, 2, 3, 4};

    // Aufruf der Funktion und Übergabe der Referenz auf das Array
    modifyArray(numbers);

    // Das Array wurde innerhalb der Funktion geändert und die Änderungen sind sichtbar
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
}
