package operators_expressions;

public class LogicalOperators {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = 0;

        // Logische Operatoren
        System.out.println((x == 5) & (y == 3)); // false
        System.out.println((x == 5) | (y == 3)); // true
        System.out.println((x == 5) ^ (y == 3)); // true
        System.out.println(!((x == 5) & (y == 3))); // true
    }
}
