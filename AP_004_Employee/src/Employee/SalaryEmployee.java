package Employee;

public class SalaryEmployee extends Employee{

	private double weeklySalary;
	
	public SalaryEmployee(String firstName, String lastName, String socialSecurityNumber, double salary) {
	super(firstName,lastName,socialSecurityNumber);
	setWeeklySalary( salary );
	}
	
	public void setWeeklySalary( double salary) {
		if (salary >= 0.0 )
			weeklySalary = salary;
		else
			System.err.println("Weekly salary must be over or equal to 0.0");
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	
	@Override
	public String toString() {
		return String.format("salaried employee: %s\n%s: $%,.2f", 
				super.toString(),"weekly salary", getWeeklySalary() );
	}
	
}
