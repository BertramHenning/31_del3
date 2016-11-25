package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Player;
import entity.Territory;

public class TerritoryTest {
	private Player p1;
	private Player p2;
	private Territory territory1,territory2,territory3;

	@Before
	public void setUp() throws Exception {
		this.p1 = new Player("Lars");
		this.p2 = new Player("Kari");
		this.territory1 = new Territory(1000,100);
		this.territory2 = new Territory(1500,300);
		this.territory3 = new Territory(2000,500);
		
		
	}

	@After
	public void tearDown() throws Exception {
		this.p1 = new Player("Lars");
		this.p2 = new Player("Kari");
		
	}
	//tests if a player loses coins when the player lands on and unowned field.
	@Test
	public void testNoBuyTerritory() {
		this.p1.movePosition(1);
		int expected = 30000;
		this.territory1.landOnField(this.p1);
		int actual = this.p1.getCoins();
		assertEquals(expected,actual);
		
	}
	//Test if a player loses the correct amount of coins when he/her buys a field.
	@Test
	public void testBuyTerritory() {
		this.p1.movePosition(2);
		int expected = 30000 - 1500;
		this.territory2.landOnField(this.p1);
		int actual = this.p1.getCoins();
		assertEquals(expected,actual);
		
	}
	//Test if a player pays rent to the owner of the field. 
	@Test
	public void testOwnedTerritory() {
		this.p1.movePosition(3);
		this.territory3.landOnField(this.p1);
		this.p2.movePosition(3);
		this.territory3.landOnField(this.p2);
		int expected = 30000 - 500;
		int actual = this.p2.getCoins();
		assertEquals(expected,actual);
		expected = 28500;
		actual = this.p1.getCoins();
		assertEquals(expected,actual);
		
	}

}
