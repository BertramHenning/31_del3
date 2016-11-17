package entity;

//Keeps track of a players coins
public class Account {

	private int coins;
	
	public Account() {
		coins = 1000;

	}

	public int getCoins() {
		return coins;
	}

	//Makes sure goldCoins can't drop below 0
	public void addCoins(int coins) {
		this.coins += coins;

		if (this.coins < 0) {
			this.coins = 0;			
			}
	
	}
}