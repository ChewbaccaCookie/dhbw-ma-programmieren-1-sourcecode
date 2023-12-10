package exceptions_bank.extension;

class SavingsAccount extends Account {

    private final double interestRate;

    public SavingsAccount(int nummer, String name, double saldo, double interestRate) {
        super(nummer, name, saldo);
        this.interestRate = interestRate;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Interest Rate: " + interestRate);
    }
}
