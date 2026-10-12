package interview_prep_2026;

/*@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String empName;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	// Getters and setters
}*/

/*@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String departmentName;

	@OneToMany(mappedBy = "department")
	private List<Employee> employees = new ArrayList<>();

	// Getters and setters
}*/

public class OneToMany_ManyToOne_Mapping_37 {

}
