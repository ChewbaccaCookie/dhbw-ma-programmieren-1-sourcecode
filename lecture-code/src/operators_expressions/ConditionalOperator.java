package operators_expressions;

public class ConditionalOperator {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int a = x == 5 ? x : y;
        int b = x / 2 == y ? y + 1 : y + 2;
        boolean c = (x == (y / 2)) ? y == 1 : y == 2;

        // Bedingungsoperator
        System.out.println(a); // 5
        System.out.println(b); // 3
        System.out.println(c); // true
    }
}
