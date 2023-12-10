package operators_expressions;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = x + y;

        // Zweistellige Operatoren
        System.out.println(+x); // 5
        System.out.println(-x); // -5
        System.out.println(z); // 7

        // Einstellige Operatoren
        System.out.println(++x); // 6
        System.out.println(x++); // 6
        System.out.println(x); // 7
    }
}
