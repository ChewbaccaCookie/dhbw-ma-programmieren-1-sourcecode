package classes.static_methods;

public class StaticMethods {

    public static void main(String[] args) {
        int a = 15;
        int b = 40;
        StaticMethods.sumAndPrint(a, b);

        // Funktioniert nur in der gleichen Klasse!
        a = 35;
        b = 59;
        sumAndPrint(a, b);
    }

    public static void sumAndPrint(int a, int b) {
        int sum = a + b;
        System.out.println("Die Summe ist: " + sum);
    }
}
