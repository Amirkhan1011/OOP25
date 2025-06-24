package problem_3;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(int accNumber, double interestRate) {
		super(accNumber);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void addInterest() {
		super.deposit(this.getBalance() * interestRate / 100);
	}
	
	public String toString() {
		return "Savings Account balance: " + balance + "\nInterest Rate: " + interestRate;
	}

}
