package entity;

/**
 * Keeps track of a list of players
 */
public class PlayerList {
	private int playerAmount;

	private Player[] list;

	public PlayerList(int playerAmount, String[] names) {
		this.playerAmount = playerAmount;
		list = new Player[playerAmount];
		for (int i = 0; i < playerAmount; i++) {
			list[i] = new Player(names[i]);
		}
	}

	/**
	 *Adds coins to a specific player
	 */
	public void addCoins(int player, int amount) {
		list[player].addCoins(amount);
	}
	
	/**
	 *Gets coins from a specific player
	 */
	public int getCoins(int player) {
		return list[player].getCoins();
	}
	
	/**
	 *Gets position from a specific player
	 */
	public int getPosition(int player) {
		return list[player].getPosition();
	}

	/**
	 *Moves a specific player
	 */
	public void movePosition(int player, int amount) {
		list[player].movePosition(amount);
	}
	
	/**
	 *Removes a player from the list and makes i shorter
	 */
	public void removePlayer(int player){
		Player[] newlist = new Player[playerAmount-1];
		int j = 0;
		for (int i = 0; i < playerAmount; i++){
			if (i != player){
				newlist[j] = list[i];
				j++;
			}
		}
		list = newlist;
		playerAmount--;
	}

	public int getPlayerAmount() {
		return playerAmount;
	}

	public void setPlayerAmount(int playerAmount) {
		this.playerAmount = playerAmount;
	}
	
	/**
	 *Gets diceSum from a specific player
	 */
	public int getDiceSum(int a){
		return list[a].getDiceSum();
	}
	
	/**
	 *Sets diceSum of a specific player
	 */
	public void setDiceSum(int player, int sum){
		list[player].setDiceSum(sum);
	}
	
	/**
	 *Gets name from a specific player
	 */
	public String getName(int a){
		return list[a].toString();
	}
	
	public Player getPlayer(int a){
		return list[a];
	}
}
