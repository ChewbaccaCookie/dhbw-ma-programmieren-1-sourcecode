package exceptions_bank.extension;

class Account {

    protected int number;
    protected String name;
    protected double saldo;

    public Account(int number, String name, double saldo) {
        this.number = number;
        this.name = name;
        this.saldo = saldo;
    }

    public void printInfo() {
        System.out.println("Account Number: " + number);
        System.out.println("Holder: " + name);
        System.out.println("Balance: " + saldo);
    }

    public void payIn(double amount) {
        saldo += amount;
        System.out.println("Deposit: " + amount);
    }

    public void transfer(double amount, Account target) throws InsufficientFundsException, SystemException {
        payOut(amount);
        target.payIn(amount);
    }

    public void payOut(double amount) throws InsufficientFundsException, SystemException {
        int i = 0;
        while (true) {
            try {
                double random = Math.random();
                if (random < 0.2) {
                    throw new SystemException();
                }

                if (amount <= saldo) {
                    saldo -= amount;
                    System.out.println("Withdrawal: " + amount);
                    return;
                } else {
                    throw new InsufficientFundsException(amount - saldo);
                }
            } catch (SystemException e) {
                if (i == 3) {
                    throw e;
                }
                System.out.println("System failure, retrying " + (i + 1));
                i++;
            }
        }
    }

    public int getNumber() {
        return number;
    }
}
