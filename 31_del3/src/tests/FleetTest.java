package tests;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Field;
import entity.Fleet;
import entity.Player;
import entity.Refuge;

public class FleetTest {

	private Player p1, p2;
	private Field fleet1, fleet2, fleet3, fleet4;
	
	
	@Before
	public void setUp() throws Exception {
		this.p1 = new Player("Bent");
		this.p2 = new Player("Lars");
		this.p1.movePosition(4);
		this.p2.movePosition(4);
		this.fleet1 = new Fleet(4000);
		this.fleet2 = new Fleet(4000);
		this.fleet3 = new Fleet(4000);
		this.fleet4 = new Fleet(4000);
		
	}

	@After
	public void tearDown() throws Exception {
		this.p1 = new Player("Bent");
	    this.p2 = new Player("Lars");
	}

	@Test
	public void testOneFleet() {
	fleet1.landOnField(p1);
	fleet1.landOnField(p2);
	int expected = 29500;
	int actual = p2.getCoins();
	assertEquals(expected, actual);
	}
	
	@Test
	public void testTwoFleets() {
	fleet1.landOnField(p1);
	fleet2.landOnField(p1);
	fleet2.landOnField(p2);
	int expected = 29000;
	int actual = p2.getCoins();
	assertEquals(expected, actual);
	}
	
	@Test
	public void testThreeFleets() {
	fleet1.landOnField(p1);
	fleet2.landOnField(p1);
	fleet3.landOnField(p1);
	fleet3.landOnField(p2);
	int expected = 28000;
	int actual = p2.getCoins();
	assertEquals(expected, actual);
	}
	
	@Test
	public void testFourFleets() {
	fleet1.landOnField(p1);
	fleet2.landOnField(p1);
	fleet3.landOnField(p1);
	fleet4.landOnField(p1);
	fleet3.landOnField(p2);
	int expected = 26000;
	int actual = p2.getCoins();
	assertEquals(expected, actual);
	}
	
	

}
