package inheritance_bank;

class DailyInterestAccount extends SavingsAccount {

    public DailyInterestAccount(int nummer, String name, double saldo, double interestRate) {
        super(nummer, name, saldo, interestRate);
    }
}
