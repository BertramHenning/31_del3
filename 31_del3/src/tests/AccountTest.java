package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Account;


public class AccountTest {
	Account testAccount;

	@Before
	public void setUp() throws Exception {
		testAccount = new Account();
	}

	@After
	public void tearDown() throws Exception {
		testAccount = null;
	}

	@Test
	public void testAddCoins() {
		int expected = 20000;
		testAccount.addCoins(-5000);
		testAccount.addCoins(-3000);
		testAccount.addCoins(7000);
		testAccount.addCoins(-9000);
		int actual = testAccount.getCoins();
		assertEquals(expected, actual);
	}

	@Test
	public void testAccount() {
		int expected = 30000;
		int actual = testAccount.getCoins();
		assertEquals(expected, actual);		
	}

}
