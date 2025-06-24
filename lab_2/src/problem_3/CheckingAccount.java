package problem_3;

public class CheckingAccount extends Account {
	private static final double FEE = 0.02;
	private int numOfTransactions;
    private static final int FREE_TRANSACTIONS = 10;

    
	public CheckingAccount(int accNumber) {
		super(accNumber);
		numOfTransactions = 0;
	}
	
	public int getNumOfTransactions() {
		return numOfTransactions;
	}
	public int getFreeTransactions() {
		return FREE_TRANSACTIONS;
	}
	public double getFee() {
		return FEE;
	}
	
	public void deductFee() {
        if (numOfTransactions >= FREE_TRANSACTIONS) {
            super.withdraw(FEE);
        } else {
            System.out.println("You have free transactions!");
        }
    }
	
	public void deposit(double sum) {
		if(numOfTransactions >= FREE_TRANSACTIONS) {
			super.deposit(sum);
            deductFee();
		}
		else {
			super.deposit(sum);
		}
		numOfTransactions++;
	}
	public void withdraw(double sum) {
		if(numOfTransactions >= FREE_TRANSACTIONS) {
			if (getBalance() < FEE + sum) {
	            System.out.println("Transaction was cancelled. Insufficient funds on the balance sheet");
			}
			else {
				deductFee();
				super.withdraw(sum);
				numOfTransactions++;
			}
		}
		else {
			super.withdraw(sum);
			numOfTransactions++;
		}
	}
	public void transfer(double amount, Account other) {
		if(numOfTransactions >= FREE_TRANSACTIONS) {
			if (getBalance() < FEE + amount) {
	            System.out.println("Transaction was cancelled. Insufficient funds on the balance sheet");
			}
			else {
				deductFee();
				super.transfer(amount, other);
				numOfTransactions++;
			}
		}
		else {
			super.transfer(amount, other);
			numOfTransactions++;
		}
	}
	
}
