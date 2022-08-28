package java8_features;

interface Car {

	void status();

}
interface Store{
	
	int TotalCars(int a, int b);
	
}

public class LambdaExpressions {

	public static void main(String[] args) {

		//Lambda expression provides the implementation for the functional interface.
		//Less coding
		Car obj = () -> {
			System.out.println("it's running");
		};
		obj.status();
		
		//lambda expression with return keyword.
		Store stor = (a,b)->{
			
			return a+b;
		};
		
		System.out.println("Total Cars in the store = "+stor.TotalCars(6,2));
		
		//lambda expression with-out return keyword.
		Store stor1 = (a,b)->(a+b);
		
		System.out.println("Total cars in stor2 = "+stor1.TotalCars(30, 10));
	}

}
