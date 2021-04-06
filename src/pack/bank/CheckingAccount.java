package pack.bank;

public class CheckingAccount {
	
	private int accountID;
	private double currentBal;
	
	public CheckingAccount(int accountID, double currentBal) {
		super();
		this.accountID = accountID;
		this.currentBal = currentBal;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public double getCurrentBal() {
		return currentBal;
	}

	public void setCurrentBal(double currentBal) {
		this.currentBal = currentBal;
	}
	
	public void addDeposit(double deposit) {
		this.setCurrentBal(this.getCurrentBal()+deposit);
	}
	
	public void addWithdraw(double withdraw) {
		this.setCurrentBal(this.getCurrentBal()-withdraw);
	}
	
	public void addFromSavings(SavingsAccount savings, double amount) {
		savings.addWithdraw(amount);
		this.addDeposit(amount);
	}
	
	public void withdrawToSavings(SavingsAccount savings, double amount) {
		this.addWithdraw(amount);
		savings.addDeposit(amount);
	}

}
