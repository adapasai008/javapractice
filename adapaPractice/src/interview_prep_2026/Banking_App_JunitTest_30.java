package interview_prep_2026;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Banking_App_JunitTest_30 {

	@Test
	void testGetBalance() {
		Account acc = new Account(1500);

		assertEquals(1500, acc.getBalance());
	}

	@Test
	void testWithdraw() {
		Account acc = new Account(1500);
		acc.withdraw(500);
		assertEquals(1000, acc.getBalance());
	}
	
	@Test
	void testDeposit() {
		Account acc = new Account(1500);
		acc.deposit(500);
		assertEquals(2000, acc.getBalance());
	}

}
