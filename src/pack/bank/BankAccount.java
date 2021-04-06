package pack.bank;

import javax.swing.AbstractAction;

public abstract class BankAccount {
	
	private int accountID;
	private double currentBal;

	public int getAccountID() {
		return this.accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}


	public double getCurrentBal() {
		return this.currentBal;
	}


	public void setCurrentBal(double currentBal) {
		this.currentBal = currentBal;
	}
	
	public abstract void createAccount(double openingBal);
	
	public abstract void printBalance();
	
	public abstract void addDeposit(double toAdd);
	
	public abstract void addWithdraw(double toRemove);
	
	public abstract void transfer(BankAccount toAccount, double amt);
	
	protected abstract String getType();

}
