package exceptions_bank.base;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(double missingAmount) {
        super("This account has insufficient funds. Missing: " + missingAmount + "€");
    }
}
