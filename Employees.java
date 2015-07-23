package Test;

public class Employees {
	private String employee;

	/**
	 * Create constructor
	 * 
	 * @param employee
	 */
	public Employees(String employee) {
		super();
		this.employee = employee;
	}

	/**
	 * Equals method.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employees other = (Employees) obj;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		return true;
	}

	/**
	 * To strinh method.
	 */
	@Override
	public String toString() {
		return "Employees:" + employee;
	}

}
