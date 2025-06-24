package problem_3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }
    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened: " + account);
    }

    public void closeAccount(Account account) {
        if (accounts.remove(account)) {
            System.out.println("Account closed: " + account);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void update() {
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
                System.out.println("Interest added to: " + acc);
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
                System.out.println("Fees deducted from: " + acc);
            }
        }
    }

    public void printAllAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}
