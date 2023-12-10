package inheritance_bank;

import java.util.ArrayList;

public class BankExtended {

    private final ArrayList<Account> accounts;

    public BankExtended() {
        this.accounts = new ArrayList<>();
    }

    public static void main(String[] args) {
        BankExtended bank = new BankExtended();

        // Hinzufügen von Konten zur Bank
        Account account = new Account(1, "Max Mustermann", 1000);
        bank.addAccount(account);
        bank.addAccount(new CheckingAccount(2, "Erika Musterfrau", 2000, 500));
        bank.addAccount(new SavingsAccount(3, "Hans Beispiel", 5000, 0.02));
        bank.addAccount(new DailyInterestAccount(4, "Anna Test", 3000, 0.015));
        bank.addAccount(new FixedTermDepositAccount(5, "Peter Proband", 8000, 0.025, 12));

        bank.printAllSavingAccounts();

        // Drucken aller Kontoinformationen
        bank.printAllAccountsInfo();

        bank.removeAccount(bank.getAccount(3));

        // Entfernen eines Kontos
        Account accountToRemove = new Account(1, "Max Mustermann", 1000);
        bank.addAccount(accountToRemove);
        bank.removeAccount(accountToRemove);

        // Drucken aller Kontoinformationen nach Entfernen
        System.out.println("\nAfter removing an account:\n");
        bank.printAllAccountsInfo();

        // Drucken des Gesamtsaldos der Bank
        System.out.println("\nTotal Bank Balance: " + bank.getTotalBalance());
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void printAllAccountsInfo() {
        for (Account account : accounts) {
            account.printInfo();
            System.out.println();
        }
    }

    public Account getAccount(int number) {
        for (Account account : accounts) {
            if (account.getNumber() == number) {
                return account;
            }
        }

        return null;
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (Account account : accounts) {
            totalBalance += account.saldo;
        }
        return totalBalance;
    }

    public void printAllCheckingAccounts() {
        for (Account account : this.accounts) {
            if (account instanceof CheckingAccount) {
                account.printInfo();
                System.out.println();
            }
        }
    }

    public void printAllSavingAccounts() {
        for (Account account : this.accounts) {
            if (account instanceof SavingsAccount) {
                account.printInfo();
                System.out.println();
            }
        }
    }

    public void printAllDailyInterestAccounts() {
        for (Account account : this.accounts) {
            if (account instanceof DailyInterestAccount) {
                account.printInfo();
                System.out.println();
            }
        }
    }

    public void printAllFixedTermDepositAccounts() {
        for (Account account : this.accounts) {
            if (account instanceof FixedTermDepositAccount) {
                account.printInfo();
                System.out.println();
            }
        }
    }
}
