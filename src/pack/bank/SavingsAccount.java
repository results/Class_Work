package pack.bank;

public class SavingsAccount {
	
	private int accountID;
	private double currentBal;	
	
	public SavingsAccount(int accountID, double openingBal) {
		this.accountID = accountID;
		this.currentBal = openingBal;
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

	public void addFromChecking(CheckingAccount check, double amount) {
		check.addWithdraw(amount);
		this.addDeposit(amount);
	}
	
	public void withdrawToChecking(CheckingAccount checkingAccount, double amount) {
		this.addWithdraw(amount);
		checkingAccount.addDeposit(amount);
	}

	
	

}
