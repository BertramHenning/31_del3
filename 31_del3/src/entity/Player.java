package entity;

/**
 *  Keeps track of a players assets
 */
public class Player {

	private int position = 0, laborcamps = 0, fleets = 0 , diceSum;
	private String name;

	private Account points;

	public Player(String a) {
		name = a;
		points = new Account();
	}
	
	/**
	 *  Adds score to Account object
	 */
	public void addCoins(int a) {
		points.addCoins(a);
	}

	/**
	 *  Gets score from Account object
	 */
	public int getCoins() {
		return points.getCoins();
	}

	public int getPosition() {
		return position;
	}

	/**
	 * Moves the player by an amount and wraps around if the player moves past the last field
	 */
	public void movePosition(int amount) {
		this.position += amount;
		if (this.position > 21){
			this.position = this.position - 21;
		}
		
	}

	public int getLaborcamps() {
		return laborcamps;
	}

	public void setLaborcamps(int laborcamps) {
		this.laborcamps = laborcamps;
	}

	public int getFleets() {
		return fleets;
	}

	public void setFleets(int fleets) {
		this.fleets = fleets;
	}

	public int getDiceSum() {
		return diceSum;
	}

	public void setDiceSum(int diceSum) {
		this.diceSum = diceSum;
	}

	public String toString() {
		return name;
	}

}