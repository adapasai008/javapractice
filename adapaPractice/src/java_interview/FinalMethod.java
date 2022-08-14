package java_interview;

class A {

	//final methods cannot be overridden.
	final public void show() {

		System.out.println("In A");

	}

}

class B extends A {

	public void show() {// here it's showing error because it's a final method
		
		System.out.println("In B");
		
	}

}

public class FinalMethod {

	public static void main(String[] args) {

		B b = new B();
		b.show();
		
		
	}

}
