package abstractionAndEncapsulation;

class Employee {

	private int empId;
	private String empFirstName;
	private String empSecondName;
	private double empSalary;

	public Employee(int empId, String empFirstName, String empSecondName, double empSalary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empSecondName = empSecondName;
		this.empSalary = empSalary;

//		System.out.println("employee full name "+empFirstName+" "+empSecondName);
//		System.out.println("employee annual package "+empSalary);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpSecondName() {
		return empSecondName;
	}

	public void setEmpSecondName(String empSecondName) {
		this.empSecondName = empSecondName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}

public class EmployeeDetails {

	public static void main(String[] args) {

		Employee E1 = new Employee(101512031, "Sushil", "Kumar", 45000.58);
		Employee E2 = new Employee(101512032, "Tara", "Sharma", 51000.99);
		System.out.println("employee full name " + E1.getEmpFirstName() + " " + E1.getEmpSecondName());
		System.out.println("employee annual package " + (12 * E1.getEmpSalary()));
		System.out.println("employee full name " + E2.getEmpFirstName() + " " + E2.getEmpSecondName());
		System.out.println("employee annual package " + (12 * E2.getEmpSalary()));
	}

}
