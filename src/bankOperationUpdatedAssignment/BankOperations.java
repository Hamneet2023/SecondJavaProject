package bankOperationUpdatedAssignment;
public abstract class BankOperations {
	public abstract void changePinPassword(PersonDetails account);
	public void withdrawMoney(PersonDetails account,double  moneyToBeWithdrawn) {
		if ( moneyToBeWithdrawn < account.getBalance()) {
			System.out.println("Please collect your money : " + moneyToBeWithdrawn);
			account.setBalance( account.getBalance() - moneyToBeWithdrawn);
		}
	}

	public void depositMoney(PersonDetails account,double  moneyToBeDeposit) {
		account.setBalance(account.getBalance()+moneyToBeDeposit);
	}

	public void viewBalance(PersonDetails account) {
		System.out.println(account.getBalance());
		account.setBalance(account.getBalance());
	}
}
