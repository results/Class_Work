package pack.bank;

public class BankingApp {

	public static void main(String[] args) {
		//SavingsAccount savingsAccount  = new SavingsAccount(5, 500.00);
		SavingsAccount savingsAccount  = new SavingsAccount();
		savingsAccount.createAccount(5000);
		savingsAccount.addDeposit(500.00);
		savingsAccount.addWithdraw(50.00);

		
		
		//CheckingAccount checking  = new CheckingAccount(5, 5000.00);
		CheckingAccount checking  = new CheckingAccount();
		checking.createAccount(100000);
		checking.addDeposit(500.00);
		checking.printBalance();
		checking.addWithdraw(750.00);	
		checking.transfer(savingsAccount, 900);


	}

}
