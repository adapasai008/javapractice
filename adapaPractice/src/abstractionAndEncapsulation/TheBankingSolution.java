package abstractionAndEncapsulation;

import java.util.Scanner;

abstract class Homeloan {
	double amount;
	int time;



	abstract double simpleInterest();

	abstract double rateOfInterest();

	// Write your code here
}

class Bank1 extends Homeloan {

	Bank1(double amount, int time) {
		this.amount = amount;
		this.time = time;
	}

	// Write your code here

	double rateOfInterest() {

		return 7.2;
	}

	double simpleInterest() {

		if (amount <= 0 || time <= 0) {

			System.out.println("invalid Input");
			System.exit(0);
		}

		double simpleInterest = (amount * time * rateOfInterest()) / 100;
		return simpleInterest + amount;
	}

}

class Bank2 extends Homeloan {

	// Write your code here

	public Bank2(double amount, int time) {

		this.amount = amount;
		this.time = time;
	}

	double rateOfInterest() {

		return 8.1;
	}

	double simpleInterest() {

		// Write your code here
		if (amount <= 0 || time <= 0) {

			System.out.println("invalid input");
			System.exit(0);
		}

		double simpleInterest = (amount * time * rateOfInterest()) / 100;
		return simpleInterest + amount;
	}
}

public class TheBankingSolution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double amount = in.nextDouble();
		int time = in.nextInt();
		Homeloan obj1 = new Bank1(amount, time);
		Homeloan obj2 = new Bank2(amount, time);
		if (obj1.simpleInterest() < obj2.simpleInterest()) {
			System.out.println("File for a loan in Bank1");
			System.out.println(obj1.simpleInterest());
		} else {
			System.out.println("File for a loan in Bank2");
			System.out.println(obj2.simpleInterest());
		}

	}

}

//public Homeloan(double amount, int time) {
//super();
//this.amount = amount;
//this.time = time;
//}
