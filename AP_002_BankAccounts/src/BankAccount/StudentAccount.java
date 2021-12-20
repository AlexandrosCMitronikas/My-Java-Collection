package BankAccount;

public class StudentAccount extends Account{
	
	private boolean overdraftAllowance;
	private boolean interestFreeOverdraft;
	public StudentAccount(String firstName, String lastName, double accountBalance, String accountNumber, boolean overdraftAllowance,boolean interestFreeOverdraft) {
		super(firstName, lastName, accountBalance, accountNumber);
		this.overdraftAllowance = overdraftAllowance;
		this.interestFreeOverdraft = interestFreeOverdraft;
	}
	
	public double calculateInterest() {
		return 0.00;
	}
	
	public boolean isOverdraftAllowance() {
		return overdraftAllowance;
	}
	public void setOverdraftAllowance(boolean overdraftAllowance) {
		this.overdraftAllowance = overdraftAllowance;
	}
	public boolean isInterestFreeOverdraft() {
		return interestFreeOverdraft;
	}
	public void setInterestFreeOverdraft(boolean interestFreeOverdraft) {
		this.interestFreeOverdraft = interestFreeOverdraft;
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
		return String.format("%s\nInterest: %.2f\nTax rate:%.2f", super.toString(), isOverdraftAllowance(), isInterestFreeOverdraft());
	}
}
