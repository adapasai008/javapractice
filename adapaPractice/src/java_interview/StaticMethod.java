package java_interview;

class Student2 {

	int rollNo;
	String name;
	static String college = "Amazon";

	//A static method belongs to the class rather than the object of the class
	//A static method can be invoked with creating the instance of a class
	//A static method can access static data members (variables) and can change the value of it.
	
	static void change() {

		college = "Virtusa";

	}

	public Student2(int r, String n) {
		rollNo = r;
		name = n;
	}

	public void show() {

		System.out.println(rollNo + ":" + name + ":" + college);

	}

}

       //Restrictions for the static methods  
       //The static methods cannot use non-static data members or call non-static methods directly.
       //This and super cannot be used in static context.

public class StaticMethod {

	public static void main(String[] args) {

		Student2 st1 = new Student2(5, "Adapa");
		Student2 st2 = new Student2(8, "Sai");
		Student2.change();

		// Here it will print the same college value for both st1 and st2 as Virtusa.
		st1.show();
		st2.show();

	}

}
