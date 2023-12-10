package exceptions;

import java.util.ArrayList;

public class DivideMultiExceptionExample {

    public static void main(String[] args) {
        double a = 10;
        double b = 1;
        try {
            System.out.println(DivideExample.divide(a, b));
            ArrayList<String> list = new ArrayList<>();
            list.get(0).equals("test");
        } catch (DivideByZeroException e) {
            System.out.println("Division by zero is not allowed");
        } catch (NullPointerException e) {
            System.out.println("An internal error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unknown error occurred: " + e.getMessage());
        } finally {
            System.out.println("This is always printed");
        }
    }
}
