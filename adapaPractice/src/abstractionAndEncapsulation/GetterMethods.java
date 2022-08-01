package abstractionAndEncapsulation;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class GetterMethods {

	public static void main(String[] args) {

		Person person = new Person(null);
		person.setName("Ankit");
		System.out.println(person.getName());

	}

}
