package java_interview;

class Student1 {

	int rollNo;
	String name;
	//The static variable can be used to refer to the common property of all objects
	static String college;

	public Student1(int r, String n, String c) {
		rollNo = r;
		name = n;
		college = c;
	}

	public void show() {

		System.out.println(rollNo + ":" + name + ":" + college);

	}

}

public class StaticVariable {

	public static void main(String[] args) {

		Student1 st1 = new Student1(5,"Adapa","virtusa");
		Student1 st2 = new Student1(8,"Sai","ITC");
		
		//Here it will print the same college value for both st1 and st2 as ITC.
		st1.show();
		st2.show();
		

	}

}
