package exceptions;

public class DivideFinallyExample {

    public static void main(String[] args) {
        double a = 10;
        double b = 0;
        try {
            System.out.println(DivideExample.divide(a, b));
        } catch (DivideByZeroException e) {
            System.out.println("Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("An unknown error occurred");
        } finally {
            System.out.println("This is always printed");
        }
    }
}
