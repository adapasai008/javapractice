package java_interview;



//final class won't allows the inheritance
//final class cannot be extended.
//Often sensitive classes are made final to protect that class.
final class Bike {

	Bike(){
		
		System.out.println("Hi .....");
	}
	
}

class Tyres extends BikeNew {//Here it's showing the error while extending class A

}

public class FinalClass {

	public static void main(String[] args) {

		Bike bk = new Bike();
		
	}

}
