package pack.bank;

public class BankingApp {

	public static void main(String[] args) {
		SavingsAccount savingsAccount  = new SavingsAccount(5, 500.00);
		System.out.println("Savings Opening : "+savingsAccount.getCurrentBal());
		savingsAccount.addDeposit(500.00);
		System.out.println("Savings Deposited: "+savingsAccount.getCurrentBal());
		savingsAccount.addWithdraw(50.00);
		System.out.println("Savings Withdraw: "+savingsAccount.getCurrentBal());
		
		
		CheckingAccount checking  = new CheckingAccount(5, 5000.00);
		System.out.println("Checking Opening : "+checking.getCurrentBal());
		checking.addDeposit(500.00);
		System.out.println("Checking Deposited: "+checking.getCurrentBal());
		checking.addWithdraw(750.00);
		System.out.println("Checking Withdraw: "+checking.getCurrentBal());
		
		checking.addFromSavings(savingsAccount, 900);
		System.out.println("Checking Withdraw from Savings: New Bal "+checking.getCurrentBal());
		System.out.println("Savings Balance: "+savingsAccount.getCurrentBal());

	}

}
