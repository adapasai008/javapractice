package interview_prep_2026;

class Account {

	private long balance;

	Account(long balance) {
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(long amount) {
		this.balance += amount;
	}

	public void withdraw(long amount) {
		this.balance -= amount;
	}

}

public class Banking_App_30 {

	public static void main(String[] args) {

		Account acc = new Account(1500);
		acc.withdraw(500);
		acc.deposit(5000);

		System.out.println("Total Balance = " + acc.getBalance());

	}

}
