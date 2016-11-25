package entity;

/**
 * Keeps track of Dice objects
 */
public class DiceCup {
	private Dice[] cup;
	
	/**
	 * Creates an amount of Dice in a Array
	 */
	public DiceCup(int amount) {
		cup = new Dice[amount];
		for (int i = 0; i < cup.length; i++) {
			cup[i] = new Dice();
		}
	}

	/**
	 * Rolls all Dice in the array
	 */
	public void rollDice() {
		for (int i = 0; i < cup.length; i++) {
			cup[i].roll();
		}
	}
	
	/**
	 * Gets the sum of all the Dice in the array
	 */
	public int getSum() {
		int sum = 0;
		for (int i = 0; i < cup.length; i++) {
			sum += cup[i].getValue();
		}
		return sum;
	}
	
	/**
	 * Gets the value of a specific dice
	 */
	public int getFaceValue(int a) {
		return cup[a].getValue();
	}
}
