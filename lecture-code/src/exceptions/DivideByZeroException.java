package exceptions;

public class DivideByZeroException extends Exception {

    public DivideByZeroException() {
        super("You tried to divide by zero");
    }
}
