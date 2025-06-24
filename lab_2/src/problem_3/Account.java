package problem_3;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int accNumber) {
		balance = 0.0;
		this.accNumber = accNumber;
	}
	
	public void deposit (double sum) {
		balance += sum;
		System.out.println("Transaction was successfully completed!");
	}
	public void withdraw (double sum) {
		if (sum > balance) {
            System.out.println("Transaction was cancelled. Insufficient funds on the balance sheet");
        } else {
            balance -= sum;
            System.out.println("Transaction was successfully completed!");
        }
	}
	
	public double getBalance () {
		return balance;
	}
	public int getAccNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		if (amount > balance) {
            System.out.println("Transaction was cancelled. Insufficient funds on the balance sheet");
        } else {
            this.withdraw(amount);
            other.deposit(amount);
            System.out.println("Transaction was successfully completed!");
        }
	}
	
	public void print() {
		System.out.println(toString());
	}
	public String toString() {
		return "Account number: " + accNumber + "\nBalance: " + balance;
	}
}
