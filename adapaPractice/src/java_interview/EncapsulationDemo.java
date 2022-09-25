package java_interview;


class Student{
/*Encapsulation in java is process of wrapping the code and data together into a single unit.

We can create a fully encapsulated class in java by making all the data members of the class private.
Now we can use getters and setters method to set and get the data in it.

Encapsulation-> Binding the data with methods is called encapsulation.

Java Bean class is the example of fully encapsulated class.
*/
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setName("Adapa Sai");
		st.setRollNo(21);
		
		System.out.println("Name of the studnet is "+st.getName()+" and the rollNo is "+st.getRollNo());

	}

}
