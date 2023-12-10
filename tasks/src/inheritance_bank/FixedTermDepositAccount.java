package inheritance_bank;

class FixedTermDepositAccount extends SavingsAccount {

    private final int durationMonths;

    public FixedTermDepositAccount(int nummer, String name, double saldo, double interestRate, int durationMonths) {
        super(nummer, name, saldo, interestRate);
        this.durationMonths = durationMonths;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Duration: " + durationMonths + " months");
    }
}
