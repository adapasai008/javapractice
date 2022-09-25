package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employees {

	private String name;
	private int age;
	private String gender;
	private String department;

	public Employees(String name, int age, String gender, String department) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
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
		return "Employess [name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department + "]";
	}
}

public class StreamAPIEmployee {

	public static void main(String[] args) {

		List<Employees> employees = new ArrayList<Employees>();
		employees.add(new Employees("Adapa", 23, "Male", "IT"));
		employees.add(new Employees("Sai", 25, "Male", "HR"));
		employees.add(new Employees("Pallavi", 21, "Female", "IT"));
		employees.add(new Employees("Kumari", 24, "Female", "HR"));
		
		//To find distinct departments.
		employees.stream().map(Employees::getDepartment).distinct().forEach(System.out::println);
		
		//To find total employees in each department. 
		Map<String, Long> emp = employees.stream()
				               .collect(Collectors.groupingBy(Employees::getDepartment,Collectors.counting()));
		
		System.out.println(emp);
		
	    //To find the average age of the employees according to the gender
		Map<String,Double> avgAge = employees.stream().
				                    collect(Collectors.groupingBy
				                    (Employees::getGender, Collectors.averagingDouble(Employees::getAge)));
		System.out.println(avgAge);
		
		
	}

}
