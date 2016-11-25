package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Field;
import entity.LaborCamp;
import entity.Player;

public class LaborCampTest {
	private Player p1, p2;
	private Field camp1, camp2;
	

	@Before
	public void setUp() throws Exception {
		p1 = new Player("test1");
		p2 = new Player("test2");
		camp1 = new LaborCamp(2500, 100);
		camp2 = new LaborCamp(2500, 100);
		p1.movePosition(9);
		p2.movePosition(9);
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
		p2 = null;
		
	}
	
	//Tests buying a labor camp
	@Test
	public void testLandOnFieldBuy() {
		camp1.landOnField(p1);
		int expected = 27500;
		int actual = p1.getCoins();
		assertEquals(expected, actual);
	}

	//Tests paying the owner of one field
	@Test
	public void testLandOnFieldOneOwned() {
		camp1.landOnField(p1);
		p2.setDiceSum(11);
		camp1.landOnField(p2);
		int expected = 28900;
		int actual = p2.getCoins();
		assertEquals(expected, actual);
	}

	//Tests paying the owner of two field
	@Test
	public void testLandOnFieldTwoOwned() {
		camp1.landOnField(p1);
		camp2.landOnField(p1);
		p2.setDiceSum(12);
		camp1.landOnField(p2);
		int expected = 27600;
		int actual = p2.getCoins();
		assertEquals(expected, actual);
	}

}
