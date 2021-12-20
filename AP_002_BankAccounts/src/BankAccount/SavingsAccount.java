package BankAccount;

public class SavingsAccount extends Account{
	
	private double interest;
	private double taxRate;
	public SavingsAccount(String firstName, String lastName, double accountBalance, String accountNumber, double interest, double taxRate) {
		super(firstName, lastName, accountBalance, accountNumber);
		this.interest=interest;
		this.taxRate=taxRate;
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
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
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
		return String.format("%s\nInterest: %.2f\nTax rate:%.2f", super.toString(), getInterest(), getTaxRate());
	}
}
