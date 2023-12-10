package exceptions_bank.base;

class CheckingAccount extends Account {

    private final double overdraft;

    public CheckingAccount(int nummer, String name, double saldo, double overdraft) {
        super(nummer, name, saldo);
        this.overdraft = overdraft;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Overdraft Limit: " + overdraft);
    }

    @Override
    public void payOut(double amount) throws InsufficientFundsException {
        double availableFunds = saldo + overdraft;
        if (amount <= availableFunds) {
            saldo -= amount;
            System.out.println("Withdrawal: " + amount);
        } else {
            throw new InsufficientFundsException(amount - availableFunds);
        }
    }
}
