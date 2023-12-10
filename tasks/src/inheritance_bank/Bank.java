package inheritance_bank;

public class Bank {

    public static void main(String[] args) {
        Account[] accounts = new Account[10];

        accounts[0] = new Account(1, "Max Mustermann", 1000);
        accounts[1] = new CheckingAccount(2, "Erika Musterfrau", 2000, 500);
        accounts[2] = new SavingsAccount(3, "Hans Beispiel", 5000, 0.02);
        accounts[3] = new DailyInterestAccount(4, "Anna Test", 3000, 0.015);
        accounts[4] = new FixedTermDepositAccount(5, "Peter Proband", 8000, 0.025, 12);

        accounts[5] = new Account(6, "John Doe", 1500);
        accounts[6] = new CheckingAccount(7, "Jane Smith", 2500, 1000);
        accounts[7] = new SavingsAccount(8, "Alice Johnson", 6000, 0.015);
        accounts[8] = new DailyInterestAccount(9, "Bob Brown", 4000, 0.02);
        accounts[9] = new FixedTermDepositAccount(10, "Catherine Davis", 7000, 0.03, 24);

        for (Account account : accounts) {
            account.printInfo();
            System.out.println();
        }
    }
}
