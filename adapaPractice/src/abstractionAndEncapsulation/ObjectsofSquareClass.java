package abstractionAndEncapsulation;

class Student1 {
	   public String name;
	  
	   public Student1(String n){
	       name = n;
	   }
	}

public class ObjectsofSquareClass {

	public static void main(String[] args) {


		Student1 s1 = new Student1("Ankit");
		
		System.out.println(s1.toString());

	}

}
