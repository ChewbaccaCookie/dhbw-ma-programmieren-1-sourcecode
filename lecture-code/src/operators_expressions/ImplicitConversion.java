package operators_expressions;

public class ImplicitConversion {

    public static void main(String[] args) {
        byte b1 = 8;
        byte b2 = 7;

        // byte b3 = b1 + b2; => Nicht möglich da int

        int i = 10;
        float f = i / 3;
        System.out.println(f); // 3.0
    }
}
