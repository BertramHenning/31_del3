package entity;

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

	public void addPoints(int player, int amount) {
		list[player].addPoints(amount);
	}

	public int getPoints(int player) {
		return list[player].getPoints();
	}

	public int getPosition(int player) {
		return list[player].getPosition();
	}

	public void movePosition(int player, int amount) {
		list[player].movePosition(amount);
	}
	
	public boolean checkWin(int player){
		return playerAmount == 1;
	}
	
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
	}

	public int getPlayerAmount() {
		return playerAmount;
	}

	public void setPlayerAmount(int playerAmount) {
		this.playerAmount = playerAmount;
	}
	
	public String getName(int a){
		return list[a].toString();
	}
	
	public Player getPlayer(int a){
		return list[a];
	}
}
