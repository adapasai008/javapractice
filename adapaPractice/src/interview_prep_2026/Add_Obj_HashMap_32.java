package interview_prep_2026;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
class HCL_Employee {

	private int id;
	private String name;
	private long salary;

	public HCL_Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "HCL_Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Add_Obj_HashMap_32 {

	public static void main(String[] args) {

		HCL_Employee emp1 = new HCL_Employee(101, "Adapa", 90000);
		HCL_Employee emp2 = new HCL_Employee(102, "Sai", 70000);
		HCL_Employee emp3 = new HCL_Employee(103, "Keerthi", 80000);

		Map<Integer, HCL_Employee> emps = new HashMap<Integer, HCL_Employee>();

		emps.put(emp1.getId(), emp1);
		emps.put(emp2.getId(), emp2);
		emps.put(emp3.getId(), emp3);

		for (Map.Entry<Integer, HCL_Employee> itr : emps.entrySet()) {
			System.out.println("Emp_Id = " + itr.getKey() + " " + itr.getValue());
		}

	}

}
