package loops_faculty;

import java.util.Scanner;

public class Faculty {

    public static void main(String[] args) {
        System.out.println("Geben Sie eine Zahl ein:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Fehler: Die Fakultät kann nur von positiven Zahlen bestimmt werden");
            return;
        }

        long faculty = 1;
        for (int i = 1; i <= number; i++) {
            faculty = faculty * i;
        }

        System.out.println(number + "! entspricht " + faculty);
    }
}
