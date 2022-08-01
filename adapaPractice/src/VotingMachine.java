import java.util.Scanner;

public class VotingMachine {

	public static void main(String[] args) {

		// TODO 1: Declare variables for age and candidate

		int age;
		String[] candidate = { "Ram", "Shyam", "Ghanshyam" };

		// TODO 2: Get the inputs - age and candidate from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = input.nextInt();
		for (int i = 1; i <= candidate.length; i++) {

			System.out.println("Enter the candidaet");
			i = input.nextInt();

			// System.out.println(age + " " + candidate[i]);

			if (age >= 18 && i <= candidate.length) {

				System.out.println("You have voted for " + candidate[i] + ".");
			} else if (age < 18) {

				System.out.println("You are not eligible.");

			} else if (i > candidate.length) {

				System.out.println("Select valid candidate number.");
			}

		}
	}
}
//System.out.println("Select valid candidate number.");