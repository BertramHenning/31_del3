package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Field;
import entity.Player;
import entity.Refuge;


public class RefugeTest {
	private Player p1;
	private Field refuge500;
	private Field refuge0;
	private Field refugeNeg100;
	
	@Before
	public void setUp() throws Exception {
		this.p1 = new Player("Lars");
		this.p1.movePosition(11);
		this.refuge500 = new Refuge(500);
		this.refuge0 = new Refuge(0);
		this.refugeNeg100 = new Refuge(-100);
		this.p1.movePosition(11);
	}
	
	@After
	public void tearDown() throws Exception {
		this.p1 = new Player("Lars");
	
	}
	//Tests if a player gets 500 coins if the player lands on a refuge field which grants 500. 
	@Test
	public void testLandOnField500() {
		
		int expected = 30000;
		int actual = this.p1.getCoins();
		assertEquals(expected,actual);
		
		this.refuge500.landOnField(this.p1);
		expected = 30000 + 500;
		actual = this.p1.getCoins();
		assertEquals(expected,actual);

	}
	//Tests if a player gets 1000 coins if he lands on a refuge field which grant 500 coins.
	@Test
	public void testLandOnField500twice() {
		
		int expected = 30000;
		int actual = this.p1.getCoins();
		assertEquals(expected,actual);
		
		this.refuge500.landOnField(this.p1);
		this.refuge500.landOnField(this.p1);
		expected = 30000 + 500 + 500;
		actual = this.p1.getCoins();
		assertEquals(expected,actual);

	}
	//Tests if a player get zero coins if the player lands on a refuge field which grant 0 coins.
	@Test
	public void testLandOnField0() {
		
		int expected = 30000;
		int actual = this.p1.getCoins();
		assertEquals(expected,actual);
		
		this.refuge0.landOnField(this.p1);
		expected = 30000;
		actual = this.p1.getCoins();
		assertEquals(expected,actual);
	
	
	
	}
	//Tests if a player get zero coins if the player lands on a refuge field which grant 0 coins twice.
	@Test
	public void testLandOnField0twice() {
		
		int expected = 30000;
		int actual = this.p1.getCoins();
		assertEquals(expected,actual);
		
		this.refuge0.landOnField(this.p1);
		this.refuge0.landOnField(this.p1);
		expected = 30000;
		actual = this.p1.getCoins();
		assertEquals(expected,actual);
	
	
	
	}
	//tests if the player looses 100 coins if the players lands on a refuge field which takes 100 coins.
	@Test
	public void testLandOnFieldNeg100() {
		
		int expected = 30000;
		int actual = this.p1.getCoins();
		assertEquals(expected,actual);
		
		this.refugeNeg100.landOnField(this.p1);
		expected = 30000 - 100;
		actual = this.p1.getCoins();
		assertEquals(expected,actual);
	}
	//tests if the player looses 100 coins if the players lands on a refuge field which takes 100 coins twice.
	@Test
	public void testLandOnFieldNeg100Twice() {
		
		int expected = 30000;
		int actual = this.p1.getCoins();
		assertEquals(expected,actual);
		
		this.refugeNeg100.landOnField(this.p1);
		this.refugeNeg100.landOnField(this.p1);
		expected = 30000 - 100 - 100;
		actual = this.p1.getCoins();
		assertEquals(expected,actual);
	}
}
