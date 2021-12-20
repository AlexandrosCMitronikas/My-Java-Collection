package BankAccount;

public class ForeignCurrencyAccount extends Account{

	private String currency;
	private double interest;
	
	public ForeignCurrencyAccount(String firstName, String lastName, double accountBalance, String accountNumber, String currency, double interest) {
		super(firstName, lastName, accountBalance, accountNumber);
		
		this.currency=currency;
		this.interest=interest;
	}
	@Override
	public double calculateInterest() {
		return getInterest() * getAccountBalance();
	}
	
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Override
	public void setAccountNumber(String an) {
		boolean isCheck=true;
		
		if (an.length() !=12) {
			System.err.println("Wrong format");
			System.exit(1);
		}
		
		for (int i = 0; i < 12; i++) {
			if (i == 3 || i == 7) {
				if (an.charAt(i) != '-') {
					isCheck = false;
					break;
				}
			}else if (!Character.isDigit(an.charAt(i))){
				isCheck = false;
				break;
			}
		}
		
		if (isCheck == true) {
			super.setAccountNumber(an);
		}else {
			System.err.println("Wrong format");
			System.exit(1);
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s\nInterest: %.2f\nTax rate:%.2f", super.toString(), getInterest(), getCurrency());
	}

}
