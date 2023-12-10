package inheritance_bank;

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

    public void payOut(double amount) {
        if (amount <= saldo) {
            saldo -= amount;
            System.out.println("Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public int getNumber() {
        return number;
    }
}
