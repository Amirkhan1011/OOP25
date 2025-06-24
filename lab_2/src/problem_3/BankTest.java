package problem_3;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account basicAccount = new Account(1001);
        SavingsAccount savings = new SavingsAccount(1002, 5.0); 
        CheckingAccount checking = new CheckingAccount(1003);

        basicAccount.deposit(1000);
        savings.deposit(2000);
        checking.deposit(500);

        for (int i = 0; i < 12; i++) {
            checking.deposit(10);  
        }

        bank.openAccount(basicAccount);
        bank.openAccount(savings);
        bank.openAccount(checking);

        System.out.println("\n--- Accounts before update ---");
        bank.printAllAccounts();

        System.out.println("\n--- Updating bank accounts ---");
        bank.update();

        System.out.println("\n--- Accounts after update ---");
        bank.printAllAccounts();

        bank.closeAccount(basicAccount);
    }
}
