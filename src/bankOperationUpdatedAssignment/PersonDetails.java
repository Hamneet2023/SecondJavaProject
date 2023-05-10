package bankOperationUpdatedAssignment;

public class PersonDetails {
	private String accountNo;
	private String name;
	private double balance;
	private int pin;
	private String onlineBankingPassword;

	public PersonDetails(String accountNo, String name, double balance, int pin, String onlineBankingPassword) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

	public void setOnlineBankingPassword(String onlineBankingPassword) {
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

}
