package java_interview;

//An abstract class must be declared with an abstract keyword.
//It can have abstract and non abstract methods.
//It cannot be instantiated.
//It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.
abstract class Bike{
	
	Bike(){
		
		System.out.println("Bike is created");
	}
	abstract void run();// abstract method
	
	void changeGear() {//Non abstract method
		
		System.out.println("Gear changed...");
	}
	
}
class Honda extends Bike{
	
	void run(){
		
		System.out.println("Bike is running");
		
	}
	
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Bike b = new Honda();//Here we can't initiate the Abstract class.
		b.run();
		b.changeGear();

	}

}
