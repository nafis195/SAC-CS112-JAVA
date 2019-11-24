public class EmployeeClass extends Object {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;

	public EmployeeClass(String first, String last, String ssn, double sales, double rate,double salary) {
		// implicit call to Object constructor occurs here
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales(sales);
		setCommissionRate(rate);
	}

	public void setFirstName(String first) {
		firstName = first;
	}

	public String getFirstName() {

		return firstName;

	}

	public void setLastName(String last) {
		lastName = last;
	}

	public String getLastName() {
		return lastName;

	}

	public void setSocialSecurityNumber(String ssn) {

	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setGrossSales(double sales) {
		if (sales >= 0.0) {
			grossSales = sales;
		} else {
			throw new IllegalArgumentException("Gross sales must be >=0.0");

		}
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setCommissionRate(double rate) {
		if (rate >= 0.0 && rate < 1.0) {
			commissionRate = rate;

		} else {
			throw new IllegalArgumentException("Commission rate must be >0.0 and < 1.0");
		}
	}

	public double earning() {
		return commissionRate * grossSales;

	}

	@Override
	public String toString() {
		return String.format("%s:%s %s %s\n%s %.2f\n%s: %.2f", "commission employee", firstName, lastName,
				"social security number", socialSecurityNumber, "gross sales", grossSales);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}