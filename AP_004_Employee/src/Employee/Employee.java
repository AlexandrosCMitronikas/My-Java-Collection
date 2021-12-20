package Employee;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee (String firstN, String lastN, String ssn) {
		firstName=firstN;
		lastName=lastN;
		socialSecurityNumber=ssn;
	}
	
	public void setFirstName( String firstN ){
		firstName = firstN;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setlastName( String lastN) {
		lastName=lastN;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s\nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber() );
	}
	
	public abstract double earnings();
}
