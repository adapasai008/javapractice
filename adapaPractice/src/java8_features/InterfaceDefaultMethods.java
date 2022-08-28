package java8_features;

interface Phone {

	void show();
	
	default void message() {//Default method this feature is introduced in java 8.
		
		System.out.println("Inside the message (Default message)");
	}

}

class OnePlus implements Phone {

	public void show() {

		System.out.println("Inside the show...");
	}

}

public class InterfaceDefaultMethods {

	public static void main(String[] args) {

		Phone ph = new OnePlus();
		ph.show();
		ph.message();

	}

}
