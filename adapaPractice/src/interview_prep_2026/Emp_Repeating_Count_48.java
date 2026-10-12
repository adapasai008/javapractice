package interview_prep_2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee_R {
    private int id;
    private String name;
    private String gender;

    public Employee_R(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}

public class Emp_Repeating_Count_48 {

	public static void main(String[] args) {

		List<Employee_R> empList = Arrays.asList(
			    new Employee_R(101, "Sai", "Male"),
			    new Employee_R(102, "Priya", "Female"),
			    new Employee_R(103, "Sai", "Male"),
			    new Employee_R(104, "Ravi", "Male"),
			    new Employee_R(105, "Priya", "Female"),
			    new Employee_R(106, "Sai", "Male"),
			    new Employee_R(107, "Keerthi", "Female"),
			    new Employee_R(108, "Ravi", "Male")
			);
		
		Map<String, Long> count = empList.stream().collect(Collectors.groupingBy(e -> e.getName() +" : "+e.getGender(),
																								Collectors.counting()));
		count.entrySet().stream().filter(emp -> emp.getValue() > 1).forEach(e -> System.out.println(e.getKey()+" : "+e.getValue()));
	}

}
