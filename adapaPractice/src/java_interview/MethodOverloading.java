package java_interview;

class Adder {
	// two same methods
	static int add(int a, int b) {

		return a + b;

	}// here it's overloading the above method

	static double add(double a, double b, double c) {

		return a + b + c;

	}

}

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(Adder.add(10, 30));
		System.out.println(Adder.add(10, 30, 50));

	}

}
