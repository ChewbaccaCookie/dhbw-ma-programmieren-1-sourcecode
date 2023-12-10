package overloading;

import java.util.Arrays;

public class Overloading {
    // Methode zur Ausgabe einer Ganzzahl
    public static void printInfo(int number) {
        System.out.println("Ganzzahl: " + number);
    }

    // Überladene Methode zur Ausgabe einer Fließkommazahl
    public static void printInfo(double number) {
        System.out.println("Fließkommazahl: " + String.format("%,.2f", number));
    }

    // Überladene Methode zur Ausgabe einer Zeichenkette
    public static void printInfo(String text) {
        System.out.println("Zeichenkette: " + text);
    }

    // Überladene Methode zur Ausgabe eines Integer-Arrays
    public static void printInfo(int[] array) {
        System.out.print("Integer-Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        // Testen der überladenen Methoden
        int integerNumber = 42;
        double doubleNumber = 3.14159;
        String text = "Hello, World!";
        int[] integerArray = {1, 2, 3, 4, 5};

        printInfo(integerNumber);
        printInfo(doubleNumber);
        printInfo(text);
        printInfo(integerArray);
    }
}
