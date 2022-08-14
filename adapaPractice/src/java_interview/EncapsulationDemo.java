package java_interview;


class Student{
//Encapsulation-> Binding the data with methods is called encapsulation	
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
