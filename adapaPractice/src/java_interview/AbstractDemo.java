package java_interview;

//An abstract class must be declared with an abstract keyword.
//It can have abstract and non abstract methods.
//It cannot be instantiated.
//It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.
//Abstract class is used to provide common method implementation to all the subclasses or to provide default implementation.
//Abstraction is the process of hiding the implementation details and showing only functionality to the user.
abstract class BikeNew{
	
	BikeNew(){
		
		System.out.println("Bike is created");
	}
	abstract void run();// abstract method
	
	void changeGear() {//Non abstract method
		
		System.out.println("Gear changed...");
	}
	
}
class Honda extends BikeNew{
	
	void run(){
		
		System.out.println("Bike is running");
		
	}
	
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		BikeNew b = new Honda();//Here we can't initiate the Abstract class.
		b.run();
		b.changeGear();

	}

}
