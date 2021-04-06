package pack.bank;

import java.util.Random;

public class CheckingAccount extends BankAccount {
	
	private static final String TYPE = "Checking";
	
	@Override
	public String getType() {
		return TYPE;
	}
	
	public CheckingAccount() {
		
	}
	

	@Override
	public void addDeposit(double deposit) {
		this.setCurrentBal(this.getCurrentBal()+deposit);
		System.out.println(deposit+" sucessfully deposited to "+getType()+" account.");
	}
	
	@Override
	public void addWithdraw(double withdraw) {
		this.setCurrentBal(this.getCurrentBal()-withdraw);
		System.out.println(withdraw+" sucessfully withdrawn from "+getType()+" account.");
	}
	
	@Override
	public void createAccount(double openingBal) {
		this.setAccountID(new Random().nextInt(999999999));
		this.setCurrentBal(openingBal);
		System.out.println(getType()+" Account Created: #"+this.getAccountID()+" with bal "+this.getCurrentBal());
	}

	@Override
	public void printBalance() {
		System.out.println(getType()+" Account #"+this.getAccountID()+" with bal "+this.getCurrentBal());
	}

	@Override
	public void transfer(BankAccount toAccount,double amt) {
		this.setCurrentBal(this.getCurrentBal()-amt);
		toAccount.setCurrentBal(toAccount.getCurrentBal()+amt);
		System.out.println("Succesfully transferred "+amt+" from "+getType()+" to "+toAccount.getType()+" #"+toAccount.getAccountID()+"");
	}

	


}
