package loops_prime;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        System.out.println("Geben Sie eine Zahl zum Testen ein:");
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Fehler: Primzahlen können nur für Positive Zahlen bestimmt werden.");
            return;
        }
        if (number == 1) {
            System.out.println("1 ist keine Primzahl");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " ist keine Primzahl!");
                return;
            }
        }

        System.out.println(number + " ist eine Primzahl, yeah!");
    }
}
