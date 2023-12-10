package static_functions_calculator;

import java.util.Scanner;

public class AdvancedCalculator {

    public static String[] getInput() {
        String[] inputs = new String[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl 1:");
        inputs[0] = scanner.nextLine();

        System.out.println("Operator:");
        inputs[1] = scanner.nextLine();

        if (inputs[1].equals("!")) {
            // Hier wird ein Platzhalterwert gesetzt, welcher aber nicht weiter verwendet wird.
            inputs[2] = "-1";
            return inputs;
        }

        System.out.println("Zahl 2:");
        inputs[2] = scanner.nextLine();

        return inputs;
    }

    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static double mod(double a, double b) {
        return a % b;
    }
    public static int faculty(int a) {
        for (int i = a - 1; i > 0; i--) {
            a *= i;
        }
        return a;
    }

    public static void output(double result) {
        System.out.println("Ergebnis:");
        System.out.println(result);
    }

    public static void main(String[] args) {

        String[] inputs = getInput();
        double result;

        double a = Double.parseDouble(inputs[0]);
        double b = Double.parseDouble(inputs[2]);
        switch (inputs[1]) {
            case "+":
                result = add(a, b);
                break;
            case "-":
                result = subtract(a, b);
                break;
            case "*":
                result = multiply(a, b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Eine Division durch Null ist nicht möglich");
                    return;
                }
                result = divide(a, b);
                break;
            case "%":
                result = mod(a, b);
                break;
            case "!":
                if (a < 0) {
                    System.out.println("Fakultät kann nur von positiven Zahlen bestimmt werden.");
                    return;
                }
                result = faculty((int) a);
                break;
            default:
                System.out.println("Dieser Operator ist nicht bekannt");
                return;
        }
        output(result);
    }
}
