package java_interview;

class AgeLimitException extends Exception {

	public AgeLimitException(String str) {
		super(str);
	}
}

class Validate {

	static void validate(int age) throws AgeLimitException {

		if (age < 18) {

			throw new AgeLimitException("age should be grater than 18");
		} else {

			System.out.println("your are eligible");

		}
	}

}

public class UserDefinedException2 {

	public static void main(String[] args) {

		try {
			Validate.validate(12);
		} catch (AgeLimitException e) {
			System.out.println(e.getMessage());
		}

	}

}
