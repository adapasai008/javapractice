package interview_prep_2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {
	private long Id;
	private String name;
	private String department;
	private long salary;

	public Employee(long id, String name, String department, long salary) {
		super();
		Id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}

public class Emp_Min_Max_Salary_20 {

	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(new Employee(101, "Sai", "IT", 56000),
										new Employee(102, "Keerthi", "HR", 76000),
										new Employee(103, "Adapa", "IT", 50000),
										new Employee(104, "Gopi", "FINANCE", 32000),
										new Employee(105, "Ram", "HR", 48000),
										new Employee(106, "Sunny", "FINANCE", 96000));
		
	//Optional<Employee> maxSalary = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
	//Optional<Employee> minSalary = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).findFirst();
	
	Optional<Employee> maxSalary = emp.stream().max(Comparator.comparing(Employee::getSalary));
	Optional<Employee> minSalary = emp.stream().min(Comparator.comparing(Employee::getSalary));
		
	System.out.println("Max Salary : Name = "+maxSalary.get().getName() +" Salary = "+maxSalary.get().getSalary());
	System.out.println("Min Salary : Name = "+minSalary.get().getName() +" Salary = "+minSalary.get().getSalary());
		
	}

}
