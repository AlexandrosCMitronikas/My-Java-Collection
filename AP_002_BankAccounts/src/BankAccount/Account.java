package BankAccount;

public abstract class Account {
	private String firstName;
	private String lastName;
	private String accountNumber;
	private double accountBalance;
	
	abstract public double calculateInterest();

	public Account(String firstName, String lastName, double accountBalance, String accountNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.accountBalance=accountBalance;
		this.accountNumber=accountNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
