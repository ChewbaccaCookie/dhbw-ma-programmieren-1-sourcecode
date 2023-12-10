package recursion_power;

public class PowerCalculator {

    // Rekursive Methode zur Berechnung von x^n
    public static double calculatePower(double x, int n) {
        // Basisfall: x^0 ist immer 1
        if (n == 0) {
            return 1;
        }

        // Rekursiver Fall: Berechne x^(n-1) und multipliziere mit x
        if (n > 0) {
            return x * calculatePower(x, n - 1);
        }

        // Für den Fall, dass n negativ ist, in diesem Beispiel nicht behandelt
        return 0;
    }

    public static void main(String[] args) {
        // Testen der calculatePower-Methode
        double x = 2.0; // Basis
        int n = 5; // Exponent

        double result = calculatePower(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }

}
