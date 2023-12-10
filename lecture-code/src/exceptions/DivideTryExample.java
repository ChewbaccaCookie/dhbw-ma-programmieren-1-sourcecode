package exceptions;

public class DivideTryExample {

    public static void main(String[] args) {
        double a = 10;
        double b = 0;
        try {
            System.out.println(DivideExample.divide(a, b));
        } catch (DivideByZeroException e) {
            System.out.println("Division by zero is not allowed");
        }
    }
}
