package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Player;
import entity.Tax;

public class TaxTest {
	private Player player;
	private Tax tax;
	private Tax tax2;
	
	@Before
	public void setUp() throws Exception {
		this.player = new Player("Mads");
		this.tax = new Tax(2000);
		this.tax2 = new Tax(4000);
		this.player.movePosition(6);
	}

	@After
	public void tearDown() throws Exception {
		this.player = new Player("Mads");
		this.player.movePosition(0);
	}

	// Testing normal Tax
	@Test
	public void Goldmine() {
		tax.landOnField(player);
		int expected = 28000;
		int actual = player.getCoins();
		
		assertEquals(expected, actual);
		
	}

	// Testing the choice of 10% of assets
	@Test 
	public void Caravan() {
		tax2.landOnField(player);
		this.player.movePosition(16);
		int expected = 27000;
		int actual = player.getCoins();
		
		assertEquals(expected, actual);		
	}
	
}
