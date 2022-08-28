package java_interview;

class Desgine{
	
	//Early Instantiation
	//So instance of the class is created at the time of class loading.
	static Desgine obj = new Desgine();
	
	private Desgine() {
		
	}
	public static Desgine getInstance() {
		
		return obj;
	}
	
}

public class SingletonEarlyDemo {

	public static void main(String[] args) {
	

		Desgine desgine = Desgine.getInstance();
	}

}
