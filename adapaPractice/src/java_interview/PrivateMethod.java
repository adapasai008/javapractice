package java_interview;


class Car{
	//Private variable can be accessed only with in the class
	private String company = "BMW";
	
	//Private method also can only be accessed only with in the class not out side the class.
	private void show() {
		System.out.println(company);
		
	}	
}

public class PrivateMethod {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.show();
		
		
	}

}
