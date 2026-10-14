package interview_prep_2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class NameEmployee {
	private int id;
	private String name;
	private String department;
	private double salary;

	public NameEmployee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "NameEmployee{id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + ", salary="
				+ salary + '}';
	}
}

public class Emp_SortBy_Name_06 {

	public static void main(String[] args) {

        List<NameEmployee> employees = Arrays.asList(
                new NameEmployee(1, "Rahul", "IT", 60000),
                new NameEmployee(2, "Priya", "HR", 45000),
                new NameEmployee(3, "Amit", "IT", 85000),
                new NameEmployee(4, "Sneha", "Finance", 70000),
                new NameEmployee(5, "Kiran", "HR", 65000),
                new NameEmployee(6, "Vijay", "Finance", 90000),
                new NameEmployee(7, "Anjali", "IT", 75000),
                new NameEmployee(8, "Rohit", "Marketing", 50000),
                new NameEmployee(9, "Pooja", "Marketing", 80000),
                new NameEmployee(10, "Arjun", "Finance", 90000)
            );

		/* department wise employees list */
        Map<String, List<NameEmployee>> names = employees.stream().collect(Collectors.groupingBy(NameEmployee::getDepartment));
        names.entrySet().stream().forEach(n -> System.out.println(n.getKey()+" : "+n.getValue()));
        names.forEach((dep,emp)->System.out.println(dep+" : "+emp.stream().map(NameEmployee::getName).collect(Collectors.joining(", "))));
       
		/* department wise highest salary */
        Map<String, Optional<NameEmployee>> hSalary = employees.stream().collect(Collectors.groupingBy(NameEmployee::getDepartment,
        		Collectors.maxBy(Comparator.comparingDouble(NameEmployee::getSalary))));
        hSalary.forEach((dep,emp)->System.out.println(dep+" "+emp.get()));
	}

}
