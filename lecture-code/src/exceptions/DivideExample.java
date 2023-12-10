package exceptions;

public class DivideExample {

    public static void main(String[] args) throws DivideByZeroException {
        double a = 10;
        double b = 0;
        System.out.println(divide(a, b));
    }

    public static double divide(double a, double b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }
}
