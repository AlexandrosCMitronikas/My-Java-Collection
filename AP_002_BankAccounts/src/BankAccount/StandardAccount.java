package BankAccount;

public class StandardAccount extends Account{
	
	private double interest;
	private boolean overdaftAllowance;
	private double interestOnOverdraft;
	
	public StandardAccount(String firstName, String lastName, double accountBalance, String accountNumber, double interest, boolean overdraftAllowance, double interestOnOverdraft) {
		super(firstName, lastName, accountBalance, accountNumber);
		this.interest=interest;
		this.interestOnOverdraft=interestOnOverdraft;
		this.overdaftAllowance=overdraftAllowance;
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

	public boolean isOverdaftAllowance() {
		return overdaftAllowance;
	}

	public void setOverdaftAllowance(boolean overdaftAllowance) {
		this.overdaftAllowance = overdaftAllowance;
	}

	public double getInterestOnOverdraft() {
		return interestOnOverdraft;
	}

	public void setInterestOnOverdraft(double interestOnOverdraft) {
		this.interestOnOverdraft = interestOnOverdraft;
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
		return String.format("%s\nInterest: %.2f\nOverdraft allowance: %b\nInterest on overdraft %.2f", super.toString(), getInterest(), isOverdaftAllowance(), getInterestOnOverdraft());
	}
}
