package java_8_Interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employees {

	private String name;
	private int age;
	private String gender;
	private String department;
	private Double salary;

	public Employees(String name, int age, String gender, String department, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department
				+ ", salary=" + salary + "]";
	}

}

public class StreamAPIEmployee {

	public static void main(String[] args) {

		List<Employees> employees = new ArrayList<Employees>();
		employees.add(new Employees("Adapa", 30, "Male", "IT",15000.00));
		employees.add(new Employees("Sai", 25, "Male", "HR",25000.00));
		employees.add(new Employees("Pallavi", 21, "Female", "IT",33000.00));
		employees.add(new Employees("Kumari", 24, "Female", "HR",23000.00));
		employees.add(new Employees("Naga", 25, "Male", "IT",45000.00));
		employees.add(new Employees("Kotesh", 28, "Male", "HR",23000.00));
		employees.add(new Employees("Naga", 25, "Male", "HR",23000.00));
		
//		//To find distinct departments.
//		employees.stream().map(Employees::getDepartment).distinct().forEach(System.out::println);
	
//		//To find total employees in each department. 
//		Map<String, Long> emp = employees.stream()
//				               .collect(Collectors.groupingBy(Employees::getDepartment,Collectors.counting()));
//		
//		System.out.println(emp);

//	    //To find the average age of the employees according to the gender
//		Map<String,Double> avgAge = employees.stream().
//				                    collect(Collectors.groupingBy
//				                    (Employees::getGender, Collectors.averagingDouble(Employees::getAge)));
//		System.out.println(avgAge);

//		//To find the male and female employees count.
//		Map<String,Long> MaleFemaleCount = employees.stream().collect(Collectors.groupingBy(Employees
//				                             ::getGender,Collectors.counting()));
//		System.out.println(MaleFemaleCount);

//		//To find the average salary based on gender.
//		Map<String, Double> avgSalary = employees.stream().collect(Collectors.groupingBy(Employees::getGender
//				                         ,Collectors.averagingDouble(Employees::getSalary)));
//		System.out.println(avgSalary);

//		//To sort the employees based on the age
//		List<Employees> ageSort = employees.stream().sorted(Comparator.comparing(Employees::getAge))
//				                  .collect(Collectors.toList());
//		ageSort.forEach(e -> System.out.println("Name : "+e.getName()+", Age : "+e.getAge()+", Department : "+e.getDepartment()));

//		//To find the employees department wise
//		Map<String, List<Employees>> depaEmp = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment));
//	
//		depaEmp.forEach((dep,emp) -> {
//			System.out.println("Department = "+ dep);
//			for(Employees e : emp) {
//				System.out.println(e);
//			}
//		});
		
//		//To find the highest salreird employee department wise
//		Map<String, Employees> highSalryDep = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment,
//				                              Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employees::
//				                               getSalary)), Optional::get)));
//		highSalryDep.forEach((dep,emp) -> {//to print the values as per convience
//			System.out.println("Department = "+ dep);
//			System.out.println(emp);
//		});
		
		//To group the employee by their age and no duplicate employees;
		Map<Integer, Set<Employees>> ageSort = employees.stream().collect(Collectors.groupingBy(Employees::getAge,Collectors.toSet()));
		ageSort.forEach((val,list) -> {
			System.out.println("age = "+val);
			for(Employees emp : list) {//should override the "hashconde" and "equlas"
				System.out.println("Name = "+emp.getName()+", "+"Age = "+emp.getAge());
			}
		});
		
	}

}
