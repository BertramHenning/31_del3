package entity;

public class PlayerList {
	private int playerAmount;

	private Player[] list;

	public PlayerList(int playerAmount, String[] names) {
		this.playerAmount = playerAmount;
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

	public int getCurrent(int player) {
		return list[player].getCurrent();
	}

	public void setCurrent(int player, int current) {
		list[player].setCurrent(current);;
	}
	
	public boolean checkWin(int player){
		return playerAmount == 1;
	}
	
	public void removePlayer(int player){
		
	}
}
