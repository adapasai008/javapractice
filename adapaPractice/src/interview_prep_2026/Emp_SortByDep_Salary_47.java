package interview_prep_2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Emp_SortByDep_Salary_47 {

	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(new Employee(101, "Sai", "IT", 56000),
										new Employee(102, "Keerthi", "HR", 76000),
										new Employee(103, "Adapa", "IT", 50000),
										new Employee(104, "Gopi", "FINANCE", 32000),
										new Employee(105, "Ram", "HR", 48000),
										new Employee(106, "Sunny", "FINANCE", 96000));
		
		emp.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary))
																				.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------------------------");
		
		/* same sorting but salary should be descending */
		emp.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Comparator.comparing(
				Employee::getSalary).reversed())).forEach(System.out::println);
	}

}
