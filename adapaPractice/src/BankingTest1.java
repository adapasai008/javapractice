

abstract class HomeLoan {
	public HomeLoan() {
		System.out.println("House 1");
	}

	abstract void numbers();
}

class Bank extends HomeLoan {
	public Bank() {
		System.out.println("Bank1");
	}

	void numbers() {
		System.out.println("Rate of interest is 7.2");
	}
}

public class BankingTest1 {

	public static void main(String[] args) {

		HomeLoan obj = new Bank();
		obj.numbers();

	}

}

