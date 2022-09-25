package java_interview;


//Interface is used to achieve abstraction.
//By interface, we can support the multiple inheritance.
//It can be used to achieve loose coupling.
interface Drawable{
	
	void draw();
	
	default void msg() {
		
		System.out.println("Default message");
		
	}	
}
interface Startrted{
	
	void start();
}
class Circle implements Startrted,Drawable{
	
	public void start(){
		System.out.println("Drawing started...");
	}
	public void draw(){
		System.out.println("Circle has been drawn");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.start();
		c.draw();
		c.msg();
		

	}

}
