package problem_3;

public class CheckingAccount extends Account {
	private final double fee = 0.02;
	private int numOfTransactions;
    private final int numOfFreeTransactions = 10;

    
	public CheckingAccount(int accNumber) {
		super(accNumber);
		numOfTransactions = 0;
	}
	
	public int getNumOfTransactions() {
		return numOfTransactions;
	}
	public int getNumOfFreeTransactions() {
		return numOfFreeTransactions;
	}
	public double getFee() {
		return fee;
	}
	
}
