package recursion_faculty;

public class FactorialRecursive {

    // Rekursive Methode zur Berechnung der Fakultät
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            // Abbruchbedingung: Fakultät von 0 ist 1 und Fakultät von 1 ist ebenfalls 1
            return 1;
        }

        // Rekursiver Fall: Berechne Fakultät von (n-1) und multipliziere mit n
        int ergebnis = calculateFactorial(n - 1);
        int faculty = n * ergebnis;
        return faculty;
    }

    public static void main(String[] args) {
        // Testen der calculateFactorial-Methode
        int n = 5; // Ändern Sie die Zahl nach Bedarf

        int result = calculateFactorial(n);
        System.out.println("Die Fakultät von " + n + " ist " + result);
    }
}
